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

public class GoogleSignUpPage 
{
  @FindBy(id="identifierId")
  private WebElement GglSignUpEmailTxtbx;
  
  @FindBy(xpath="//span[text()='Next']")
  private WebElement GglSignUpEmailNxtBtn;
  
  @FindBy(name="password")
  private WebElement GglSignUpPwdTxtBx;
  
  @FindBy(xpath="//div[@id='passwordNext']//span[text()='Next']")
  private WebElement GglSignUpPwdNxtBtn;
  
  public GoogleSignUpPage(WebDriver driver)
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
	  GglSignUpEmailTxtbx.sendKeys(ExcelUtilities.readData("Sheet3", 2, 0));
	  GglSignUpEmailNxtBtn.click();
	  
	  WaitStatementLib.implicitWaitForSeconds(driver, 10);
	  
	  GglSignUpPwdTxtBx.sendKeys(ExcelUtilities.readData("Sheet2", 4, 3));
	  GglSignUpPwdNxtBtn.click();
	  
	  try
	  {
		  Thread.sleep(5000);  
	  }
	  
	  catch(InterruptedException e)
	  {
		e.printStackTrace();
	  }
	  
	  Reporter.log("SignUp using Google successful", true);
	  
  }	  
}
