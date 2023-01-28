package qsp;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
public static void main(String[] args) throws InterruptedException
{
Scanner sc=new Scanner(System.in);
System.out.println("Which Browser you want to open");
String browservalue=sc.next();

if(browservalue.equalsIgnoreCase("chrome"))
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(4000);
	driver.close();
}
else if(browservalue.equalsIgnoreCase("firefox"))
{
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	FirefoxDriver 
	driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(4000);
	driver.close();
}
else
{
	System.out.println("enter valid browser name");
}
}
}

