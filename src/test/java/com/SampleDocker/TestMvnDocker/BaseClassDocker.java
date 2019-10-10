package com.SampleDocker.TestMvnDocker;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClassDocker {
	
	protected  WebDriver driver;
	
	//@Parameters({"Browser"})
	
	@BeforeTest
	
	 public void setupDriver(ITestContext itctxt)throws Exception
	//public void setupDriver(String browser,ITestContext itctxt) throws Exception
	{
//       System.setProperty("webdriver.chrome.driver", "C:\\PratapDocs\\ONBALANACE\\Chrome\\chromedriver.exe");
//       this.driver=new ChromeDriver();
//       this.driver.get("https://www.google.com/");
		
        String host="localhost";
        DesiredCapabilities dc;
		
//		if(System.getProperty("HUB_HOST")!=null)
//		{
//			host=System.getProperty("HUB_HOST");
//		}
//		
		if(System.getProperty("BROWSER")!=null &&System.getProperty("BROWSER").equalsIgnoreCase("firefox"))
		{
			dc=DesiredCapabilities.firefox();	
		}
		
		else
		{
			dc=DesiredCapabilities.chrome();
		}
//		
//		if(browser.equalsIgnoreCase("firefox"))
//		{
//			dc=DesiredCapabilities.firefox();
//		}

		String completeurl="http://"+host+":4444/wd/hub";
	//	String testname=itctxt.getCurrentXmlTest().getName();
		//dc.setCapability("name", testname);
		this.driver=new RemoteWebDriver(new URL(completeurl),dc);
		this.driver.get("https://www.google.com/");
		Thread.sleep(4000);
		
	}
	
	@AfterTest
	public void teardown()
	{
		this.driver.quit();
	}


}
