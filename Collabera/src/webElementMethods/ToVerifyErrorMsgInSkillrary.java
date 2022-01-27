package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyErrorMsgInSkillrary {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		driver.findElement(By.xpath("//button[contains(text(),'submit')]"));
		String expectedErrorMsg = "Email ";
		 WebElement errorMsgElement = driver.findElement(By.id("email-error"));
		 String actualErrorMsg = errorMsgElement.getText();
		 System.out.println(actualErrorMsg);
		 if(actualErrorMsg.equals(expectedErrorMsg))
		 {
			 System.out.println();
		 }
		 else
		 {
			 System.out.println();
		 }

	}

}
