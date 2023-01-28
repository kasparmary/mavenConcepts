package ShadowElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		

		//Find shadow element - using javascriptExecutor only
		//Or we have to use Maven dependency - https://github.com/sukgu/shadow-automation-selenium
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//Html dom--> iframe --> shadowDom element
		driver.switchTo().frame("pact");
		WebElement teaEle = (WebElement)jse.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
		
		String jsEle1 = "arguments[0].setAttribute('value', 'Green Tea')";
		jse.executeScript(jsEle1, teaEle);
		
		//document.querySelector("#snacktime").shadowRoot.querySelector("#app2").shadowRoot.querySelector("#pizza")
		
		WebElement lunch = (WebElement)jse.executeScript("document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
		String lunchVal = "arguments[0].setAttributes('value', 'Briyani')";
		jse.executeScript(lunchVal, lunch);
		

	}

}
