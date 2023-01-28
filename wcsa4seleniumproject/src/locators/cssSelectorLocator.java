package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-23dko3h/login.do");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name^='user']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name^='pwd']")).sendKeys("manager");
        driver.findElement(By.cssSelector("a[href^='javascript']")).click();
        
	}
}
