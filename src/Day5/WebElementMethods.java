package Day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\CT TP\\Java Selinium Training Content\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		//validate Manual Tester is present in the web page
		
		List<WebElement> parentYOE = driver.findElements(By.xpath("//div[@class='control-group']"));
		
		//System.out.println(parentYOE.size());
		
		WebElement parentYOEWebElement = parentYOE.get(6);
		
		String YOEText=parentYOEWebElement.getText();
		
		System.out.println(YOEText);
		
		//System.out.println(YOEText.contains("Manual Tester"));
		
		WebElement radioOne = driver.findElement(By.id("exp-0"));
		
		System.out.println(radioOne.getAttribute("value"));
		
		System.out.println(radioOne.getTagName());
		
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		
		System.out.println(firstName.getCssValue("line-height"));
		
	}

}
