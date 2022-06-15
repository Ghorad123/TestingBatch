package MTLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class guru99Login {

	public static void main(String[] args) throws FindFailed
	{
         System.out.println("Hello sikuli");
         System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Chrome exe file\\newchrome\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://demo.guru99.com/test/newtours/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	     Screen sc=new Screen();
	     
	     Pattern uname=new Pattern("D:\\SikuliFile\\uname.PNG");
	     sc.type(uname,"QQQQ");
	     Pattern password=new Pattern("D:\\SikuliFile\\password.PNG");
	     sc.type(password,"qqqq");
	     Pattern click=new Pattern("D:\\SikuliFile\\Button.PNG");
	     sc.click(click);
	}

}
