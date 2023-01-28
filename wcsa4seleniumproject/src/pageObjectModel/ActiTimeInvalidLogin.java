package pageObjectModel;

import java.io.IOException;

public class ActiTimeInvalidLogin extends BaseTest{
public static void main(String[] args) throws IOException, InterruptedException {
	 BaseTest bt = new BaseTest();
	 bt.openBrowser();
	 
	 Flib flib = new Flib();
	 LoginPage lp = new LoginPage(driver);
	 int rc = flib.rowCount(EXCEL_PATH, "invalidCreds");
	 for(int i=1;i<=rc;i++)
	 {
		String invalidUsername = flib.readExcelData(EXCEL_PATH, "invalidCreds",i, 0);
		String invalidPassword = flib.readExcelData(EXCEL_PATH, "invalidCreds",i, 1);
		lp.actiTimeInvalidLogin(invalidUsername, invalidPassword);
     }
	 bt.closeBrowser();
}
}
