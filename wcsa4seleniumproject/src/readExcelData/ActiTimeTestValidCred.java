package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTestValidCred {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-23dko3h/login.do");
	    Thread.sleep(2000);
	    FileInputStream fis = new FileInputStream("./data/ActitimeTestData.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet("validCreds");
	    Row row = sheet.getRow(1);
	    Cell cell = row.getCell(0);
	    String username = cell.getStringCellValue();
	    
	    FileInputStream fis2 = new FileInputStream("./data/ActitimeTestData.xlsx");
	    Workbook wb2 = WorkbookFactory.create(fis2);
	    Sheet sheet2 = wb2.getSheet("validCreds");
	    Row row2 = sheet2.getRow(1);
	    Cell cell2 = row2.getCell(1);
	    String password = cell2.getStringCellValue();
	    
	    driver.findElement(By.name("username")).sendKeys(username);
	    Thread.sleep(2000);
		 driver.findElement(By.name("pwd")).sendKeys(password); 
		 Thread.sleep(2000);
		 driver.findElement(By.id("loginButton")).click(); 
	}

}
