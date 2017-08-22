package com.canvera.scripts;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvera.generic.BaseLib;
import com.canvera.generic.WaitStatementLib;
import com.canvera.pageobject.AutoPopUpPage;
import com.canvera.pageobject.FacebookSignInPage;

public class AutoPopUpTest4 extends BaseLib
{
    @Test
    public void FacebookSignIn()
    {
    	
       AutoPopUpPage app=new AutoPopUpPage(driver);
 	   
 	   WebElement popUpRightBlock = app.getPopUpRightBlock();
 	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
 	   
 	   app.clickSignInlink();
 	   
 	   WaitStatementLib.implicitWaitForSeconds(driver, 30);
	   Reporter.log("Navigating to SignIn page"); 
	   
	   FacebookSignInPage fsp=new FacebookSignInPage(driver);
	   fsp.switchToFbWindow(driver);
	   
	   try
	   {
		  Thread.sleep(5000); 
	   }
	   
	   catch(InterruptedException e)
	   {
		   e.printStackTrace();
	   }
	   
	  // WaitStatementLib.implicitWaitForSeconds(driver, 30);
	   
	   //fsp.enterFbLoginInfo(driver);
    }
}
