package Frame.inout.Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery {

	public static void main(String[] args)
	{
		System.out.println("frame in-out concept");
		  System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Chrome exe file\\chromedriver.exe");
               WebDriver driver=new ChromeDriver();
	             driver.get("https://jqueryui.com/droppable/");
	             driver.manage().window().maximize();
	             driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	            //click on droppable
	             driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
	            //frame in
	             driver.switchTo().frame(0);
            WebElement   sourse=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));	   
            WebElement    target=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
            Actions act=new Actions(driver);
            act.dragAndDrop(sourse, target).build().perform();
               // frame out
            driver.switchTo().defaultContent();
              //click on about
            driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[8]/a")).click();
	}

}
