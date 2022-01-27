package assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
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
		//Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi", Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Redmi 9 Activ (Carbon Black, 4GB RAM, 64GB Storage)']")).click();
		String expectedTitles = "Redmi 9 Activ (Carbon Black, 4GB RAM, 64GB Storage) : Amazon.in: Electronics";
		
		Set<String> allWindowIdss = driver.getWindowHandles();
		allWindowIdss.remove(parentWindowId);
		for(String windowIds:allWindowIdss)
		{
			    driver.switchTo().window(windowIds);
				System.out.println(driver.getTitle());
			    String actualTitle = driver.getTitle();
			    if(actualTitle.equals(expectedTitles))
			    {
					System.out.println("driver control is right");
			    }
		}
		
		//Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("vivo", Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Vivo V21 5G (Sunset Dazzle, 8GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers']")).click();
		String expectedTitless = "Vivo V21 5G (Sunset Dazzle, 8GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers : Amazon.in: Electronics";
		
		Set<String> allWindowIdsss = driver.getWindowHandles();
		allWindowIdss.remove(parentWindowId);
		for(String windowIdss:allWindowIdsss)
		{
			    driver.switchTo().window(windowIdss);
				System.out.println(driver.getTitle());
			    String actualTitle = driver.getTitle();
			    if(actualTitle.equals(expectedTitless))
			    {
					System.out.println("driver control is right");
			    }
		}
		
		//Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-button")).click();
		
		
		
		
		

	}

}
