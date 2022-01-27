package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com");
		driver.getTitle();
		driver.getPageSource();
		driver.getCurrentUrl();
		

	}

}
