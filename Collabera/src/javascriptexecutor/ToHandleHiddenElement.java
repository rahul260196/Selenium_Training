package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
    	driver.manage().window().maximize();
    
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("https://www.facebook.com/signup");
    	Thread.sleep(3000);
    	WebElement hiddenTF = driver.findElement(By.name("custom_gender"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].value='Custom Gender';", hiddenTF);
    	driver.findElement(By.xpath("//label[text()='Custom']/..//input[@name='sex']")).click();
    	
    	//label[text90='Custom']//..//input[@name='sex']
    	

	}

}
