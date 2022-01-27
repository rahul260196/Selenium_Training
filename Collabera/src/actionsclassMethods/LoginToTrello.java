package actionsclassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginToTrello {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
    	driver.manage().window().maximize();
    
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("https://trello.com/login");
    	driver.findElement(By.id("user")).sendKeys("mr.rahul2608@rediffmail.com");
    	
    	driver.findElement(By.id("login")).click();
    	Thread.sleep(5000);
    	driver.navigate().refresh();
    	driver.findElement(By.id("password")).sendKeys("Rtesting@123");
    	driver.findElement(By.id("login-submit")).click();
    	driver.findElement(By.xpath("//span[text()='Boards']")).click();
    	driver.findElement(By.xpath("//div[text()='Rahul']")).click();
    	Thread.sleep(2000);
    	Actions ac = new Actions(driver);
    	
    	WebElement srcEle = driver.findElement(By.xpath("//span[text()='SDLC']"));
    	WebElement destEle = driver.findElement(By.xpath("//h2[text()='Java']/../..//span[text()='Add a card']"));
    //	ac.dragAndDrop(srcEle, destEle).perform();
    //	ac.dragAndDropBy(srcEle, 360, 0).perform();
    	Thread.sleep(5000);  	
    	ac.clickAndHold(srcEle).perform();
    	Thread.sleep(5000);
    	ac.release(destEle).perform();
  //  	ac.clickAndHold(srcEle).moveByOffset(360, 335).perform();
   // 	Thread.sleep(5000);
   // 	ac.release().perform();
    	
    	
    	
    	
    
    	//Actions actions = new Actions(driver);

	}

}
