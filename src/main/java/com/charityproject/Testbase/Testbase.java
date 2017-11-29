package com.charityproject.Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.AfterMethod;
import org.testng.log4testng.Logger;

import com.charityproject.utils.TestUtil;
import com.charityproject.utils.WebEventListener;

public class Testbase {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebDriverEventListener eventListener;
	private static EventFiringWebDriver Event_Driver;
	private static WebEventListener eventlistner;
//	public static final Logger log = Logger.getLogger(Testbase.class.getName());

	public Testbase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
					+ "\\src\\main\\java\\com\\charityproject\\config\\Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"src\\main\\java\\com\\charityproject\\config\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver",
					"\\src\\main\\java\\com\\charityproject\\resorces\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		Event_Driver=new EventFiringWebDriver(driver);
		//create an object of eventlistnerhandler  to register it with eventfiringwevdriver
		eventlistner=new WebEventListener();
		Event_Driver.register(eventlistner);
		driver=Event_Driver;	
		

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

		String log4jconfigPath = "log4j.properties";
		PropertyConfigurator.configure(log4jconfigPath);
	}
	
	public static void scrollintoview(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", element);
	
	}
	@AfterMethod
	public void tear() {
		driver.quit();
	}

}
