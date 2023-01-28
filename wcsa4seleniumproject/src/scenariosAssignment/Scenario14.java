package scenariosAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario14 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.id("confirmBtn")).click();
	
	driver.findElement(By.xpath("//a[text()='Coins ']")).click();
	Thread.sleep(2000);
	
	WebElement target = driver.findElement(By.xpath("(//i[@class='icon-ion-chevron-down'])[1]"));
	Actions act = new Actions(driver);
    act.moveToElement(target).perform();
    Thread.sleep(2000);
    WebElement element = driver.findElement(By.xpath("//div[.='1 Gram']"));	
    
    if(element.isDisplayed())
    {
    	element.click();
    	System.out.println("1Gm coin is displayed");
    }
    else 
    {
    	System.out.println("1Gm coin is not displayed");
    }
    driver.close();
}
}
