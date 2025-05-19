package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.get("https://bstackdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Attribute based xpath
		WebElement offer = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/a[3]"));
		System.out.println(offer.isDisplayed());
		
		// Text based xpath
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		
		// Contains and Collection based xpath
		WebElement username = driver.findElement(By.xpath("(//div[contains(@class,'indicatorContainer')])[1]"));
		username.click();
		
		driver.findElement(By.xpath("//div[text()='demouser']")).click();
	}

}

