package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame(0);
	
		List<WebElement> options = driver.findElements(By.xpath("//legend[text()='Hotel Ratings: ']/following-sibling::label"));
		
		String expectedText="3 Star";
		
		//Actions act = new Actions(driver);
		
		for(WebElement ele : options) {
			
			String actualText = ele.getText();
			if(actualText.equalsIgnoreCase(expectedText)) {
				
				ele.click();
				ele.click();
				break;
			}
		}
		
		
		
	}

}
