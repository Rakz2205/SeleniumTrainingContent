package Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookStatusUpload 
{
	private String chromeDriverLocation="D:\\\\CT TP\\\\Java Selinium Training Content\\\\Drivers\\\\chromedriver.exe";
	
	private String fbUrl="https://www.facebook.com/";
	private String userId="rrkkgupta82@gmail.com";
	private String userPassword="Test12345";
	
	//locators
	private String userIdCSS=".menu_login_container #email";
	private String userPasswordCSS=".menu_login_container #pass";
	private String loginButtonXpath="//input[@data-testid='royal_login_button']";
	
	private String statusTextAreaName="xhpc_message";
	private String statusUpdateBtnXpath="//button[@data-testid='react-composer-post-button']";
	//Status Message
	private String strMessage="HelloWorld";
	
	@Test(description="Adding Status on FB home page")
	public void updateStatus()
	{
		
		System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(fbUrl);
		driver.manage().window().maximize();
		
		//Adding creds
		driver.findElement(By.cssSelector(userIdCSS)).sendKeys(userId);
		driver.findElement(By.cssSelector(userPasswordCSS)).sendKeys(userPassword);
		driver.findElement(By.xpath(loginButtonXpath)).click();
		
		//Writing Status and Posting
		
		driver.findElement(By.name(statusTextAreaName)).sendKeys(strMessage);
		
		driver.findElement(By.xpath(statusUpdateBtnXpath)).click();
		
	}
}
