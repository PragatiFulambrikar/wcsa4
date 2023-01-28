package popUps;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	ChromeOptions co=new ChromeOptions();
	//maximize the browser without calling manage method
	co.addArguments("--Start-maximized");
	Thread.sleep(2000);
    //to handle notification popup
	co.addArguments("--disable-notifications");
	
	WebDriver driver=new ChromeDriver(co);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://in.puma.com/");
}
}
