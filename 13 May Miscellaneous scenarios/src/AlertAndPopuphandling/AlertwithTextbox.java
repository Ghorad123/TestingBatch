package AlertAndPopuphandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertwithTextbox {

	public static void main(String[] args) 
	{
		System.out.println("alert with gettextbox");
		  System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Chrome exe file\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//click on alert with textbox
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		//click the button to demonstrate the prompt box
         driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
         // send data in textbox
         driver.switchTo().alert().sendKeys("cjc");
         // get text data
    String val=driver.switchTo().alert().getText();
      driver.switchTo().alert().accept();
      System.out.println(val);
               
		
	}

}
