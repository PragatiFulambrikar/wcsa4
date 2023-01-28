package Mock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://desktop-23dko3h/login.do");
			
			WebElement UserNameTextBox = driver.findElement(By.name("username"));
			if (UserNameTextBox.isDisplayed())
			{
				UserNameTextBox.sendKeys("admin");
			}
			else
			{
				System.out.println("username is wrong ");
			}
			Thread.sleep(2000);
			
			WebElement password = driver.findElement(By.name("pwd"));
			
			if(password.isDisplayed())
			{
				password.sendKeys("manager");
			}
			else
			{
				System.out.println("password Wrong");
			}
			Thread.sleep(2000);
			UserNameTextBox.clear();
			password.clear();
			
			driver.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[.='Login']")).click();
		}
}
