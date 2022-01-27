package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateAnElementUsingTagName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    //	driver.get("https://demo.actitime.com/login.do");
    	
    	//driver.findElement(By.tagName("a")).click();
    	
      //   WebElement loginButton = driver.findElement(By.tagName("a"));
      //   loginButton.click();
    	
    	driver.get("https://www.naukri.com/");
    	driver.findElement(By.linkText("LOGIN")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.tagName("input")).sendKeys("abc");
         
         Thread.sleep(10000);
         driver.quit();

	}

}
