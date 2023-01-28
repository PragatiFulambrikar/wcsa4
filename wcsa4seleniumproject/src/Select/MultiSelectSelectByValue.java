package Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectSelectByValue {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("file:///C:/Users/Admin/OneDrive/Documents/menu1.html");
	WebElement dropDownElement = driver.findElement(By.id("menu"));
	Select sel = new Select(dropDownElement);
	sel.selectByValue("v4");
}
}
