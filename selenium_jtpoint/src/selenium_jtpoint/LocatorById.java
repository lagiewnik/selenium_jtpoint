package selenium_jtpoint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LocatorById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System Property for Gecko Driver
				System.setProperty("webdriver.gecko.driver", "C:\\selenium_web_driver\\geckodriver.exe");
						
				// Initialize Gecko Driver using Desired Capabilities Class  
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				capabilities.setCapability("marionette", true);
				WebDriver driver = new FirefoxDriver(capabilities);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//Launch website
				driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
				//Click on the text box snd send keys
				driver.findElement(By.id("fname")).sendKeys("Python");
				
				//Click on the Submit button:
				driver.findElement(By.id("idOfButton")).click();
	}

}
