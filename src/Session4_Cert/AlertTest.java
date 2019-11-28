package Session4_Cert;

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
		
		//prompt alert
		driver.findElement(By.xpath("//*[@id='prompt']")).click();
		driver.switchTo().alert().sendKeys("John");
		
		driver.switchTo().alert().accept();
		
		
		
	}

}
