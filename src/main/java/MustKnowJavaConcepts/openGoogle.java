package MustKnowJavaConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class openGoogle {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentSparkReporter reporter = new ExtentSparkReporter("report1.html");
		ExtentReports extentReports = new ExtentReports();
		extentReports.attachReporter(reporter);
		ExtentTest test = extentReports.createTest("Whatsup Duck");
		
		//System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");
		driver.findElement(By.name("q")).sendKeys("Whatsup Duck!");
		driver.findElement(By.name("q")).submit();
		test.pass("Test Passed");
		driver.quit();
		extentReports.flush();
		
	}
}
