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

public class Naukri {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Hello Selenium");

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Chrome exe file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		// total hyperlink
                  List<WebElement>   thypl=driver.findElements(By.tagName("a"));
            int  total=thypl.size();
            System.out.println("total hyperlink"+total);
            
        //footer hyperlink
             WebElement  fhypl=driver.findElement(By.xpath("//*[@id=\"Footer\"]/div[1]/div/div"));
	                 List<WebElement> totalfhypl=fhypl.findElements(By.tagName("a"));
	                 int hypinfooter =totalfhypl.size();
	                 System.out.println("total hyperlinl in footer"+hypinfooter);
	         // seprate hyperlink
	            WebElement  sf=driver.findElement(By.xpath("//*[@id=\"Footer\"]/div[1]/div/div/div[2]/ul"));
	              List<WebElement>  totalshypf=sf.findElements(By.tagName("a"));
	                int totalph1 =totalshypf.size();
	                System.out.println("particulate hy:"+totalph1);
	        //multiple window open
	                
	       for(int i=1; i<totalph1; i++)
	       {
	    	   
	    	  String  clicklink=Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	  sf.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
	    	  Thread.sleep(2000);
	          }
	       Set<String> keys=driver.getWindowHandles();
	         System.out.println(keys);
	            
	    ArrayList<String> al=new ArrayList<String>(keys);
	    System.out.println("List"+al);
	    String singleek=al.get(1);
	    System.out.println(singleek);
	    
	    Iterator<String> itr=al.iterator();
	    while(itr.hasNext())
	    {
	    	driver.switchTo().window(itr.next());
	    	String title=driver.getTitle();
	    	System.out.println("Title is:"+title);
	    	
	    	if(title.equalsIgnoreCase("LEARN MORE"))
	    	{
	    		driver.findElement(By.xpath("/html/body/div[9]/div[1]/div[1]/div/div[2]/a")).click();
	    		
	    	}
	    
	    
	    }
	    
	}
	
	
	

}
