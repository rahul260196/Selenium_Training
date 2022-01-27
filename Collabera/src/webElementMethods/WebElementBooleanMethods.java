package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementBooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
     
		
		WebElement uTF = driver.findElement(By.name("username"));
	    WebElement pTF = driver.findElement(By.name("password"));
		WebElement lButton = driver.findElement(By.xpath("//button[.='Log In']"));
		
		System.out.println(lButton.isEnabled());
		Thread.sleep(1000);
		uTF.sendKeys("rahul");
		pTF.sendKeys("rahul");
		Thread.sleep(3000);
		System.out.println(lButton.isEnabled());
		 
		 

	}

}
