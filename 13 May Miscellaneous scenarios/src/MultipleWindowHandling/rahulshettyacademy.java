package MultipleWindowHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahulshettyacademy {

	private static final String ArrayList = null;

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Hello Selenium");

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Chrome exe file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		// inspect anywhere
		List<WebElement>  ls=driver.findElements(By.tagName("a"));
		// total hyperlink in site     
		            int totalhc=ls.size();
		            System.out.println(totalhc);      //27
		            // all footer 
		            WebElement pfd=driver.findElement(By.id("gf-BIG"));
		            
		  List<WebElement>   fhyls =pfd.findElements(By.tagName("a"));
		               int  totalph=fhyls.size();
		               System.out.println(totalph);    //20
		  //hpperlink seprate
		          WebElement  sf=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		                     List<WebElement> phy=sf.findElements(By.tagName("a"));
		                    int totalph1= phy.size();
		                    
		                    System.out.println("particulate hy "+totalph1);           //4
		               for(int i=1; i<totalph1; i++ )
		               {
		            	   
		           String clicklink=Keys.chord(Keys.CONTROL,Keys.ENTER);
		            	    sf.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
		            	    Thread.sleep(2000);
		               }
		               Set<String> keys = driver.getWindowHandles();
		               System.out.println(keys);  // values in set
		               ArrayList<String> al=new ArrayList<String>(keys);
		               System.out.println("List"+al);
		              String singleek=al.get(1);
		               System.out.println(singleek);
		              Iterator<String> itr=al.iterator();
		              while(itr.hasNext())
		              {
		            	  driver.switchTo().window(itr.next());
		            	    String  title=driver.getTitle();
		            	    System.out.println("Title is"+title);
		          if(title.equalsIgnoreCase("Rest APT Tutorial"))
		          {
		        	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/ul/ul/li[1]/a")).click();
		          }
		            	    
		              }
		               
		               
		               
		               
		               
		               
		               
		               
		               
	}

}
