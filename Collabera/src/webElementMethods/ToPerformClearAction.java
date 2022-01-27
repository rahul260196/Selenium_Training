package webElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformClearAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(3000);
	    WebElement usernameTextField = driver.findElement(By.id("username"));
	    Thread.sleep(3000);
	    usernameTextField.clear();
	    Thread.sleep(3000);
	    usernameTextField.sendKeys("rahul");
	    Thread.sleep(3000);
	    
	    WebElement passwordTextField = driver.findElement(By.id("password"));
	    passwordTextField.clear();
	    Thread.sleep(3000);
	    passwordTextField.sendKeys("rahul");
	    
	

	}

}
