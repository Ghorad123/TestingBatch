package JavascriptInjection;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KSRTC {

	public static void main(String[] args)
	{
		System.out.println("Hello Selenium");

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Chrome exe file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//scroll by
		JavascriptExecutor js=(JavascriptExecutor)driver;
		       js.executeScript("scrollBy(0,350)");
         //find locater by id  of leaving from
		WebElement cname=driver.findElement(By.id("fromPlaceName"));
		           cname.sendKeys("BENG");
		   //take method of javascript
		 JavascriptExecutor js1=(JavascriptExecutor)driver;
		      String jcityname= "return document.getElementById(\"fromPlaceName\").value;";
		         String cityname=(String)js1.executeScript(jcityname);
		      System.out.println(cityname);  // BENG
		   //while loop
		   while(!cityname.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) 
		   {
			   cname.sendKeys(Keys.DOWN);
			   jcityname="return document.getElementById(\"fromPlaceName\").value;";
			   cityname=(String)js1.executeScript(jcityname);
			   System.out.println(cityname);
		 }
		   driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
		   
		// ==========================================================================  
		   
			
      //find locater by id to the place
		WebElement cname1=driver.findElement(By.id("toPlaceName"));
		           cname1.sendKeys("BA");
		   //take method of javascript
		 JavascriptExecutor js2=(JavascriptExecutor)driver;
		      String jcityname1= "return document.getElementById(\"toPlaceName\").value;";
		         String cityname1=(String)js2.executeScript(jcityname1);
		      System.out.println(cityname1);  // CHI
		   //while loop
		   while(!cityname1.equalsIgnoreCase("BAGEPALLI")) 
		   {
			   cname1.sendKeys(Keys.DOWN);
			   jcityname1="return document.getElementById(\"toPlaceName\").value;";
			   cityname1=(String)js2.executeScript(jcityname1);
			   System.out.println(cityname1);
		 }
		   driver.findElement(By.id("toPlaceName")).sendKeys(Keys.ENTER);
		   
	   // date 
	   driver.findElement(By.id("txtJourneyDate")).click();
 while(!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("June"))
 {
	 
	 driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-next ui-corner-all']")).click();
 }   
        java.util.List<WebElement>  ls=driver.findElements(By.cssSelector("td[data-handler='selectDay']"));	   
		   
        int count=ls.size();
		System.out.println(count);
		for(int i=0; i < count; i++)
		{
			System.out.println("In for Loop");
	String	svalue=driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
	
	if(svalue.equalsIgnoreCase("15"))
	{
		
		driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
		break;
		
	}
	 
	// return date
	driver.findElement(By.xpath("//*[@id=\"txtReturnJourneyDate\"]")).click();
	while(!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("June"))
			{
		driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-next ui-corner-all']")).click();
			}
	     List<WebElement>  ls1=driver.findElements(By.cssSelector("td[data-handler='selectDay']"));
	     for(int j=0; j < count; j++)
			{
				System.out.println("In for Loop");
		String	svalue1=driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
		
		if(svalue.equalsIgnoreCase("20"))
		{
			
			driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
			
			
		}
			
		}
		}  
	}
	}


