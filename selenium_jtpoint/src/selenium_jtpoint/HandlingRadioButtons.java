package selenium_jtpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System property for Chrome driver
		System.setProperty("webdriver.chrome.driver", "c:\\selenium_web_driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Launch Website
		driver.navigate().to("file:///D:/KURSY/TESTOWANIE/selenium_jtpoint/selenium_jtpoint/src/selenium_jtpoint/radio.html");
		
		//	
		driver.findElement(By.xpath("//*[@value='Banana']")).click();
		
		//dri
		
		
		
			
		
		
	}

}
