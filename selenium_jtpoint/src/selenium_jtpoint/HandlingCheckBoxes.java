package selenium_jtpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System property for Chrome driver
		System.setProperty("webdriver.chrome.driver", "c:\\selenium_web_driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Launch Website
		// LAunch Website
				driver.navigate().to("https://www.spicejet.com/");
				
				WebElement checkBox = driver.findElement(By.cssSelector("#ctl00_mainContent_chk_StudentDiscount"));

				Boolean isChecked = checkBox.isSelected();
				System.out.println("Checkbox seleckted: "+ isChecked);
				
				checkBox.click();
				isChecked = checkBox.isSelected();
				System.out.println("Checkbox seleckted: "+ isChecked);
		
		//dri
		
		
		
			
		
		
	}

}
