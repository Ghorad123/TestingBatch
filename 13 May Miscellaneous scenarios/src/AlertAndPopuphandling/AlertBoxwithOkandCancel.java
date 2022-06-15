package AlertAndPopuphandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxwithOkandCancel {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("alert with cancel");
		  System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Chrome exe file\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
		driver.get("http://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		//click on confirm alert box
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		Thread.sleep(2000);
	   //click on popup with cancel
		driver.switchTo().alert().dismiss();
		
		driver.close();
	}

}

