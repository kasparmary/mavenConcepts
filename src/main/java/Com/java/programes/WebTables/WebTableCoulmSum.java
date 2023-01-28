package Com.java.programes.WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableCoulmSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		int rowCnt = driver.findElements(By.xpath("//table[@id='product'][@name='courses']//tr")).size();
		int colCnt = driver.findElements(By.xpath("//table[@id='product'][@name='courses']//th")).size();
		
		System.out.println("row count: " + rowCnt + "--------" + "Column count: " + colCnt);
		List<WebElement> rr = driver.findElements(By.xpath("//table[@id='product'][@name='courses']//tr[3]//td"));
		
		for (WebElement webElement : rr) {
			System.out.println(webElement.getText());
			
		}
	}

}
