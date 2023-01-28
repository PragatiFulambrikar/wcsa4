package JavaScriptExecutor;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledUsername {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.navigate().to("file:///C:/Users/Admin/OneDrive/Documents/disabledUsername.html");
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(2000);
        js.executeScript("document.getElementById('i1').value='admin'");
	}
}
