package day25;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Links {

	public static void verifyLink(String url,String text)  {
	
	try {
		URL link = new URL(url);
		HttpURLConnection httpConnection = (HttpURLConnection) link.openConnection();
		httpConnection.connect();
		
		if(httpConnection.getResponseCode()==200) {
			
			System.out.println("Valid Url -> " + text+" "+ httpConnection.getResponseMessage());
		} else {
			
			System.out.println("Invalid url, please check. " + text);
		}
	}  catch(Exception e) {
			
			System.out.println("MalformedURL " + text);
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		String url ="https://www.google.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		verifyLink(url,"Parent Link");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement link : links ) {
			
			String linkUrl = link.getAttribute("href");
			String text = link.getText();
			
			verifyLink(linkUrl,text);
		}
		
	
	}

}
