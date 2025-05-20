package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Actions mouse = new Actions(driver);
		
		WebElement ele = driver.findElement(By.id("rightClickBtn"));
		mouse.contextClick(ele).perform();
		
		WebElement doubleEle = driver.findElement(By.id("doubleClickBtn"));
		mouse.doubleClick(doubleEle).perform();
		
		
	}

}
