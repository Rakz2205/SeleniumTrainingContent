package Day7;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatingElementExplicit {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		//launch url
		//https://www.toolsqa.com/automation-practice-form/
		
		System.setProperty("webdriver.chrome.driver", "D:\\CT TP\\Java Selinium Training Content\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//implicit wait of 30 seconds
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(10);
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		//enter first name using name locator
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("firstname1")));
		
		driver.findElement(By.name("firstname1")).sendKeys("Hello");
		
		
		
	}

}
