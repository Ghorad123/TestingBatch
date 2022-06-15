package AlertAndPopuphandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxwithTextBox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("alert with textbox");
		  System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Chrome exe file\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
		driver.get("http://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		//click on prompt alert box
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		Thread.sleep(2000);
		//send data in popup as yes
		driver.switchTo().alert().sendKeys("yes");
		
		//get text as do you like automation
         String val1=driver.switchTo().alert().getText();
         driver.switchTo().alert().accept();
         System.out.println(val1);
         
		
	}

}
