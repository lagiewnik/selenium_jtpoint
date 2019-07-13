package selenium_jtpoint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;



public class Commands {

	public static void main(String[] args) {

//System Property for Gecko Driver
		System.setProperty("webdriver.gecko.driver", "C:\\selenium_web_driver\\geckodriver.exe");
		
// Initialize Gecko Driver using Desired Capabilities Class  
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
// LAunch Website
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		
		 // Fetch the text "This is sample text." and print it on console  
        // Use the class name of the div to locate it and then fetch text using getText() method
		
		//String sampleText = driver.findElement(By.className("col-md-12")).getText();
		//System.out.println(sampleText);
		
		// Use the linkText locator method to find the link and perform click using click() method 
		//driver.findElement(By.linkText("This is a link")).click();
		//driver.navigate().back();
        // Click on the textbox and send value  
		//driver.findElement(By.id("fname")).sendKeys("tekstuj");
		System.out.println("Wpisany text");
		
	
        // Clear the text written in the textbox  
		//driver.findElement(By.id("fname")).clear();
		System.out.println("Clear text");
		
        // Click on the Submit button using click() command  
		//driver.findElement(By.id("idOfButton")).click();
		System.out.println("Click Submit button");
        
		// Locate the radio button by id and check it using click() function  
		//driver.findElement(By.id("male")).click();  
		System.out.println("radio button click");
      	
        // Locate the checkbox by cssSelector and check it using click() function  
	     //driver.findElement(By.cssSelector("input.Automation")).click();  
	     System.out.println("checkbox click"); 
		
        // Use Select class for selecting value from dropdown  
	     WebElement dropdown = driver.findElement(By.id("sourceImage"));  
	     WebElement target = driver.findElement(By.id("targetDiv"));
	     (new Actions(driver)).dragAndDrop(dropdown, target);
	     
	     //dropdown.selectByVisibleText("Automation Testing");  
	     System.out.println("drop down test");    
		
        // Close the Browser  
		
		driver.close();
		
		
		
		
	}

}
