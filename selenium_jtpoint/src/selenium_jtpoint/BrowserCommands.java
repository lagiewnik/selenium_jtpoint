package selenium_jtpoint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;



public class BrowserCommands {

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
		
		// Storing Title value in the String variable
		String title = driver.getTitle();
		// Storing Title length value in the String variable
		int titleLength = driver.getTitle().length();
		
		//Print Title and Title length
		System.out.println("Title of page is: " + title);
		System.out.println("Length of title is: " + titleLength);
		
		// Storing url value in the String variable
		String url = driver.getCurrentUrl();
		System.out.println("Current url is: "+ url);
		
	    if (url.equals("https://allegro.pl/"))  
	    {  
	    System.out.println("Verification Successful - The correct Url is opened.");  
	    }  
	    else  
	    {  
	    System.out.println("Verification Failed - An incorrect Url is opened.");  
	    }   
	    
	    // Storing Page Source in String variable  
	    String pageSource = driver.getPageSource();  
	               
	    // Storing Page Source length in Int variable  
	    int pageSourceLength = pageSource.length();  
	    
	    // Printing length of the Page Source on console  
	    System.out.println("Total length of the Page Source is : " + pageSourceLength);  
	    
        // Close the Browser  
		
		driver.close();
		
		
		
		
	}

}
