package basics;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
    	driver.manage().window().maximize();
    
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("https://www.rediffmail.com");
    	driver.findElement(By.linkText("Sign in")).click();
    	driver.findElement(By.id("login1")).clear();
    	driver.findElement(By.id("login1")).sendKeys("mr.rahul2608@rediffmail.com");
    	driver.findElement(By.id("password")).clear();
    	driver.findElement(By.id("password")).sendKeys("Selen@123");
    	driver.findElement(By.name("proceed")).click();
    	driver.findElement(By.linkText("Write mail")).click();
    	
    	driver.findElement(By.xpath("//*[@id=\"TO_IDcmp2\"]")).sendKeys("mr.rahul2608@rediffmail.com");
    	driver.findElement(By.xpath("//*[@id=\"rd_compose_cmp2\"]/ul/li[4]/input")).sendKeys("Rahul");
        WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor')]"));
        driver.switchTo().frame(frameElement);
        driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("hi ALL");
        driver.switchTo().defaultContent();
    	driver.findElement(By.linkText("Send")).click();
    	driver.navigate().refresh();
    	for(;;) {
    		try {
    			driver.findElement(By.xpath("//span[text()='Rahul']/..//cite[@title='Select mail']")).click();
        		driver.findElement(By.xpath("//span[text()='Delete' and @class ='rd_fil_del']")).click();
        		driver.findElement(By.xpath("//button[text()='Ok']")).click();
        		break;
    		}
    		catch(NoSuchElementException e) {
    			driver.navigate().refresh();
    		}
    		
    	}
    	
    	
	}

}
