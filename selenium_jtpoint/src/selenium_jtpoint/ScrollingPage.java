package selenium_jtpoint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ScrollingPage {

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
        driver.navigate().to("https://www.javatpoint.com");   
        
		 //Scroll down the webpage by 4500 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 4500)");  
  
		
		//driver.quit();
		
	}

}
