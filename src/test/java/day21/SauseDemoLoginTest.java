package day21;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauseDemoLoginTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Step1: Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Step2: Load the url
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(10000);
		//Step3: Maximize the window
		driver.manage().window().maximize();
		
		//Step4: Add base wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		//Step4: Find and work with
		
		// To find the username
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		username.clear();
		
		username.sendKeys("problem_user");
		
	
		System.out.println(username.getAttribute("data-test"));
		
		//To find the password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

//		//To find login
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		
		//Validate the login
		WebElement loginValid = driver.findElement(By.className("app_logo"));
	
		// Check whether the element is present
		boolean flag =loginValid.isDisplayed();
		System.out.println(flag);
		
		String expectedText="Swag Labs";
		if(flag) {
			String eleText = loginValid.getText();
			System.out.println(eleText);
			
			if(expectedText.equals(eleText)) {
				System.out.println("Login sucessful!!");
			} else {
				System.out.println("Check the element text");
			}
			
		} else {
			System.out.println("Login failed");
		}
		
		System.out.println(loginValid.getLocation());
			
		System.out.println(loginValid.getTagName());
		
		
		
	}

}
