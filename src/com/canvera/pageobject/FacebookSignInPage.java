package com.canvera.pageobject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.canvera.generic.ExcelUtilities;
import com.canvera.generic.WaitStatementLib;

public class FacebookSignInPage 
{
   @FindBy(id="email")
   private WebElement FbEmailTxtBx;
   
   @FindBy(id="pass")
   private WebElement FbPwdTxtBx;
   
   @FindBy(xpath="//input[@value='Log In']")
   private WebElement FbLoginBtn;
   
   
   public FacebookSignInPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void switchToFbWindow(WebDriver driver)
   {
	   Set<String> s1=driver.getWindowHandles();
	   Iterator<String> i1=s1.iterator();
	   
	   String parentWindow = i1.next();
	   String childWindow = i1.next();
	      
      WaitStatementLib.implicitWaitForSeconds(driver, 30);
	  driver.switchTo().window(childWindow); 
	  
	  WaitStatementLib.implicitWaitForSeconds(driver, 30);
	   FbEmailTxtBx.sendKeys(ExcelUtilities.readData("Sheet3", 0, 0));
	   FbPwdTxtBx.sendKeys(ExcelUtilities.readData("Sheet3", 0, 1));
	   FbLoginBtn.click();
   }
   
//   public void enterFbLoginInfo(WebDriver driver)
//   {      
//	   WaitStatementLib.implicitWaitForSeconds(driver, 30);
//	   FbEmailTxtBx.sendKeys(ExcelUtilities.readData("Sheet3", 0, 0));
//	   FbPwdTxtBx.sendKeys(ExcelUtilities.readData("Sheet3", 0, 1));
//	   FbLoginBtn.click();
//   }
}
