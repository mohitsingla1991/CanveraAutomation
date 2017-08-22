package com.canvera.pageobject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.canvera.generic.ExcelUtilities;
import com.canvera.generic.WaitStatementLib;

public class GoogleSignInPage 
{
  @FindBy(id="identifierId")
  private WebElement gglEmailTxtBx;
  
  @FindBy(xpath="//span[text()='Next']")
  private WebElement emailNxtBtn;
  
  @FindBy(name="password")
  private WebElement gglPwdTxtBx;
  
  @FindBy(xpath="//div[@id='passwordNext']//span[text()='Next']")
  private WebElement pwdNxtBtn;
  
  public GoogleSignInPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void switchToGoogleWindow(WebDriver driver)
  {
	  Set<String> s1=driver.getWindowHandles();
	  Iterator<String> i1=s1.iterator();
	   
	  String parentWindow = i1.next();
	  String childWindow = i1.next();
	      
      WaitStatementLib.implicitWaitForSeconds(driver, 30);
	  driver.switchTo().window(childWindow); 
	  
	  WaitStatementLib.implicitWaitForSeconds(driver, 30);
	  gglEmailTxtBx.sendKeys(ExcelUtilities.readData("Sheet3", 1, 0));
	  emailNxtBtn.click();
	  gglPwdTxtBx.sendKeys(ExcelUtilities.readData("Sheet3", 1, 1));
	  WaitStatementLib.implicitWaitForSeconds(driver, 40);
	  pwdNxtBtn.click();
	  
	  try
	  {
		  Thread.sleep(5000);  
	  }

	  
	  catch(InterruptedException e)
	  {
		  e.printStackTrace();
	  }
	  
	  Reporter.log("Logged in using Google", true);
  }
  
  
  
}
