package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAllChildWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		String parentWindowId = driver.getWindowHandle();
		String expectedParentPageTitle = "Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com";
		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String windowId:allWindowIds)
		{
			driver.switchTo().window(windowId);
			String actualPageTitle = driver.getTitle();
			if(!expectedParentPageTitle.equals(actualPageTitle))
			{
				driver.close();
			}
			
		}
		
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.id("qsb-keyword-sugg")).sendKeys("Mechanical");
		

	}

}
