package MTLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Facebook {

	public static void main(String[] args) throws FindFailed 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Chrome exe file\\newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
	     driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	     Screen sc=new Screen();
	     
	     Pattern email=new Pattern("F:\\Sikuli.Facebook.Locater\\WhatsApp Image 2022-06-13 at 1.13.55 PM (1).jpeg");
	     sc.type(email,"ghoradrahul@gmail.com");
		
		  Pattern password=new Pattern("F:\\Sikuli.Facebook.Locater\\WhatsApp Image 2022-06-13 at 1.13.55 PM.jpeg");
		  sc.type(password,"pass123");
		  

		  Pattern click=new Pattern("F:\\Sikuli.Facebook.Locater\\WhatsApp Image 2022-06-13 at 1.13.56 PM.jpeg");
		  sc.click(click);
		  
		
		
		
	}
}
