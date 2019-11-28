package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//set chrome driver

		//launch url
		//https://www.toolsqa.com/automation-practice-form/
		System.setProperty("webdriver.chrome.driver", "D:\\CT TP\\Java Selinium Training Content\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://test1.absofttrainings.com/javascript-alert-confirm-prompt-boxes/");
		
		
		//alert
		WebElement alertButton = driver.findElement(By.cssSelector("#alert"));
		alertButton.click();
		Thread.sleep(10);
		
		driver.switchTo().alert().accept();
		
		
		//prompt box
		WebElement promptAlertButton = driver.findElement(By.cssSelector("#prompt"));
		promptAlertButton.click();
		Thread.sleep(10);
		
		driver.switchTo().alert().sendKeys("Hello Rakesh");
		driver.switchTo().alert().accept();
		

	}

}
