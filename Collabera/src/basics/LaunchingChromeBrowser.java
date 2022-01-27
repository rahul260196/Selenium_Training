package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver",
				"./drivers/geckodriver.exe");
		FirefoxDriver driver1 = new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver",
				"./drivers/msedgedriver.exe");
		EdgeDriver driver2 = new EdgeDriver();

	}
}