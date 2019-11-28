package Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ValidateURLTest 
{
	@Test()
	public void validateUrl()
	{
		// TODO Auto-generated method stub
		//if url contains google print pass else print fail
		// chrome
		System.setProperty("webdriver.chrome.driver", "D:\\CT TP\\Java Selinium Training Content\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String myURL=driver.getCurrentUrl();
		Assert.assertTrue(myURL.contains("google"), "Validating URL");
		
	}
}
