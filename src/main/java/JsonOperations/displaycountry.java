package JsonOperations;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class displaycountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//Way1 : print country column values
		List<WebElement> countryList = driver.findElements(By.xpath("//*[@id='customers']//tr//td[3]"));
		System.out.println(countryList.size());
		
		for (WebElement webElement : countryList) {
			System.out.println(webElement.getText());
		}
		driver.close();
		
		//Way2: return entered data row and column index
		int rowCnt = driver.findElements(By.xpath("//*[@id='customers']//tr")).size();
		int colCnt = driver.findElements(By.xpath("//*[@id='customers']//th")).size();
		
		for(int i=1; i<=rowCnt; i++) {
			for(int j=1; j<=colCnt; j++) {
				System.out.println(i+"---"+jmy);
			}
		}
	}

}
