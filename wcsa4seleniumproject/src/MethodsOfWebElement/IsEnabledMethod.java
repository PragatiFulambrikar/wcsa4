package MethodsOfWebElement;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.instagram.com/");
		
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("_pragati_1999");
		driver.findElement(By.name("password")).sendKeys("idontknow");
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class,'_acan _aiit _acap _aijb _acas _aj1-')]"));
		boolean status = loginButton.isEnabled();
		System.out.println(status);
}
}