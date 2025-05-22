package day26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("(//button[contains(text(),'click')])[1]")).click();
		
		// Get set of windows
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		// Convert Set to List
		
		List<String> windows = new ArrayList<String>(windowHandles);
		
		// Pick up the particular window and switch to it
		
		driver.switchTo().window(windows.get(1));
		
		// get the title to  validate the switch
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.switchTo().window(windows.get(0));
		//driver.close();
		
		
		
		
	}

}
