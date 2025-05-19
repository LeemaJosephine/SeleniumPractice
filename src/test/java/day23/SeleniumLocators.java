package day23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//driver.findElement(By.id("APjFqb")).sendKeys("Selenium Webdriver", Keys.ENTER);
		//driver.findElement(By.className("gLFyf")).sendKeys("Selenium webdriver");
		//driver.findElement(By.name("q")).sendKeys("Selenium webdriver");
		
		
		//driver.findElement(By.linkText("Advertising")).click();
		
		//driver.findElement(By.partialLinkText("How Search")).click();
		
		// Find the no.of links in the webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		// Print the each links text  Output should be in the format text -> link 
		for(WebElement link : links) {
			
			String linkText = link.getText();
			String actualLink = link.getAttribute("href");
			System.out.println(linkText+"->"+actualLink);
		}
		
		
		
	}

}
