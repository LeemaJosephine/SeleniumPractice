package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HTMLTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.w3schools.com/tags/ref_httpmessages.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> rows = driver.findElements(By.xpath("(//table[@class='ws-table-all notranslate'])[1]//tr"));
		List<WebElement> cols = driver.findElements(By.xpath("(//table[@class='ws-table-all notranslate'])[1]//th"));
		
		int row_size = rows.size();
		int cols_size = cols.size();
		
		for(int i=1 ; i<=row_size; i++) {
			
			for(int j=1; j<=cols_size; j++) {
				
				if(i == 1) {
					String value =driver.findElement(By.xpath("(//table)[1]//tr["+i+"]//th["+j+"]")).getText();
					System.out.print(value+" ");
				} else if (i > 1) {
				String value =driver.findElement(By.xpath("(//table)[1]//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(value+" ");
				}
			}
			System.out.println();
		}
		
		//String text = driver.findElement(By.xpath("(//table)[1]//tr[4]//td[1]")).getText();
		// (//table[@class='ws-table-all notranslate'])[1]//tr[4]//td[1]
		//System.out.println(text);
		
	}

}
