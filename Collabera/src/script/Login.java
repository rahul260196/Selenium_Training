package script;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import datadriven.ExcelLib;
import pomRepo.LoginPage;

public class Login {//testCaseid
    @Test
	public void createAccount() { //testCasename {
		String testUrl = ExcelLib.readStringdata("Sheet1", 0, 0);
       	String username = ExcelLib.readStringdata("Sheet2", 0, 1);
       	String password = ExcelLib.readStringdata("Sheet2", 0, 2);
       	String expectedPageTitle = ExcelLib.readStringdata("Sheet2", 1, 0);
       	String expectedHomePageTitle = ExcelLib.readStringdata("Sheet2", 1, 1);
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(testUrl);
		String actualPageTitle = driver.getTitle();
		if(actualPageTitle.equals(expectedPageTitle))
		{
			System.out.println("login page is displayed successfully");
		}
		
		else
		{
			System.out.println("login page is not displayed successfully");
		}
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToApp(username, password);
		
		String actualHomePageTitle = driver.getTitle();
		if(actualHomePageTitle.equals(expectedHomePageTitle))
		{
			System.out.println("Login is successfull");
		}
		
		else
		{
			System.out.println("Login is not successfull");
		}
	}
}
