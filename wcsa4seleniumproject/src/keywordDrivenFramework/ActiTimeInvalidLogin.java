package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLogin extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
	    bt.openBrowser();
		
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH, "invalidCreds");
		for(int i=1;i<=rc;i++)
		{
			String usn = flib.readExcelData(EXCEL_PATH, "invalidCreds",i,0);
			String pass = flib.readExcelData(EXCEL_PATH, "invalidCreds",i,1);

			driver.findElement(By.name("username")).sendKeys(usn);
			driver.findElement(By.name("pwd")).sendKeys(pass); 
		    driver.findElement(By.id("loginButton")).click();
		    
		    Thread.sleep(2000);
		    driver.findElement(By.name("username")).clear();
	   }
		bt.closeBrowser();
	   }
}
