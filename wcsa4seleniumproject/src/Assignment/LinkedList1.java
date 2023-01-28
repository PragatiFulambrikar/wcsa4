package Assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkedList1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/Admin/OneDrive/Documents/menu1.html");
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		Select sel = new Select(dropDownElement);
		List<WebElement> allOptions = sel.getOptions();
		
		LinkedList<String> s = new LinkedList<String>();
		for(int i=0;i<allOptions.size();i++)
		{
			WebElement opts = allOptions.get(i);
			String values = opts.getText();
			s.add(values);	
		}
		
		for(String options:s)
		{
			System.out.println(options);
		}
		}
}

