package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.get("https://demo.actitime.com/");
	    	driver.findElement(By.xpath("//nobr[text()='actiTIME 2020 Online']")).click();
	}

}
