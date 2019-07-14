package selenium_jtpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOnChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System property for Chrome driver
		System.setProperty("webdriver.chrome.driver", "c:\\selenium_web_driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Launch Website
		driver.navigate().to("https://www.javatpoint.com/");
		
		// Maximaize the browser window
		driver.manage().window().maximize();
		
		//Scroll down the website by 5000 px;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,15000)");
		
		//Click agree
		driver.findElement(By.linkText("Testing")).click();
		
		
		
	}

}
