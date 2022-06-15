package Calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yearpicker {

	public static void main(String[] args)
	{
		System.out.println("Hello Selenium");

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Chrome exe file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		
	while(!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-year']")).getText().contains("2021"))
	{
		driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-w']")).click();
	
    while(!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("December"))
    {
    	driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-w']")).click();
    }	
List<WebElement> ls=driver.findElements(By.cssSelector("td[data-handler='selectDay']"));

            int count=ls.size();
            System.out.println(count);
             for(int i=0; i < count; i++)
{
	System.out.println("In for Loop");
String	svalue=driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();

if(svalue.equalsIgnoreCase("4"))
{

driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();

}
	
}
		
		
	}
		
	}

}
