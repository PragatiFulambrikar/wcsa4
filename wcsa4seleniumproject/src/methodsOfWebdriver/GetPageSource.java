package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource
{
		public static void main(String[] args) throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe")	;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/OneDrive/Documents/checkbox.html");
		String SourceCode=driver.getPageSource();
		Thread.sleep(2000);
		System.out.println(SourceCode);
		
		//driver.close();
		}
}

