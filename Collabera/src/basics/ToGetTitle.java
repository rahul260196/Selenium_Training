package basics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.naukri.com/");
    	Thread.sleep(3000);
    	String parentWindow = driver.getWindowHandle();
    	System.out.println(driver.getTitle());
    	
    	Set<String> allWindowsId = driver.getWindowHandles();
    	allWindowsId.remove(parentWindow);
    	for(String windowsId: allWindowsId)
    	{
    		driver.switchTo().window(windowsId);
            System.out.println(driver.getTitle());
    	}
    	
    	

	}

}
