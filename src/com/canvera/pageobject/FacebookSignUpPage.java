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

public class FacebookSignUpPage 
{
  @FindBy(id="email")
  private WebElement FbEmailTxtBx;
  
  @FindBy(id="pass")
  private WebElement FbPwdTxtBx;
  
  @FindBy(id="loginbutton")
  private WebElement FbSignUpLoginBtn;
  
  
  public FacebookSignUpPage(WebDriver driver)
  {
	 PageFactory.initElements(driver, this);
  }
  
  public void switchToFacebookSignUpWindow(WebDriver driver) 
  {
	  Set<String> s1=driver.getWindowHandles();
	  Iterator<String> i1=s1.iterator();
	   
	  String parentWindow = i1.next();
	  String childWindow = i1.next();
	      
      WaitStatementLib.implicitWaitForSeconds(driver, 30);
	  driver.switchTo().window(childWindow); 
	  
	  WaitStatementLib.implicitWaitForSeconds(driver, 30);
	  FbEmailTxtBx.sendKeys(ExcelUtilities.readData("Sheet3", 1, 0));
	  FbPwdTxtBx.sendKeys(ExcelUtilities.readData("Sheet3", 1, 4));
	  FbSignUpLoginBtn.click();
	  
	  try
	  {
		  Thread.sleep(5000);  
	  }
	  
	  catch(InterruptedException e)
	  {
		e.printStackTrace();
	  }
	  
	  Reporter.log("SignUp using Facebook successful", true);
  }	  
}
