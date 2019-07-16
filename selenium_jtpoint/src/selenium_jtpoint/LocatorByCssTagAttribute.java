package selenium_jtpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByCssTagAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System property for Chrome driver
		System.setProperty("webdriver.chrome.driver", "c:\\selenium_web_driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Launch Website
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		
			
		driver.findElement(By.cssSelector("input[value=female]")).click();
		driver.findElement(By.cssSelector("input[value=Automation]")).click();
		driver.findElement(By.cssSelector("input[name=firstName]")).sendKeys("jenkins");
		
		
	}

}
