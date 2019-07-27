package selenium_jtpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class AssertEqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System property for Chrome driver
		System.setProperty("webdriver.chrome.driver", "c:\\selenium_web_driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Launch Website
		// LAunch Website
				driver.navigate().to("https://www.spicejet.com/");
				
				WebElement passengers = driver.findElement(By.cssSelector("#divpaxinfo"));
				
				passengers.click();
				
				System.out.println("How many passengers: " + passengers.getText());
				
				driver.findElement(By.id("hrefIncAdt")).click();
				driver.findElement(By.id("hrefIncAdt")).click();
				
				System.out.println("How many passengers: " + passengers.getText());
				
				Assert.assertEquals("3 Adult", passengers.getText());
				System.out.println("How many passengers: " + passengers.getText());
				

				
		
		
		
			
		
		
	}

}
