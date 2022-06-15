package Frame.inout.Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumdev {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Chrome exe file\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
           driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
           driver.manage().window().maximize();
           driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
           
          System.out.println("frame1");
          WebElement  fr1=driver.findElement(By.xpath("//iframe[@src='overview-frame.html']"));
          driver.switchTo().frame(fr1);
          driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
          Thread.sleep(2000);
          driver.navigate().back();
          driver.switchTo().defaultContent();
          System.out.println("first frame is completed");
          
          System.out.println("frame2");
          WebElement  fr2=driver.findElement(By.xpath("//iframe[@src='allclasses-frame.html']"));
          driver.switchTo().frame(fr2);
          driver.findElement(By.xpath("//a[@title='class in org.openqa.selenium.support.pagefactory']")).click();
          Thread.sleep(2000);
          driver.navigate().back();
          driver.switchTo().defaultContent();
          System.out.println("second frame is completed.");
          
          System.out.println("frame3");
          WebElement fr3=driver.findElement(By.xpath("//iframe[@name='classFrame']"));
          driver.switchTo().frame(fr3);
          driver.findElement(By.xpath("//*[@id=\"i0\"]/th/a")).click();
          Thread.sleep(2000);
          driver.navigate().back();
          driver.switchTo().defaultContent();
          System.out.println("third frame is completed.");
          
          
          
          
          
          
	}

}
