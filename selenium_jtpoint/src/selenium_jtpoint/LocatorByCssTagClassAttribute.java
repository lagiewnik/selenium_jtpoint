package selenium_jtpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByCssTagClassAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System property for Chrome driver
		System.setProperty("webdriver.chrome.driver", "c:\\selenium_web_driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Launch Website
		driver.navigate().to("https://www.google.pl");
		
			
		// Click on the textbox and send value  
		driver.findElement(By.cssSelector("input.gLFyf[name=q]")).sendKeys("pszczo³y");  
		       
		// Click on the Google Search button using click() command  
		driver.findElement(By.cssSelector("input.gNO89b[name=btnK]")).click();  
		
		
	}

}
