package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		String expectedText = "Please identify yourself";
		
		WebElement text = driver.findElement(By.id("headerContainer"));
		String actualText = text.getText();
		System.out.println(actualText);
		if(actualText.equals(expectedText))
		{
			System.out.println("test is pass");
		}

	}

}
