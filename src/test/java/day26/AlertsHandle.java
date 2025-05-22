package day26;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Simple Alert
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'display an  alert box')]")).click();
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		
		
		// Confirm Alert
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		
		Alert confirm = driver.switchTo().alert();
		confirm.accept();
		
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);
		
		// Prompt alert
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Demouser");
		prompt.accept();
		
		String text2 = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		System.out.println(text2);
	}

}
