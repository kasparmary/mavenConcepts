package WebDriverManagerDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerExample {

//	How  web driver manager works?
//	1. Web driver manager checks the browser version installed on your machine
//	2. Finds the matching web driver as per our browser version
//	3. Checks if the driver is already present in our system
//	4. If yes, it does nothing, if not it downloads and sets the environmental path
//	
//	In this video, we will learn how to use web driver manager and automatically download the browser driver as per our browser version without having to do anything.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();*/
		
		//Firefox
		WebDriverManager.firefoxdriver().avoidBrowserDetection().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		//Opera
//		WebDriverManager.operadriver().setup();
//		@SuppressWarnings("deprecation")
//		WebDriver driver = new OperaDriver();
//		driver.get("https://www.google.com");
	}

}
