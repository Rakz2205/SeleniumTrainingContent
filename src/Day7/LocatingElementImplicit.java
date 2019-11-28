package Day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementImplicit {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//launch url
		//https://www.toolsqa.com/automation-practice-form/
		
		System.setProperty("webdriver.chrome.driver", "D:\\CT TP\\Java Selinium Training Content\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//implicit wait of 30 seconds
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		//enter first name using name locator
		
		driver.findElement(By.name("firstname1")).sendKeys("Hello");
		
	}

}
