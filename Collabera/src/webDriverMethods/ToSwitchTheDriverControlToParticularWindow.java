package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheDriverControlToParticularWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
	 Set<String> allWindowsId = driver.getWindowHandles();
	 String expectedWindowTitle = "ICICI";
	 
	 for(String windowId : allWindowsId)
	 {
		 driver.switchTo().window(windowId);
		 String actualWindowTitle = driver.getTitle();
		 if(expectedWindowTitle.equals(actualWindowTitle))
		 {   
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 driver.close();
			 break;
		 }
	 }

	}

}
