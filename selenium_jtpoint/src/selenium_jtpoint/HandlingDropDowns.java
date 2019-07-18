package selenium_jtpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System property for Chrome driver
		System.setProperty("webdriver.chrome.driver", "c:\\selenium_web_driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Launch Website
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		
			
		//find dropdown and select value
		WebElement dropdown = driver.findElement(By.id("testingDropdown"));
		Select dropdownfield = new Select(dropdown);
		
		//select an option based on the text over the option.
		dropdownfield.selectByVisibleText("Manual Testing");
		
		//or select by 'value' attribute.
		dropdownfield.selectByValue("Automation");
		
		//or  select an option based on its index, beginning with 0. 
		dropdownfield.selectByIndex(1);
		
			
		
		
	}

}
