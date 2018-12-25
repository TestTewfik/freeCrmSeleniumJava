package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tbela_000\\Desktop\\Selenium\\drivers\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver(); 
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.freecrm.com");
		
		driver.findElement(By.name("username")).sendKeys("tewfik");
		driver.findElement(By.name("password")).sendKeys("Titcho02");
		 
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
