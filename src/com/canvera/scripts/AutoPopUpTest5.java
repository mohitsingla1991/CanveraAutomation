package com.canvera.scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.canvera.generic.BaseLib;
import com.canvera.generic.WaitStatementLib;
import com.canvera.pageobject.AutoPopUpPage;
import com.canvera.pageobject.GoogleSignInPage;

public class AutoPopUpTest5 extends BaseLib
{
  @Test
  public void GoogleSignIn()
  {
	  AutoPopUpPage app=new AutoPopUpPage(driver);
	   
	  WebElement popUpRightBlock = app.getPopUpRightBlock();
	  WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	  
	  app.clickSignInLinkToGoogle();
	  
	  WaitStatementLib.implicitWaitForSeconds(driver, 30);
	  
	  GoogleSignInPage gsip=new GoogleSignInPage(driver);
	  gsip.switchToGoogleWindow(driver);
	  
//	  Actions act=new Actions(driver);
//	  driver.findElement(arg0)
//	   WebElement avatarIcon=//i[@class='icon icon-user-circle-line hidden-xs'];
//	  act.moveToElement(ava)
//	   
  }
}
