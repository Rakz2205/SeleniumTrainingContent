package BaseClass;

import org.openqa.selenium.WebElement;

public class Utilities 
{
	public static String getText(WebElement webElement)
	{
		// explicit wait can be added to wait till element is located
		
		return webElement.getText();
	}
	
	public static void clickElement(WebElement webElement)
	{
		// explicit wait can be added to wait till element is located
		
		webElement.click();
	}
	
	public static void enterText(WebElement webElement,String textToEnter)
	{
		// explicit wait can be added to wait till element is located
		
		webElement.sendKeys(textToEnter);
	}
	
}
