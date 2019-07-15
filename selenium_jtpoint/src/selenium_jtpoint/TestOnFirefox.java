package selenium_jtpoint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestOnFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System Property for Gecko Driver
		System.setProperty("webdriver.gecko.driver", "C:\\selenium_web_driver\\geckodriver.exe");
				
		// Initialize Gecko Driver using Desired Capabilities Class  
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		// Launch Website
		driver.navigate().to("https://www.javatpoint.com/");
		
		// Maximaize the browser window
		driver.manage().window().maximize();
		
		//Scroll down the website by 5000 px;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,15000)");
		
		// Click on the Custom Search text box and send value  
	    driver.findElement(By.id("gsc-i-id1")).sendKeys("Java");  
	    driver.findElement(By.id("gsc-i-id1")).sendKeys(Keys.RETURN);       
	          
		
		//driver.quit();
		
	}

}
