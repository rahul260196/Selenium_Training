package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandKeysInZomato {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(5000);
		WebElement fullnameTextField = driver.findElement(By.xpath("//label[text()='Full Name']"));
		Thread.sleep(2000);
		
		fullnameTextField.clear();
		Thread.sleep(2000);
		fullnameTextField.sendKeys("Rah","kum","ar",Keys.CONTROL+"a");
		Thread.sleep(2000);
		fullnameTextField.sendKeys(Keys.CONTROL+"c");
		WebElement emailTextField = driver.findElement(By.xpath("//label[text()='Email']"));
		emailTextField.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.quit();
		
		
		
		

	}

}
