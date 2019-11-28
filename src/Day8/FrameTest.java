package Day8;

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
		Thread.sleep(10);
		
		//List<WebElement> objTemp = driver.findElements(By.tagName("iframe"));
		
		//System.out.println(objTemp.size());
		//driver.findElement(By.id("custom_field_text_field_1016375")).sendKeys("Before Switching Frame");
		
		//frames
		//driver.switchTo().frame("globalSqa");
		
		//switching using name
		driver.switchTo().frame("iframe1");
		
		driver.findElement(By.name("First_Name")).sendKeys("After Switching Frame");
		//System.out.println(driver.findElement(By.xpath("//*[text()='Frame2']")).isDisplayed());
		
		//"custom_field_text_field_1016375"
		
		//switching using id
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("IFrame2");
		
		System.out.println(driver.findElement(By.xpath("//*[text()='Frame2']")).isDisplayed());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.name("First_Name")).sendKeys("After Switching Frame edietd");
	}

}
