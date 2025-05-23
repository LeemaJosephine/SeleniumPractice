package day27;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("http://uitestingplayground.com/ajax");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		WebElement btnclick = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		btnclick.click();
		
//		// Step 1: Set the time Duration
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		
//		// Step2: Set the condition to wait
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='bg-success']")));
//				
//		String text = driver.findElement(By.xpath("//p[@class='bg-success']")).getText();
//		System.out.println(text);
		
		// Fluent wait
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15)) // set the duration
				.pollingEvery(Duration.ofMillis(100)) // customize the interval
				.withMessage("Increase the wait time")
				.ignoring(NoSuchElementException.class);  // to ignore any specific expection
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='bg-success']")));
		
		String text = driver.findElement(By.xpath("//p[@class='bg-success']")).getText();
		System.out.println(text);
		
		
		// Take screenshot
		
		// Capture the screenshot
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// Mnetion the target path
		
		File dest = new File("C:\\Users\\Digital Suppliers\\second-workspace\\SeleniumPractice\\screenshots\\sample.png");
		
		// saving the captured screenshot in the mentioned location
		FileUtils.copyFile(source, dest);
		
	}

}
