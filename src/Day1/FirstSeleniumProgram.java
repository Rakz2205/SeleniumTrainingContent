package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// chrome
		System.setProperty("webdriver.chrome.driver", "D:\\CT TP\\Java Selinium Training Content\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
