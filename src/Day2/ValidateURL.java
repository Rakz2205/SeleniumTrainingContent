package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateURL {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//if url contains google print pass else print fail
		
		// TODO Auto-generated method stub
		
		// chrome
		System.setProperty("webdriver.chrome.driver", "D:\\CT TP\\Java Selinium Training Content\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		String myUrl=driver.getCurrentUrl();
		
		
		System.out.println(myUrl.contains("google"));
}

}
