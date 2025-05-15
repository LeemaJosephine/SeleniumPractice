package day21;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 1: Launch the browser
		WebDriver driver = new EdgeDriver();
		
		String url="https://www.spicejet.com/";
		
		//Step2: Load the url
		driver.get(url);
		
		//Step3: Maximize window
		driver.manage().window().maximize();
		
		// To get the webpage title
		
		String title = driver.getTitle();
		System.out.println("The page title is: "+title);
		
		//To get the current url
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The current url is: "+currentUrl);
		
		//To get the page source
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		//To demonstrate close and quit
		
		// browser navigate methods
		driver.navigate().back();  // 
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to(currentUrl);
		
		
		//Step4: Close browser
		driver.quit();
		
		
	}

}
