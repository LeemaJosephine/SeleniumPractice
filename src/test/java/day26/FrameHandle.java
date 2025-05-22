package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// switch to frame
		
		// By index
		
//		driver.switchTo().frame(1);
//		driver.findElement(By.tagName("input")).sendKeys("Testuser");
		
		// By String (id/name)
		
//		driver.switchTo().frame("singleframe");
//		driver.findElement(By.tagName("input")).sendKeys("Testuser");
		
		
		
		// By WebElement
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
		
		driver.switchTo().frame(frameElement);
		driver.findElement(By.tagName("input")).sendKeys("Testuser");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		
	}

}
