package Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ValidateTitleTest 
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
		String myURL=driver.getTitle();
		Assert.assertTrue(myURL.contains("google"), "Validating Title");
		
//		Assert.assertFalse(condition, message);
//		
//		Assert.assertEquals(actual, expected,message);
//		
//		Assert.assertNotEquals(actual1, actual2, message);
//		
//		Assert.assertNull(object, message);
		
	}
}
