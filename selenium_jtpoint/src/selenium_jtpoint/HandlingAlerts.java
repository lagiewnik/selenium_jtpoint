package selenium_jtpoint;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System property for Chrome driver
		System.setProperty("webdriver.chrome.driver", "c:\\selenium_web_driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Launch Website
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		
			
	    //Handling alert boxes  
        //Click on generate alert button  
        driver.findElement(By.cssSelector("body>div>div:nth-child(20)>div>p>button")).click();  
		
        Thread.sleep(1500);
        //Using Alert class to first switch to or focus to the alert box  
        Alert alert = driver.switchTo().alert();  
        
        //Using accept() method to accep the alert box  
        alert.accept();  
        
        
        //Handling confirm box  
        //Click on Generate Confirm Box  
       driver.findElement(By.xpath("/html/body/div[1]/div[12]/div/p[1]/button")).click();       
              
        Alert confirmBox = driver.switchTo().alert();
        
        //Using dismiss() command to dismiss the confirm box  
        //Similarly accept can be used to accept the confirm box  
        Thread.sleep(1500);	
        confirmBox.dismiss();
        
        Thread.sleep(5000);
        
        driver.quit();
		
	}

}