package assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		String parentWindowId = driver.getWindowHandle();
		
		//1st product
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);

		driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Black, 64 GB)']")).click();
		Set<String> allWindowsId = driver.getWindowHandles();
	    allWindowsId.remove(parentWindowId);
	    String expectedTitle = "Buy Apple iPhone 12 ( 64 GB Storage ) Online at Best Price On Flipkart.com";
	    for(String windowId:allWindowsId)
	    {
	    	driver.switchTo().window(windowId);
	    	String actualTitle = driver.getTitle();
	    	System.out.println(actualTitle);
	    	if(actualTitle.equals(expectedTitle))
	    	{
	    		System.out.println("driver control is in right page");
	    	}
	    }
	    driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	    driver.switchTo().window(parentWindowId); 
	    driver.findElement(By.name("q")).clear();
	    driver.findElement(By.name("q")).sendKeys("redmi",Keys.ENTER );
	 
	    
	    
	    
	    
	    
	    
	    /*  System.out.println("redmi enter");
	    
	    driver.findElement(By.xpath("//div[text()='REDMI 9i sport(Coral Green, 64 GB)']")).click();
	    System.out.println("redmi page");
	    System.out.println(driver.getTitle());  
	    System.out.println("title get");
	    
	    Set<String> allWindowsIds = driver.getWindowHandles();
	    allWindowsIds.remove(parentWindowId);
	    String expectedTitles = "REDMI 9i sport( 64 GB Storage, 4 GB RAM ) Online at Best Price On Flipkart.com";
	   
	    for(String windowId:allWindowsId)
	    {
	    	System.out.println("entered in same page");
	    	driver.switchTo().window(windowId);
	    	String actualTitle1 = driver.getTitle();
	    	System.out.println(actualTitle1);
	    	if(actualTitle1.equals(expectedTitles))
	    	{
	    		System.out.println("driver control is in right page");
	    	}
	    } 
	    
	 
	
	    driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();  
	  //  driver.switchTo().window(parentWindowId);
	 //   driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F12 (Celestial Black, 64 GB)']")).click();  */
	    
	    

	}
	
	

}
