package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement comp = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(comp).perform();
		
		// scroll to element using moveToElement
		WebElement contact = driver.findElement(By.xpath("//a[text()=' Contact Us ']"));
		//act.moveToElement(contact).perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		//scroll upto given element
		js.executeScript("arguments[0].scrollIntoView(true);", contact);

	}

}
