package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHome 
{
	public static WebElement searchEditBox(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	}
	
	public static WebElement searchButton(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("div.FPdoLc.VlcLAe>center input:nth-of-type(1)"));
	}
	
	
}
