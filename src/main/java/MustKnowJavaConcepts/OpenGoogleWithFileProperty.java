package MustKnowJavaConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleWithFileProperty {
	public static void main(String[] args) throws IOException {
		//1.chrome lunch
		//2. google.co.in
		WebDriver driver = new ChromeDriver();
		FileInputStream stream = new FileInputStream("config.properties");
		Properties property = new Properties();
		property.load(stream);
		
		String browser = property.getProperty("browser");
		String driverLocation=property.getProperty("driverLocation");
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			driver = new ChromeDriver();
		} else {
			System.out.println("Launch from otehr browsers");
		}
		
		driver.get("http:google.co.in");
		driver.quit();
		
	}
}
