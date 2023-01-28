package CloudTesting;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsTest {

	public static final String USERNAME = "rahul2";

	public static final String ACCESS_KEY = "xxxxx";

	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {

		// TODO Auto-generated method stub

		//You can learn more about Sauce labs Selenium from below link
		//https://saucelabs.com/products/open-source-frameworks
		DesiredCapabilities caps = DesiredCapabilities.Chrome();

		caps.setCapability("platform", "Windows 7");

		caps.setCapability("version", "51.0");

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

		driver.get("http://google.com");

		System.out.println(driver.getTitle());

	}

}
