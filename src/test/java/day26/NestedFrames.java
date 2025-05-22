package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		// switching to the parent frame
		driver.switchTo().frame(2);
		
		// switch to the child frame
		driver.switchTo().frame(0);
		
		driver.findElement(By.tagName("input")).sendKeys("demotest");
		
		// Switch from child to default
		
//		driver.switchTo().defaultContent();
//		driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
		
		// switch from child to parent
		
		driver.switchTo().parentFrame();
		
		String text = driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
		System.out.println(text);
		
		// switch from parent to default
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
		
	}

}
