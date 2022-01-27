package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Set<String> allwindowId = driver.getWindowHandles();
		for(String windowId:allwindowId) {
			System.out.println(windowId); 
		}
		driver.quit();
		
	}

}
