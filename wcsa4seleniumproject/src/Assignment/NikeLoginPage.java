package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NikeLoginPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/sg/member/profile/login?continueUrl=https://www.nike.com/sg/?cp=76060516106_aff_P%2F%2FYg3UM8Yg&ranMID=41134&ranEAID=P%2F%2FYg3UM8Yg&ranSiteID=P__Yg3UM8Yg-7Y8S0W5ISWADQSdsCz._BA");
		driver.findElement(By.xpath("//input[@id='bd82ebe8-83c9-4989-8053-54a5cbc314ca']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='1ac40bf4-8ce1-4d3b-8f3a-4a5b0bafc3b6']")).sendKeys("1234");	
		driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.quit();
	}

}
