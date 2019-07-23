package selenium_jtpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System property for Chrome driver
		System.setProperty("webdriver.chrome.driver", "c:\\selenium_web_driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Launch Website
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		//Scroll down the webpage by 4500 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 4500)");  
        System.out.println("scroll down");
		
		//WebElement on which drag and drop operation needs to be performed  
		WebElement from = driver.findElement(By.xpath("//*[@id=\"sourceImage\"]"));
		System.out.println("Get from element");
		
		//WebElement to which the above object is dropped  
		WebElement to = driver.findElement(By.xpath("//*[@id=\"targetDiv\"]"));
		System.out.println("Get to element");
		
		Thread.sleep(1500);
		System.out.println("sleep 1500");
		//Creating object of Actions class to build composite actions  
		
		driver.manage().window().maximize();
		System.out.println("Maximize windows");
		
		Actions act = new Actions(driver);
		
		System.out.println("Declare act");
		
		Thread.sleep(1500);
		System.out.println("sleep 1500");
		//Performing the drag and drop action  
		act.dragAndDrop(from, to).build().perform();
		System.out.println("Make dragAndDrop 1 time");
		
		
		Thread.sleep(1500);
		System.out.println("sleep 1500");
		
		
		//Performing the drag and drop action  
		act.dragAndDrop(from, to).build().perform();
		System.out.println("Make dragAndDrop 2 time");			
		
		
	}

}
