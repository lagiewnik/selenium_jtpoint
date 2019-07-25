package selenium_jtpoint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;



public class NavigationCommands {

	public static void main(String[] args) {

//System Property for Gecko Driver
		System.setProperty("webdriver.gecko.driver", "C:\\selenium_web_driver\\geckodriver.exe");
		
// Initialize Gecko Driver using Desired Capabilities Class  
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
// LAunch Website
		driver.navigate().to("https://allegro.pl");
		
		driver.findElement(By.cssSelector("button[data-analytics-interaction-value=accept]")).click();
		driver.findElement(By.linkText("Elektronika")).click();
		
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to("https://allegro.pl");
		
		driver.navigate().refresh();
		
		
        // Close the Browser  
		
		driver.close();
		
		driver.quit();
		
		
		
	}

}
