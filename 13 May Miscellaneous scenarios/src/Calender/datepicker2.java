package Calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker2 {

	public static void main(String[] args) 
	{
		System.out.println("Hello Selenium");

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Chrome exe file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		while(!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("July"))
			
		{
			System.out.println("In while Loop");
			driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-e']")).click();
	     }
		         List<WebElement>  ls=driver.findElements(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] td[data-handler='selectDay']"));
		                        int  count=ls.size();
		                        System.out.println(count);       //31
		/*
		 * for(int i=0; i<count; i++) { String svalue=driver.findElements(By.
		 * cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] td[data-handler='selectDay']"
		 * )).get(i).getText();
		 * 
		 * if(svalue.equalsIgnoreCase("30"))
		 * 
		 * { driver.findElements(By.
		 * cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] td[data-handler='selectDay']"
		 * )).get(i).click(); } }
		 */

	   for (WebElement date : ls) 
	   {
		
                 String  value=date.getText();
                 System.out.println(value);
                 
           if (value.equalsIgnoreCase("12")) 
           {
			
		             date.click();
           
           }      
	   
	   }
	
	   
	   
	}

}
