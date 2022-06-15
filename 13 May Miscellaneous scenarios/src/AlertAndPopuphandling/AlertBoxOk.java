package AlertAndPopuphandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxOk {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("alert box with ok"); 
		  System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Chrome exe file\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
		driver.get("http://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		// click on alert 
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		Thread.sleep(2000);
		//click on popup with ok
		driver.switchTo().alert().accept();
		
	}

}
