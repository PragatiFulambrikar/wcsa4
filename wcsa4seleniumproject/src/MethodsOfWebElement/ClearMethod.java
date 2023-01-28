package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement UsernameNameTextBox = driver.findElement(By.name("username"));
		 UsernameNameTextBox.sendKeys("Admin");
		 Thread.sleep(2000);
		 UsernameNameTextBox.clear();
		 WebElement PasswordTextBox = driver.findElement(By.name("password"));
		 UsernameNameTextBox.sendKeys("admin123");
		 Thread.sleep(2000);
		 UsernameNameTextBox.clear();
}
}