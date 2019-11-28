package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateFieldName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\CT TP\\Java Selinium Training Content\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		//validate Manual Tester is present in the web page
		
		WebElement parentYOE = driver.findElement(By.xpath("//div[@class='control-group'][7]"));
		
		String YOEText=parentYOE.getText();
		
		System.out.println(YOEText);
		
		System.out.println(YOEText.contains("Manual Tester"));
	}

}
