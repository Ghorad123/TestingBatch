package Jpet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A {
	
	public WebDriver driver;
	
	static Logger log=Logger.getLogger(A.class.getName());
	Properties pro=new Properties();
	@BeforeSuite()
	public void openBrowser() throws IOException
	{
		FileInputStream fis=new FileInputStream("F:\\log4jPropertiesFile\\Jpet.properties");
		pro.load(fis);
        log.info("In open browser");
		System.setProperty(pro.getProperty("browser1"), pro.getProperty("browser2"));
		driver=new ChromeDriver();
		log.info("browser opened");
	}
	 @BeforeTest()
	 public void enterurl()
	 {
		log.info("In url");
		driver.get(pro.getProperty("url"));
		log.info("url opened");
	 }
	 @BeforeClass()
	 public void maximizebrowser()
	 {
		log.info("In maximizeBrowser");
		driver.manage().window().maximize();
		log.info("browser maximized");
	 }
	 @BeforeMethod()
	 public void pageload()
	 {
		 log.info("In pageload");
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 log.info("pageloaded");
	 }
    @Test()
    public void f1()
    {
    	log.info("BY AMOL");
    }
    @AfterMethod()
    public void screenshot() throws IOException
    {
    	log.info("In screenshot");
    	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFileToDirectory(src,new File("F:\\Screenshot\\"));
    	log.info("captured screenshot");
     }
	
	
	
	
	     

}
