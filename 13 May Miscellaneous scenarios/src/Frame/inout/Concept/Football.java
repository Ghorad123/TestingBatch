package Frame.inout.Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Football {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Chrome exe file\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
           driver.get("https://javascript.info/mouse-drag-and-drop");
           driver.manage().window().maximize();
           driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
           Actions act=new Actions(driver);
           
           System.out.println("frame1");
     WebElement  wb =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/main/div[1]/article/div[2]/div[2]/iframe"));
                driver.switchTo().frame(wb);
      WebElement  Source =driver.findElement(By.xpath("//*[@id=\"ball\"]"));
     WebElement target=driver.findElement(By.xpath("/html/body"));
     act.clickAndHold(Source).moveToElement(target).build().perform();
     driver.switchTo().defaultContent();
     System.out.println("frame1 completed");
     
     Thread.sleep(2000);
     
     System.out.println("frame2");
     WebElement   fr2=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/main/div[1]/article/div[2]/div[4]/iframe"));
     driver.switchTo().frame(fr2);
     WebElement src=driver.findElement(By.xpath("//*[@id=\"ball\"]"));
     WebElement trc=driver.findElement(By.xpath("/html/body"));
     act.clickAndHold(src).moveToElement(trc).build().perform();
     driver.switchTo().defaultContent();
     System.out.println("frame2 completed.");
     
      Thread.sleep(2000);
     
     System.out.println("frame3");
     WebElement fr3=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/main/div[1]/article/div[2]/div[7]/iframe"));
     driver.switchTo().frame(fr3);
     WebElement  src1=driver.findElement(By.xpath("//*[@id=\"ball\"]"));
     WebElement  trc1=driver.findElement(By.xpath("/html/body"));
     act.clickAndHold(src1).moveToElement(trc1).build().perform();
     driver.switchTo().defaultContent();
     System.out.println("frame3 completed.");
     
         Thread.sleep(2000);
     System.out.println("frame4");
     WebElement     fr4=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/main/div[1]/article/div[2]/div[11]/div[2]/div[1]/iframe"));
     driver.switchTo().frame(fr4);
 WebElement src2=driver.findElement(By.xpath("//*[@id=\"ball\"]"));
 WebElement trc2=driver.findElement(By.xpath("//*[@id=\"gate\"]"));
 act.dragAndDrop(src2, trc2).build().perform();
 driver.switchTo().defaultContent();
 System.out.println("football in basket");
                           
     
     
     
     
           
	}

}
