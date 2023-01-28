package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxEnabled {
	 public static void main(String[] args) {    
	    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 		WebDriver driver=new ChromeDriver();
	 		driver.manage().window().maximize();
	 		driver.get("https://www.facebook.com/login/");
	 		WebElement ele = driver.findElement(By.name("email"));
	 		boolean val = ele.isEnabled();
	 		System.out.println(val);
	 		if(val)
	 		{
	 			System.out.println("testbox is enabled");
	 		}
	 		else
	 		{
	 			System.out.println("testbox is not enabled");
	 	    }
	     }
}
