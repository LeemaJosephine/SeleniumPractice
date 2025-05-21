package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		List<WebElement> visibleOption = driver.findElements(By.xpath("//label[@class='form-check-label']"));
	
		String expectedText="Yes";
		
		for(WebElement ele : visibleOption) {
				
			String actualText = ele.getText();
			
			if(actualText.equals(expectedText)) {
				
				WebElement radioButton = driver.findElement(By.xpath("//label[text()='"+actualText+"']/preceding-sibling::input"));
				
				if(radioButton.isEnabled()) {
				radioButton.click();
				} else {
					System.out.println("Button disabled");
				}
				
				if(radioButton.isSelected()) {
					System.out.println("Value selected");
				} else {
					System.out.println("Value not selected");
				}
				
			} 
		}
	}

}
