package MustKnowJavaConcepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.util.Assert;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//String urlLink = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		List<WebElement> urlLink = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		for (WebElement link : urlLink) {
			String tt = link.getAttribute("href");
			URL url = new URL(tt);
			
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.connect();
			if (connection.getResponseCode() > 400) {
				System.out.println(link.getText());
			}
		}
		

	}

	
}
