package assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAddToCartIfPriceIsLessThan6000 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Apple iPhone XR (64GB) - (Product) RED']")).click();
		
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentWindowId);
		
		String expectedTitle = "Apple iPhone XR (64GB) - (Product) RED : Amazon.in: Electronics";
		for(String windowId:allWindowId)
		{
		    driver.switchTo().window(windowId);
		
		    String actualTitle = driver.getTitle();
		    if(actualTitle.equals(expectedTitle))
		    {
			System.out.println("driver control is right");
	      	}
		    
		}
		     WebElement text = driver.findElement(By.xpath("//span[text()='₹34,999.00']"));
		   String actualText = text.getText();
		   System.out.println(actualText);
		//String priceText =
				
	/*	if(priceText.equals(expectedPrice))
		{
			driver.findElement(By.id("add-to-cart-button")).click();
		}   */

	}

}
