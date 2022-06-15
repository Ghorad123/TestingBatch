package CaptureScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTours {

	public static void main(String[] args) throws IOException 
	{
     
		 System.out.println("Take Screenshot");
		    System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Chrome exe file\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		      driver.get("https://demo.guru99.com/test/newtours/register.php");    
		      driver.manage().window().maximize();
		      driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS );
		      driver.findElement(By.name("firstName")).sendKeys("rahul");
		      driver.findElement(By.name("lastName")).sendKeys("ghorad");
		      driver.findElement(By.name("phone")).sendKeys("02482237220");
		      driver.findElement(By.name("userName")).sendKeys("rahulghorad@gmail.com");
		      driver.findElement(By.name("address1")).sendKeys("karvenagar");
		      driver.findElement(By.name("city")).sendKeys("pune");
		      driver.findElement(By.name("state")).sendKeys("mharashtra");
		      driver.findElement(By.name("postalCode")).sendKeys("431203");
		        WebElement drp=driver.findElement(By.tagName("select"));
		            Select s=new Select(drp);
		                s.selectByIndex(4);
		     driver.findElement(By.name("email")).sendKeys("rahu@gmail.com");
		     driver.findElement(By.name("password")).sendKeys("cjc123");

		     driver.findElement(By.name("confirmPassword")).sendKeys("cjc123");
		     driver.findElement(By.name("submit")).click();
		     
		     // Take screenshot
		     File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		     FileUtils.copyFile(src, new File("F:\\Screenshot\\b.png"));
		     
		    
		    
	}

}
