package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneByIdOrName {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.bluestone.com/");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='Not now']")).click();
	Thread.sleep(2000);
	
	driver.switchTo().frame("fc_widget");
	Thread.sleep(2000);
	driver.findElement(By.id("chat-icon")).click();
	driver.findElement(By.id("chat-fc-name")).sendKeys("Admin");
	}
}
