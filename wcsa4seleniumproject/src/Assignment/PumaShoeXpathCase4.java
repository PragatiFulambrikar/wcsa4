package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PumaShoeXpathCase4 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en?gclid=Cj0KCQiA1sucBhDgARIsAFoytUvRhHW0sdLP9_X2NKSf3F6yOigw-ZYOmoFyLAnNxFWLaUWb6f1L1TIaAvqKEALw_wcB&utm_aud=OTH&utm_campaign=BS_GGL_SEA_TXT_OTH_Brand_New&utm_medium=BS&utm_obj=OLC&utm_source=GGL");
	
	   Thread.sleep(2000);
	   driver.findElement(By.id("cookie-banner-close-btn")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//h3[@class='tw-8216tu' and (@title='Softride Pro Coast Training Shoes')]")).click();
	   //Thread.sleep(2000);
		//driver.close();
	}
}
