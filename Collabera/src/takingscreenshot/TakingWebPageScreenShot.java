package takingscreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakingWebPageScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com");
       File tempFile = driver.getScreenshotAs(OutputType.FILE);
       System.out.println(tempFile);
       
       
       File destFile = new File("./errorshots/swiggy.png");
     //  tempFile.renameTo(destFile);
   
       FileUtils.copyFile(tempFile, destFile);
       
       
  /*   File weScreenShot = driver.findElement(By.xpath("//a[.='FIND FOOD']")).getScreenshotAs(OutputType.FILE);
     System.out.println(weScreenShot);
     
     File deWeScreenShot = new File("./errorshots/swiggy2.jpeg");
     weScreenShot.renameTo(deWeScreenShot);  */
       
       driver.findElement(By.id("")).findElement(By.name("")).findElement(By.className(""));
     
     
    
       
    
	}

}
