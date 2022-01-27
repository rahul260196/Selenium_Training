package popups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TohandleCalendarPopups {

	public static void main(String[] args) throws InterruptedException {
		
		//FOR SYSTEM'S DATE 
		
		//LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime ldt = LocalDateTime.now().plusMonths(4); //directly we can move to 4 months further and select
		String month = ldt.getMonth().name();
		month=month.substring(0, 1).toUpperCase()+month.substring(1, month.length()).toLowerCase();
		System.out.println(month);
		//System.out.println(ldt.getMonth().name());
		int date=ldt.getDayOfMonth();
		int year=ldt.getYear();
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com");
		Actions actions = new Actions(driver);
		actions.click().perform();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		Thread.sleep(2000);
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,500);");
		
		for(;;)
		{
			try 
			{
				driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+date+"']")).click(); //dynamic xpath
				break;		
			}
			catch(NoSuchElementException e)
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		
	}

}
