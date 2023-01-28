package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrimeByScrollDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.primevideo.com/");
	
		WebElement vElement = driver.findElement(By.xpath("(//img[@class='DVPAWebWidgetsCustomComponents_Image__image'])[6]"));
		Point point = vElement.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		System.out.println(xaxis);
		System.out.println(yaxis);
		js.executeScript("window.scrollBy("+xaxis+","+(yaxis-200)+")");
	}
}
