package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class HandleUsernamePassword {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/UsernamePassword.html");
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement username = driver.findElement(By.id("i1"));
        if(username.isEnabled())
        {
        	username.sendKeys("admin");
        	System.out.println("if block is Executed");
        }
        else
        {
            js.executeScript("document.getElementById('i1').value='admin'");	
            System.out.println("else block is executed");
        }
        Thread.sleep(2000);
        WebElement Password = driver.findElement(By.id("i2"));
        if(Password.isEnabled())
        {
        	Password.sendKeys("manager");
        	System.out.println("if block is executed");
        }
        else
        {
        	js.executeScript("document.getElementById('i2').value='manager'");	
        	System.out.println("else block is executed");
        }
	}
}
