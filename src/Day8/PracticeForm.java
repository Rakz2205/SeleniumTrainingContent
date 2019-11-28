package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set chrome driver

		//launch url
		//https://www.toolsqa.com/automation-practice-form/
		System.setProperty("webdriver.chrome.driver", "D:\\CT TP\\Java Selinium Training Content\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		
		
		//radio button
		
		WebElement radioButton = driver.findElement(By.id("sex-0"));
		
		System.out.println("Radio button isDisplayed : "+radioButton.isDisplayed());
		System.out.println("Radio button isEnabled : "+radioButton.isEnabled());
		System.out.println("Radio button isSelected : "+radioButton.isSelected());
		
		radioButton.click();
		
		System.out.println("Radio button isSelected after click: "+radioButton.isSelected());
		
		
		// checkbox
		WebElement checkBox = driver.findElement(By.id("profession-0"));
		
		System.out.println("checkBox isDisplayed : "+checkBox.isDisplayed());
		System.out.println("checkBox isEnabled : "+checkBox.isEnabled());
		System.out.println("checkBox isSelected : "+checkBox.isSelected());
		
		checkBox.click();
		
		System.out.println("checkBox isSelected after click : "+checkBox.isSelected());
		
		
		//dropdown
		
		Select select=new Select(driver.findElement(By.id("continents")));
		select.selectByIndex(3);
		


	}

}
