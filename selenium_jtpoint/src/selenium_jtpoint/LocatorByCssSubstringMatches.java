package selenium_jtpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByCssSubstringMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System property for Chrome driver
		System.setProperty("webdriver.chrome.driver", "c:\\selenium_web_driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Launch Website
		driver.navigate().to("https://www.google.pl");
		
		//find element by xpath
		driver.findElement(By.xpath("//*[@title='Szukaj']")).sendKeys("Python");
		//driver.findElement(By.xpath("//*[@name='btnK']")).click();
		
		//find with contains()
		//driver.findElement(By.xpath("//*[contains(@name,'btnK')]")).click();
    
		// find elements with text() method
		driver.findElement(By.xpath("//*[text()='Szczęśliwy traf']")).click();
	}

}
