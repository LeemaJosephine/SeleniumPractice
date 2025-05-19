package day23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SauceDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[contains(@class,'submit-button')]")).click();
		
		// Validate the list of items in the product page
		List<WebElement> itemList = driver.findElements(By.xpath("//div[@class='inventory_item']"));
		int actualSize = itemList.size();
		int expectedSize=6;
		
		if(actualSize==expectedSize) {
			
			System.out.println("All 6 items are present");
		} else {
			
			System.out.println("Issue");
		}
		
		// Take the products available in the website check for the product name and choose the right product
		String expectedItem="Sauce Labs Backpack";
		List<WebElement> productList = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
	
		for(WebElement product : productList) {
			
			String productName=product.getText();
			if(productName.equals(expectedItem)) {
				
				product.click();
				break;
			}
		}
	}

}
