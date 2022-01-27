package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateAnElementUsingCssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.skillrary.com/");
    	driver.findElement(By.name("q")).sendKeys("java");
      	driver.findElement(By.cssSelector("input[value=go]")).click();
    	
    	
    	

	}

}
