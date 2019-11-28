package Day7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenExample 
{
	public static void main(String[] args) throws IOException {
		
		// related chrome and driver
		System.setProperty("webdriver.chrome.driver", "D:\\CT TP\\Java Selinium Training Content\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		
		//importing excel sheet
		File srcFile=new File("D:\\CT TP\\Java Selinium Training Content\\Links\\DataSheetSampleForm.xls");
	
		//load the file
		FileInputStream finput=new FileInputStream(srcFile);
		
		//load workbook
		
		HSSFWorkbook workbook =new HSSFWorkbook(finput);
		
		//load sheet
		HSSFSheet sheet=workbook.getSheetAt(0);
		
		//fetch the value
		HSSFCell cell;
		
		for(int excelInc=0;excelInc<sheet.getLastRowNum();excelInc++)
		{
			//first name
			cell=sheet.getRow(excelInc).getCell(0);
			String firstName=cell.getStringCellValue();
			driver.findElement(By.name("firstname")).sendKeys(firstName);
			
			//last name
			cell=sheet.getRow(excelInc).getCell(1);
			String lastName=cell.getStringCellValue();
			driver.findElement(By.name("lastname")).sendKeys(lastName);
			
			// click on submit button 
			driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			
			
			//fetching Current URL
			String currUrl=driver.getCurrentUrl();
			
			//Validating scenario
			if(currUrl.contains(firstName) && currUrl.contains(lastName))
			{
				System.out.println(firstName + " " + lastName + " is present in the URL");
			}
			else
			{
				System.out.println(firstName + " " + lastName + " is not present in the URL");
			}
		}
	
	}	
}
