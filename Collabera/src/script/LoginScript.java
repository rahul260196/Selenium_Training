package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import datadriven.ExcelLib;

public class LoginScript {

	public static void main(String[] args) {
		//test data
       	String testUrl = ExcelLib.readStringdata("Sheet1", 0, 0);
       	String username = ExcelLib.readStringdata("Sheet2", 0, 1);
       	String password = ExcelLib.readStringdata("Sheet2", 0, 2);
       	String expectedPageTitle = ExcelLib.readStringdata("Sheet2", 1, 0);
       	String expectedHomePageTitle = ExcelLib.readStringdata("Sheet2", 1, 1);
		
		
		/*//test data
				String testurl = "https://demo.actitime.com/login.do";
				String username = "admin";
				String password ="manager";
				String expectedPageTitle = "actiTIME - Login";
				String expectedHomePageTitle = "actiTIME - Login"; */
				
			  //Step 1:- Open the browser and enter the url	
			   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			   WebDriver driver = new ChromeDriver();
			   System.out.println("Browser is launched successfully");
			   driver.manage().window().maximize();
			   System.out.println("Browser is maximized successfully");
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   driver.get(testUrl);
			   String actualPageTitle = driver.getTitle();
			   if(actualPageTitle.equals(expectedPageTitle))
			   {
				   System.out.println("login page displayed successfully");
			   }
			   
			   else
			   {
				   System.out.println("login page is not displayed successfully");
			   }
			   
			 //step 2:- Enter Username into Username Textfield
		       WebElement usernameTextField =  driver.findElement(By.id("username"));
		       usernameTextField.clear();
		       usernameTextField.sendKeys(username);
		       String actualUsernameEntered = usernameTextField.getAttribute("value"); 
		       if(actualUsernameEntered.equals(username)){
		          System.out.println("username is entered into the textfield successfully");
		       }
		       else{
		         System.out.println("username is not entered into the textfield successfully");
		       }
		       
		    // step 3:- Enter Password into Password TextField   
		      WebElement passwordTextField =  driver.findElement(By.name("pwd"));
		      passwordTextField.clear();
		      passwordTextField.sendKeys(password);
		      String actualpasswordEntered = passwordTextField.getAttribute("value"); 
		      if(actualpasswordEntered.equals(password)){
		          System.out.println("password is entered into the textfield successfully");
		      }
		      else{
		         System.out.println("password is not entered into the textfield successfully");
		      }
		      
		   
		      //step 4:- Click on Login Button 
		      
		      driver.findElement(By.id("loginButton")).click();
		     String actualHomePageTitle =driver.getTitle();
		     System.out.println(actualHomePageTitle);
		     
		     
		     if(actualHomePageTitle.equals(expectedHomePageTitle)){
		     	System.out.println("homepage is launched successfully");
		     }
		     else{
		    	 System.out.println(actualHomePageTitle);
		     	System.out.println("homepage is not launched successfully");
		     }
		   
			  

	}

}
