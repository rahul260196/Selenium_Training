package actionsclassMethods;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToKeyUpAndKeyDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
        driver.manage().window().maximize();
    
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("https://www.myntra.com/");
    	
    	List<WebElement> navBarElements = driver.findElements(By.xpath("//a[@data-type='navElements']"));
    	Actions ac = new Actions(driver);
    	for(WebElement ele:navBarElements)
    	{
    		ac.keyDown(Keys.SHIFT).click(ele).perform();
    		ac.keyUp(Keys.SHIFT).perform();
    	}
    	
    	Set<String> allWindowId = driver.getWindowHandles();
    	 String expectedWindowTitle = "Home and Living - Buy Interior Decoration Products and Accessories Online in India";
    	 
    	 for(String windowId : allWindowId)
    	 {
    		 driver.switchTo().window(windowId);
    		 String actualWindowTitle = driver.getTitle();
    		 if(expectedWindowTitle.equals(actualWindowTitle))
    		 {   
    			
    			 Thread.sleep(5000);
    			 driver.close();
    			 break;
    		 }
    	 }
    	
    	
    	
    	

	}

}
