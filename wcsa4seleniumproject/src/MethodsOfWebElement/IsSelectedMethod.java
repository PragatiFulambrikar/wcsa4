package MethodsOfWebElement;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-23dko3h/login.do");
	    WebElement checkBox = driver.findElement(By.name("remember"));	
	    boolean status1 = checkBox.isSelected();
	    System.out.println(status1);//false
	    checkBox.click();
	    Thread.sleep(4000);
	    boolean status2 = checkBox.isSelected();
	    System.out.println(status2);
	}
}
