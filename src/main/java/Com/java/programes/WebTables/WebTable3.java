package Com.java.programes.WebTables;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		int RowCnt = driver.findElements(By.xpath("//table[@id=\"resultTable\"]//tbody/tr")).size();
		int colCnt = driver.findElements(By.xpath("//table[@id=\"resultTable\"]//th")).size();
		System.out.println("Row---"+RowCnt+"----Col cnt---"+colCnt);
		List<WebElement> datas = driver.findElements(By.xpath("//table[@id=\"resultTable\"]//tr/td[3]"));
		
		HashSet<String> hs = new HashSet<String>();
		
		for (WebElement data : datas) {
			hs.add(data.getText());
		}
		System.out.println(hs);
	}

}
