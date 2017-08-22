package com.canvera.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseLib
{
	public WebDriver driver;
	
	@BeforeMethod
	@Parameters(value="browser")
	public void preCondition(String browserName)
	{   
	
		if (browserName.equalsIgnoreCase("firefox"))
		{
//			ProfilesIni ffProfiles = new ProfilesIni();
//			FirefoxProfile profile = ffProfiles.getProfile("customfirefox");
			
			FirefoxProfile ffprofile = new FirefoxProfile();
			ffprofile.setPreference("dom.webnotifications.enabled", false);
			
			driver=new FirefoxDriver(ffprofile);
			Reporter.log("Firefox launched and Push Notifications blocked", true);
		}
		
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
			driver=new ChromeDriver();
			Reporter.log("Chrome launched");
		}
		
		else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "./exefiles/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			Reporter.log("IE launched");
		}
	
    driver.manage().deleteAllCookies();
    Reporter.log("Cookies deleted", true);
    
	driver.manage().window().maximize();
	driver.get(GetPropertyValues.getPropertyValue("testURL"));	 
	Reporter.log("Navigating to Canvera QA", true);
	WaitStatementLib.implicitWaitForSeconds(driver, 20);
	
	
	}
	
	@AfterMethod
	public void postCondition(ITestResult result)
	{
		if(result.isSuccess())
		{
			System.out.println("Script pass, hence screenshot NOT taken");
		}
		
		else
		{
			ScreenshotLib sLib=new ScreenshotLib();
			String fileName = result.getMethod().getMethodName();
			sLib.getScreenshot(driver, fileName);
			Reporter.log("Script FAIL, hence screenshot has been taken", true);
		}
		
		driver.close();
		Reporter.log("Script executed successfully, browser closed", true);
		Reporter.log("------------------------",true);
	}
	
	
}