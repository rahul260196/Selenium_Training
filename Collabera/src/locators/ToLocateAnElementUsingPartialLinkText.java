package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateAnElementUsingPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    //	driver.get("https://selenium08.blogspot.com/");
    	//driver.findElement(By.partialLinkText("Forgotten")).click();
    	
    //	driver.findElement(By.partialLinkText("Right click Action")).click();
    	
    	driver.get("https://www.skillrary.com/");
    	Thread.sleep(2000);
    	
    //	driver.findElement(By.xpath("./html/body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/p")).click();
    	
    	driver.quit();

	}

}
