package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandSendKeys {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(3000);
		WebElement usernameTextField = driver.findElement(By.id("username"));
		Thread.sleep(3000);
		usernameTextField.clear();
		Thread.sleep(3000);
		usernameTextField.sendKeys("Rah","ul","kum","ar");
		Thread.sleep(3000);
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		
		passwordTextField.clear();
		Thread.sleep(3000);
		passwordTextField.sendKeys("manager",Keys.ENTER);
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
