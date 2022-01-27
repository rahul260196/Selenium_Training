package frame;

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
    	driver.findElement(By.id("login1")).sendKeys("SumanthElfBatch@rediffmail.com");
    	driver.findElement(By.id("password")).clear();
    	driver.findElement(By.id("password")).sendKeys("Testing@123");
    	driver.findElement(By.name("proceed")).click();
    	driver.findElement(By.linkText("Write mail")).click();
    	driver.findElement(By.xpath("//*[@id=\"TO_IDcmp2\"]")).sendKeys("SumanthElfBatch@rediffmail.com");
    	driver.findElement(By.xpath("//*[@id=\"rd_compose_cmp2\"]/ul/li[4]/input")).sendKeys("Rahul");
    	WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor')]"));
    	driver.switchTo().frame(frameElement);

	}

}
