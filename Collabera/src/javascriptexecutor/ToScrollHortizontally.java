package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollHortizontally {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is launched successfully");
    	driver.manage().window().maximize();
    	System.out.println("Browser is maximized successfully");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("https://www.skillrary.com");
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    //	js.executeScript("window.scrollTo(0,2000);");
    	 js.executeScript("document.getElementById('youtube_id').scrollIntoView(true)");

	}

}
