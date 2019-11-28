package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxGoogle 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Firefox
		System.setProperty("webdriver.firefox.marionette", "D:\\CT TP\\Java Selinium Training Content\\Drivers1\\Drivers\\\"D:\\CT TP\\Java Selinium Training Content\\Drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
	}
}
