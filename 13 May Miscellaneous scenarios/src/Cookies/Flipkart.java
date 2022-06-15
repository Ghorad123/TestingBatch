package Cookies;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) 
	{
		System.out.println("Hello Selenium");

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Chrome exe file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 
		      Set<Cookie>  cookies=driver.manage().getCookies();
		      int tcookies=cookies.size();
		      System.out.println("Total no.of cookies"+tcookies);
		      for(Cookie cookie:cookies)
		      {
		    	  System.out.println("Details of cookies");
		    	  System.out.println("Name"+cookie.getName());
		    	  System.out.println("Doamin"+cookie.getDomain());
		    	  System.out.println("class"+cookie.getClass());
		    	  System.out.println("value"+cookie.getValue());
		    	  System.out.println("path"+cookie.getPath());
		    	  System.out.println("Expiry"+cookie.getExpiry());
		    	  System.out.println("Httponly"+cookie.isHttpOnly());
		    	  System.out.println("secure"+cookie.isSecure());
		    	  
		    	  System.out.println("===========");
		    	      
		  /*  	   driver.manage().deleteCookieNamed("Network-Type");
		       Set<Cookie>   cookies1=driver.manage().getCookies();  
		    	  int tcookies1=cookies1.size();
		    	  System.out.println("Total no of cookies after delete:"+tcookies1); */
		    	  
		   Cookie c=driver.manage().getCookieNamed("Network-Type");
		   System.out.println(c.getName());
		   
		   Cookie un=new Cookie("username","rahul");
		   driver.manage().addCookie(un);
		   
		    	  
		    	  
		    	  
		      }
		
	}

}
