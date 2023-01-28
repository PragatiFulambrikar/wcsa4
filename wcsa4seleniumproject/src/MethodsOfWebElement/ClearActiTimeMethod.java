package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearActiTimeMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("http://desktop-23dko3h/login.do");
		
		WebElement UsernameNameTextBox = driver.findElement(By.name("username"));
		 UsernameNameTextBox.sendKeys("admin");
	
		 WebElement PasswordTextBox = driver.findElement(By.name("pwd"));
		 PasswordTextBox.sendKeys("manager");
		 Thread.sleep(2000);
		 UsernameNameTextBox.clear();
		 PasswordTextBox.clear();		 
}
}
