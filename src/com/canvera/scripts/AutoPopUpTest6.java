package com.canvera.scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.canvera.generic.BaseLib;
import com.canvera.generic.WaitStatementLib;
import com.canvera.pageobject.AutoPopUpPage;
import com.canvera.pageobject.FacebookSignUpPage;

public class AutoPopUpTest6 extends BaseLib
{
  @Test
  public void verifyFacebookSignUp()
  {
	  AutoPopUpPage app=new AutoPopUpPage(driver);
	   
	  WebElement popUpRightBlock = app.getPopUpRightBlock();
	  WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	  
	  app.clickFbSignUpBtn();
	  
	  FacebookSignUpPage fsup=new FacebookSignUpPage(driver);
	  fsup.switchToFacebookSignUpWindow(driver);
	  
	  
  }
}
