package AlertAndPopuphandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertwithOk {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("alert with ok");
		  System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Chrome exe file\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		//click on button to display an alert box 
	    driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	    // click on popup with ok
	    Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
	}

}
