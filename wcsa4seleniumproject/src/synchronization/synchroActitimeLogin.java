package synchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class synchroActitimeLogin {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("http://desktop-23dko3h/login.do");
	String actualLoginPageTitle = driver.getTitle();
	if(actualLoginPageTitle.equals("actiTIME - Login"))
	{
		System.out.println("Login Page title is match:test case is passed!");
	}
	else
	{
		System.out.println("Home Page title is match:test case is failed!");
	}
	//Thread.sleep(4000);
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//a[.='Login']")).click();
	Thread.sleep(8000);
	String actualHomePageTitle = driver.getTitle();
	if(actualHomePageTitle.equals("actiTIME - Enter Time-Track"))
	{
		System.out.println("Home Page title is match:test case is passed!");
	}
	else
	{
		System.out.println("Home Page title is match:test case is faild!");
	}
	}
}
