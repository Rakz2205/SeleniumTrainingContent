package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.DriverClass;
import BaseClass.GenericVariable;
import BaseClass.Utilities;
import PageObjects.GoogleHome;
import PageObjects.GoogleSearchPage;

public class ValidateImageLink {

	public static void main(String[] args) 
	{
		//launching Google url
		
		WebDriver driver=DriverClass.getDriver();
		driver.get(GenericVariable.googleURL);
		
		//Enter Amazon in search text box using Xpath locator
		String searchKeyword=GenericVariable.searchString;
			
		WebElement fieldWebelement=GoogleHome.searchEditBox(driver);
		
		//fieldWebelement.sendKeys(searchKeyword);
		Utilities.enterText(fieldWebelement, searchKeyword);
		
		//pressing tab key
		fieldWebelement.sendKeys(Keys.TAB);
		
		//Click on Google search using css selector
		WebElement searchButton = GoogleHome.searchButton(driver);
		
		Utilities.clickElement(searchButton);
		//validate Image link text is Images
		
		WebElement linkImg=GoogleSearchPage.ImageAnchorTag(driver);
		String uiLinkText=Utilities.getText(linkImg);
		
		System.out.println(uiLinkText.equalsIgnoreCase(GenericVariable.matchString));
	}

}
