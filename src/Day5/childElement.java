package Day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childElement {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CT TP\\Java Selinium Training Content\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		//validate Manual Tester is present in the web page
		
		WebElement parentYOE = driver.findElement(By.xpath("//div[@class='control-group'][6]"));
		
		List<WebElement> childYOE = parentYOE.findElements(By.tagName("input"));
		
		System.out.println(childYOE.size());
		
		for(int i=0;i<childYOE.size();i++)
		{
			System.out.println(childYOE.get(i).getAttribute("value"));
		}
		
	}

}
