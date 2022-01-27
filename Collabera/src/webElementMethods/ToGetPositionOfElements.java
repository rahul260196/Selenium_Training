package webElementMethods;

import java.awt.Rectangle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPositionOfElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
	/*	WebElement emailTF = driver.findElement(By.id("email"));
	    System.out.println(emailTF.getRect().getX());	
	    System.out.println(emailTF.getRect().getY());
	    WebElement passwordTF = driver.findElement(By.id("pass"));
	    System.out.println(passwordTF.getRect().getX());
	    System.out.println(passwordTF.getRect().getY());  */
		
		WebElement eTF = driver.findElement(By.id("email"));
		WebElement pTF = driver.findElement(By.id("passContainer"));
		
		     org.openqa.selenium.Rectangle emailTF = eTF.getRect();
		     org.openqa.selenium.Rectangle passTF = pTF.getRect();
		     System.out.println(emailTF.getX());
		     System.out.println(passTF.getX());
		     
		     int yLocOfUsername = emailTF.getY();
		     int heightOfUsername = emailTF.getHeight();
		     final int SPACE = 5;
		     int yLocOfPassword = passTF.getY();
		     
		     if(yLocOfUsername+heightOfUsername <= yLocOfPassword) {
		    	 System.out.println("it is not clashing");
		     }
		     else
		     {
		    	 System.out.println("it is overlapping"); 
		     }
		  
               
	}

}
