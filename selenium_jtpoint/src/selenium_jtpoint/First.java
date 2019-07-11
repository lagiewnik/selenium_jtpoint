package selenium_jtpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class First {

	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "c:\\selenium_web_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//Launch website
		driver.navigate().to("https://www.google.pl");
		
	//Click on the search text box and send value
		
		driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");
		
	// Click on the search button
		driver.findElement(By.name("btnK")).click();
		

	}

}
