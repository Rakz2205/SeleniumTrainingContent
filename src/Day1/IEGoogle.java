package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEGoogle 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Internet Explorer
		System.setProperty("webdriver.ie.driver", "D:\\CT TP\\Java Selinium Training Content\\Drivers\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.com");
	}
}
