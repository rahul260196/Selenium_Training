package webDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerfomBrowserHistoryNavigation {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		Thread.sleep(2000);
		driver.get("https://www.skillrary.com");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	//	URL url = new URL("https://www.google.com");
		//URL url = new URL("https://www.swiggy.com/");
		//driver.navigate().to(new URL("https://www.swiggy.com"));
		driver.navigate().to("https://www.google.com");
		
		

	}

}
