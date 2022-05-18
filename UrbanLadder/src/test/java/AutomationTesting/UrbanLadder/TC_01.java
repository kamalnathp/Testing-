package AutomationTesting.UrbanLadder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "C:\\program Files\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.urbanladder.com/");
			driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
			driver.findElement(By.xpath("//a[@class='signup-link authentication_popup']")).click();
			driver.findElement(By.xpath("//input[@class='textfield email required input_authentication email-suggest']")).sendKeys("kamalnath@gmail.com");
			driver.findElement(By.xpath("//input[@class='textfield required input_authentication']")).sendKeys("K@mal123ram");
			driver.findElement(By.xpath("//input[@value='Sign Up']")).click();

	}

}
