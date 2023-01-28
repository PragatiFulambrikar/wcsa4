package scenariosAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenarios3 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://jqueryui.com/droppable/");
        
        WebElement src = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
        WebElement target = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable ui-state-highlight']"));
        Actions act=new Actions(driver);
        act.dragAndDrop(src, target).build().perform();
        Thread.sleep(2000);
        
	}
}
