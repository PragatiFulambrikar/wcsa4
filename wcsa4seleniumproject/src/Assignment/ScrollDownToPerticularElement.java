package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownToPerticularElement 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://www.selenium.dev/downloads/");
        
        WebElement rubyElement = driver.findElement(By.xpath("//p[.='Ruby']"));
        Point point = rubyElement.getLocation();
        int xaxis = point.getX();
        int yaxis = point.getY();
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        System.out.println(xaxis);
        System.out.println(yaxis);
        js.executeScript("window.scrollBy("+xaxis+","+(yaxis-200)+")");
	}
}
