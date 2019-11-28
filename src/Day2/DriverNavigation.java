package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigation 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// chrome
		System.setProperty("webdriver.chrome.driver", "D:\\CT TP\\Java Selinium Training Content\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.get("https://www.flipkart.com");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		//forward and print url
		
		// try navigate.refresh
		
		
		
	}
}
