package scenariosAssignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenarios4 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Which Browser you want to open");
		String browservalue=sc.next();

		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.ebay.com/");
			driver.findElement(By.id("gh-ac")).sendKeys("Apple Watches");
			driver.findElement(By.id("gh-cat")).click();
			
			Robot robot=new Robot();
			for(int i=0;i<15;i++)
			{
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				Thread.sleep(2000);
				robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			}
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			//driver.close();
		}
	}	
}