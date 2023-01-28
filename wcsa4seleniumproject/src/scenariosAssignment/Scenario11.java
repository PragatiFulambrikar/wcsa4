package scenariosAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://www.bluestone.com/");
        driver.findElement(By.id("confirmBtn")).click();
		
		 WebElement target = driver.findElement(By.xpath(" //li[@class='menuparent offers-menuparent pull-right']"));
		Actions act = new Actions(driver);
	    act.moveToElement(target).perform();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//li[.='Up to 50% Off On Making Charges']"));
	    Thread.sleep(2000);
	}
}
