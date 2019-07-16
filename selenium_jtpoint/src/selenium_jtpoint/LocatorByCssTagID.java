package selenium_jtpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByCssTagID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System property for Chrome driver
		System.setProperty("webdriver.chrome.driver", "c:\\selenium_web_driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Launch Website
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		
			
		//Find text box and put test and click submit button
		driver.findElement(By.cssSelector("input#fname")).sendKeys("CSS selector");
		driver.findElement(By.cssSelector("button#idOfButton")).click();
		driver.findElement(By.cssSelector("input#female")).click();
			
		
		
	}

}
