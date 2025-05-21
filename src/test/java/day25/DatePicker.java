package day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String expectedMonth ="August 2025";
		String date ="1";
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Open the calendar
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		while(true) {
		String actualMonth = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText();
		
		if(expectedMonth.equals(actualMonth)) {
			
			break;
		} else {
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		
		}
		
		driver.findElement(By.xpath("//p[text()='"+date+"']")).click();
	}

}
