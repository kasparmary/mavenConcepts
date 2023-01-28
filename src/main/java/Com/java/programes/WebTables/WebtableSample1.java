package Com.java.programes.WebTables;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebtableSample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions cop = new ChromeOptions();
		cop.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(cop);
		driver.get("http://qaclickacademy.com/practice.php");
		
//		System.out.println("Row size is " + driver.findElements(By.cssSelector(".table-display tr")).size());
	//	System.out.println("Column size is " + driver.findElements(By.cssSelector(".table-display tr th")).size());
		
		WebElement table=driver.findElement(By.id("product"));
		System.out.println(table.findElements(By.tagName("tr")).size());
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
		driver.quit();

		}
}
