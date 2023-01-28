package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByIndex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/Admin/OneDrive/Documents/frame.html");
		
		driver.switchTo().frame(0);
		WebElement usn = driver.findElement(By.id("i1"));
		usn.sendKeys("Admin");
		
		driver.switchTo().parentFrame();
		WebElement password = driver.findElement(By.id("id1"));
		password.sendKeys("manager");
		
		Thread.sleep(3000);
		password.clear();
		
		Thread.sleep(3000);
		driver.switchTo().frame(0);
	    driver.findElement(By.id("i1")).clear();
	}
}
