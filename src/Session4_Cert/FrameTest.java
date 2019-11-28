package Session4_Cert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//set chrome driver

		//launch url
		//https://www.toolsqa.com/automation-practice-form/
		System.setProperty("webdriver.chrome.driver", "D:\\CT TP\\Java Selinium Training Content\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://hugelearning.com/iframe-practice-page/");
		
		driver.manage().window().maximize();
		
		List<WebElement> objList = driver.findElements(By.tagName("iframe"));
		
		
		System.out.println(objList.size());
		//switching using name
		driver.switchTo().frame("iframe1");
		
		driver.findElement(By.name("First_Name")).sendKeys("John");
		
		driver.switchTo().defaultContent();
		
		//switching frame using id
		driver.switchTo().frame("IFrame2");
		
		System.out.println(driver.findElement(By.xpath("//*[text()='Frame2']")).isDisplayed());
		
		// Again switch to frame 1 and enter last name
	}

}
