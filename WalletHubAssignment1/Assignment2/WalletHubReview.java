package Assignment2;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WalletHubReview 
{
	private String chromeDriverLocation="D:\\\\CT TP\\\\Java Selinium Training Content\\\\Drivers\\\\chromedriver.exe";
	
	private String WalletHubURL="http://wallethub.com/profile/test_insurance_company/";
	private WebDriver driver;
	
	
	// Login Creds
	private String userId="gupta.rakesh2205@gmail.com";
	private String userPassword="Test@12345";
	
	@Test(description="Adding Review Comment on WalletHub")
	public void addReview()
	{
		
		System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Launch URL
		launchURL(WalletHubURL);
		
		//Login To the Page
		loginAtWalletHub(userId,userPassword);
		
		//fetch Random Review Comment
		
		String revComment=generateRandomChars("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 200);
		//Add Review
		addReviewComment(revComment);
		
		//Validate Review
		validateReviewMessageAdded(revComment);
	}

	private void validateReviewMessageAdded(String revComment) {
		// TODO Auto-generated method stub
		driver.get("https://wallethub.com/profile/gupta_rakesh2205/");
		
		//click on review
		driver.findElement(By.cssSelector("div.profilenav li:nth-of-type(3)")).click();
		
		String uiReviewComment=driver.findElement(By.xpath("//*[@class='reviews']/div[1]/p")).getText();
		
		Assert.assertEquals(uiReviewComment, revComment, "Review Comment added Properly");
		
	}

	private void addReviewComment(String revComment) 
	{
		//hover 4th Star
		
		WebElement fourthStar=driver.findElement(By.cssSelector("#reviews-section .review-action>review-star .rvs-star-svg:nth-of-type(4)"));
		mouse_Hover(fourthStar);
		fourthStar.click();
		
		//Selecting Health
		driver.findElement(By.xpath("(//span[@class='dropdown-placeholder'])[2]")).click();
		driver.findElement(By.xpath("//*[text()='Health']")).click();
		
		driver.findElement(By.xpath("//*[@class='textarea wrev-user-input validate']")).sendKeys(revComment);
		driver.findElement(By.xpath("//*[@class='sbn-action semi-bold-font btn fixed-w-c tall']")).click();
	}

	private void loginAtWalletHub(String userId2, String userPassword2) {
		// TODO Auto-generated method stub
		
		//click on login button
		driver.findElement(By.cssSelector("span.brgm-button.brgm-signup")).click();
		
		//Enter Creds
		driver.findElement(By.xpath("//input[@ng-model='fields.email']")).sendKeys(userId2);
		driver.findElement(By.xpath("//input[@ng-model='fields.password']")).sendKeys(userPassword2);
		
		//Click on LOgin button
		driver.findElement(By.cssSelector("div.btns")).click();
	}

	private void launchURL(String walletHubURL) 
	{
		// TODO Auto-generated method stub
		driver.get(walletHubURL);
		driver.manage().window().maximize();
		
	}
	
	public void mouse_Hover(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public String generateRandomChars(String candidateChars, int length) {
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    for (int i = 0; i < length; i++) {
	        sb.append(candidateChars.charAt(random.nextInt(candidateChars
	                .length())));
	    }

	    return sb.toString();
	}
}
