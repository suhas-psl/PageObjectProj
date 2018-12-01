package com.zoho.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Page {

	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static String browser ;
	
	
	public Page(){
//		System.setProperty("driver.chrome.webdriver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
//
//		if(driver==null){
//			driver = new ChromeDriver();
//			driver.get("https://www.zoho.com/");
//			driver.manage().window().maximize();
//
//			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		}

	}

	@BeforeClass
	public void setUp(){
		
		Properties prop = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\com\\zoho\\properties\\Config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			prop.load(fis);
			log.debug("Config file loaded !!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		if(System.getenv("browser")!=null && !System.getenv("browser").isEmpty()){
			
			browser = System.getenv("browser");
		}else{
		
			browser = prop.getProperty("browser");
		}
		
		prop.setProperty("browser", browser);
		
		
		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("driver.chrome.webdriver", System.getProperty("user.dir")+"\\src\\test\\resources\\com\\zoho\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			log.debug("Chrome Driver initialized !!!");
		}
		
		if(browser.equalsIgnoreCase("Firefox")){
			System.setProperty("driver.gecko.webdriver", System.getProperty("user.dir")+"\\src\\test\\resources\\com\\zoho\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
			log.debug("Gecko Driver initialized !!!");
		}
		
		driver.get("https://cleartax.in/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	

	
	@AfterSuite
	public void cleanUp(){
		
		driver.quit();
	}
}
