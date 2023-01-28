package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollDownUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.navigate().to("https://www.selenium.dev/");
        
        JavascriptExecutor js =(JavascriptExecutor)driver;
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,5000)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-5000)");
	}
}
