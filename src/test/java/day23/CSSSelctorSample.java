package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelctorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://bstackdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// CSS selector using id attribute 
		//driver.findElement(By.cssSelector("a#offers")).click();
		
		// CSS Selector combining attributes
		WebElement offers = driver.findElement(By.cssSelector("a[id='offers'][href='/offers']"));
		System.out.println(offers.isDisplayed());
		
		// CSS Selector using class attribute
		WebElement logo = driver.findElement(By.cssSelector("a.Navbar_logo__26S5Y"));
		System.out.println(logo.isDisplayed());
		
		// CSS selector using other attribute
		driver.findElement(By.cssSelector("span[role='link']")).click();
	}

}
