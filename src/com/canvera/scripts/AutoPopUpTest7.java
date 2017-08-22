package com.canvera.scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.canvera.generic.BaseLib;
import com.canvera.generic.WaitStatementLib;
import com.canvera.pageobject.AutoPopUpPage;
import com.canvera.pageobject.GoogleSignUpPage;

public class AutoPopUpTest7 extends BaseLib
{
  @Test
  public void verifyGoogleSignUp()
  {
	  AutoPopUpPage app=new AutoPopUpPage(driver);
	  
	  WebElement popUpRightBlock = app.getPopUpRightBlock();
	  WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	  
	  app.clickGglSignUpBtn();
	  
	  GoogleSignUpPage gsup=new GoogleSignUpPage(driver);
	  gsup.switchToFacebookSignUpWindow(driver);
  }
  
}
