package RandD;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EwayBillFinder 
{
	public static void main(String[] args) throws IOException {
		
		// related chrome and driver
		System.setProperty("webdriver.chrome.driver", "D:\\CT TP\\Java Selinium Training Content\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ewaybillgst.gov.in/login.aspx");
		
		driver.navigate().to("https://ewaybillgst.gov.in/Reports/CommomReport.aspx?id=3");
		//importing excel sheet
		File srcFile=new File("D:\\Personal Docs\\R.K Marketing\\reena teena\\Eway bill details.xls");
	
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
			String startDate=cell.getStringCellValue();
			
			
			//last name
			cell=sheet.getRow(excelInc).getCell(1);
			String endDate=cell.getStringCellValue();
			
			
			driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtDate']")).clear();   
			driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtDate']")).sendKeys(startDate);
			
			
			driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtDate1']")).clear();
			driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtDate1']")).sendKeys(endDate);
			
			driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$btn_submit']")).click();
			
			
			List<WebElement> trList = driver.findElements(By.xpath("//table[@class='table table-bordered ']//tr"));
			
			
			for(int i=1;i<trList.size()-1;i++)
			{
				List<WebElement> str = trList.get(i).findElements(By.tagName("td"));
				
				String data = str.get(0).getText();
				
				System.out.println(data.substring(0, 12));
			}
			
			
			
			//System.out.println(startDate + "===" + endDate);
		}
	
	}	
}
