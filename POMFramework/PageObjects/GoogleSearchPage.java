package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage 
{
	public static WebElement ImageAnchorTag(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='q qs'])[4]"));
	}
}
