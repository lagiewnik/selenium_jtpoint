package selenium_jtpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System property for Chrome driver
		System.setProperty("webdriver.chrome.driver", "c:\\selenium_web_driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Launch Website
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		
		
		// Click on the textbox and send value - Start with (^) 
        driver.findElement(By.cssSelector("input[id^='fna']")).sendKeys("JavaTpoint JMeter Tutorial");  
               
    // Click on the Submit button using click() command  - Start with (^) 
    driver.findElement(By.cssSelector("button[id^='idOf']")).click();  	
		  
	// find element Ends with ($)
    driver.findElement(By.cssSelector("input[value$=ormance]")).click();
	
    //find element Contains (*)
    driver.findElement(By.cssSelector("[id*=emal]")).click();
    
	}

}
