package actionsclassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToAnElementWithOffset {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
    	driver.manage().window().maximize();
    
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("https://www.skillrary.com/user/login/");
   // 	WebElement passwordTF = driver.findElement(By.name("password"));
    //	passwordTF.sendKeys("rahul");

       Actions actions = new Actions(driver);
    //   actions.moveToElement(passwordTF, 140, -100).click().perform();
       actions.moveByOffset(100, 100).contextClick().perform();
	}

}
