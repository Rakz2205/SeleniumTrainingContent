package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateGoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set chrome driver

		//launching Google url
		System.setProperty("webdriver.chrome.driver", "D:\\CT TP\\Java Selinium Training Content\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");

		//print launced url
		System.out.println(driver.getCurrentUrl());

		//Enter Amazon in search text box using Xpath locator
		String searchKeyword="Amazon";
		
		WebElement fieldWebelement = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		
		fieldWebelement.sendKeys(searchKeyword);
		
		//pressing tab key
		fieldWebelement.sendKeys(Keys.TAB);

		//Click on Google search using css selector
		WebElement searchButton = driver.findElement(By.cssSelector("div.FPdoLc.VlcLAe>center input:nth-of-type(1)"));
		
		searchButton.click();
		
		//Fetch page title
		String latestTitle=driver.getTitle();

		//Validate page title contains Amazon
		System.out.println(latestTitle.contains(searchKeyword));

		//Close browser
		driver.close();
	}

}
