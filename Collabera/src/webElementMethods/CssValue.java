package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		String cssProperty = driver.findElement(By.id("loginButton")).getCssValue("background-color");
		System.out.println(cssProperty);
	}

}
