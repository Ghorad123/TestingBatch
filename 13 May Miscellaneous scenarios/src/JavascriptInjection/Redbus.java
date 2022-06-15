package JavascriptInjection;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) 
	{
		System.out.println("Hello Selenium");

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Chrome exe file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
    WebElement cname=driver.findElement(By.id("src"));
               cname.sendKeys("Pune");
		
        JavascriptExecutor js1=(JavascriptExecutor)driver;
                String  jcityname= "return document.getElementById(\"src\").value;";
                String  cityname =(String)js1.executeScript(jcityname);
                System.out.println(cityname);   //pune
                
           while(!cityname.equalsIgnoreCase("Shivaji Nagar, Pune"))
           {
        	   
        	   System.out.println("In while Loop");
        	   cname.sendKeys(Keys.DOWN);
        	   jcityname= "return document.getElementById(\"src\").value;";
               cityname =(String)js1.executeScript(jcityname);
               System.out.println(cityname);   //Shivaji Nagar,Pune
           }
            driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
            
            // destination
            
   WebElement   cname1=driver.findElement(By.id("dest"));
                cname1.sendKeys("Swargate, Pune");  // Swargate,Pune
   
   JavascriptExecutor js2=(JavascriptExecutor)driver;
              String  jcityname1= "return document.getElementById(\"dest\").value;";
              String  cityname1 =(String)js2.executeScript(jcityname);
              System.out.println(cityname1);   //  Swargate,Pune
           while(!cityname1.equalsIgnoreCase("Swargate, Pune"))
           {
        	   System.out.println("In while Loop 2");
        	   cname1.sendKeys(Keys.DOWN);
        	   jcityname1= "return document.getElementById(\"dest\").value;";
               cityname1 =(String)js2.executeScript(jcityname1);
               System.out.println(cityname1);// Swargate,Pune
           }
           driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);
           
           // calender
           driver.findElement(By.id("onward_cal")).click();
           
     while(!driver.findElement(By.cssSelector("[class='rb-calendar'] [class='monthTitle']")).getText().contains("Jun 2022"))
     {
    	 driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
    	 System.out.println("click on forward button");
     }
           //select day
     List<WebElement> ls=driver.findElements(By.cssSelector("td[class='wd day']"));
		int count=ls.size();
		System.out.println(count);   //31
		for(int i=1; i < count; i++)
		{
			System.out.println("In for Loop");
	String	svalue=driver.findElements(By.cssSelector("td[class='wd day']")).get(i).getText();
	
	if(svalue.equalsIgnoreCase("15"))
	{
		
		driver.findElements(By.cssSelector("td[class='wd day']")).get(i).click();
		
	}
			
		}
     
     
     
     
     
     
     
     
     

	
	}

}
