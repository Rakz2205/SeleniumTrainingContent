package Session4_Cert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set chrome driver

		//launch url
		//https://www.toolsqa.com/automation-practice-form/
		System.setProperty("webdriver.chrome.driver", "D:\\CT TP\\Java Selinium Training Content\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
			
		WebElement dropdownContinent = driver.findElement(By.id("continents"));
		
		driver.findElement(By.id("cookie_action_close_header")).click();
		
		Select select=new Select(dropdownContinent);
		
		
		//select.selectByIndex(2);
		
		select.selectByVisibleText("Australia");
		
	}

}
