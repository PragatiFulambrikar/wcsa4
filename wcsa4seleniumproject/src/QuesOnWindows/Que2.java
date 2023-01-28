package QuesOnWindows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que2 {
	public static void main(String[] args) throws InterruptedException {
		//how to close parent and child browser without using quit() method
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		System.out.println("----------------");
		
       Set<String> allHandles = driver.getWindowHandles();	
       for(String wh:allHandles)
       {
    	   System.out.println(wh);
    	   driver.switchTo().window(wh).close();
       }
	}
}
