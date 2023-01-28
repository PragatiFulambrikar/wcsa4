package testNGPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class selectBrowser {
  WebDriver driver;
  @Test
  @Parameters({"browserValue","url"})
  public void openBrowser(String browser,String Url) 
  {
	  if(browser.equals("chrome"))
	  {
	  System.setProperty("webdriver.chrome.browser","./drivers/chromedriver.exe");
	  driver =new ChromeDriver();
   	  driver.manage().window().maximize();
   	  driver.get(Url);
      }
	  else if(browser.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.browser","./drivers/geckodriver.exe");
		  driver =new FirefoxDriver();
	   	  driver.manage().window().maximize();
	   	  driver.get(Url);	  
	  }
	  else
	  {
		  Reporter.log("enter valid browserValue",true);
	  }
	}
}