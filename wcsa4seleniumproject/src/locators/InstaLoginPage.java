package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("_pragati_1999");
		driver.findElement(By.name("password")).sendKeys("pragati@123");
		driver.findElement(By.cssSelector("button[class='_acan _acap _acas']")).click();
		//Thread.sleep(4000);
		//driver.close();
	}
}
