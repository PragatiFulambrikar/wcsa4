package scenariosAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenarios5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("confirmBtn")).click();
		driver.findElement(By.xpath("//a[.='Rings']")).click();
		driver.findElement(By.xpath("//a[.='Diamond' and @title='Diamond Rings']")).click();
		
		Actions act=new Actions(driver);
		WebElement ClickAndHold = driver.findElement(By.xpath(""));
	    for(int i=0;i<=2;i++)
	    {
	    	act.clickAndHold(ClickAndHold).perform();
	    }
	}

}
