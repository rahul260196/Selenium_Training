package Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindNumberOfTagElementInAPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.skillrary.com/");
    	
    	List<WebElement> number = driver.findElements(By.tagName("a"));
    	
        System.out.println( number.size());

	}

}
