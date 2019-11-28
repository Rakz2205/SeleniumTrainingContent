package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// chrome
		System.setProperty("webdriver.chrome.driver", "D:\\CT TP\\Java Selinium Training Content\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		// fetching URL of Page
		
		String currURL=driver.getCurrentUrl();
		System.out.println("Current URL : " + currURL);
		
		
		driver.get("https://www.flipkart.com"); 
		
		
		driver.close();
		
		
		driver.get("https://www.flipkart.com");
		
		
	}
}
