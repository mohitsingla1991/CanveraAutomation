package com.canvera.scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvera.generic.BaseLib;
import com.canvera.generic.WaitStatementLib;
import com.canvera.pageobject.AutoPopUpPage;
import com.canvera.pageobject.SignUpPage;

public class AutoPopUpTest3 extends BaseLib
{
   @Test
   public void signUpTest() 
   {
	   AutoPopUpPage app=new AutoPopUpPage(driver);
	   
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   
	   app.clickSignUpBtn();
	   WaitStatementLib.implicitWaitForSeconds(driver, 30);
	   Reporter.log("Navigating to SignUp page");
	   
	   SignUpPage sup=new SignUpPage(driver);
	   sup.signUpUser();
	   
	   try
	   {
		   Thread.sleep(5000);
	   }
	   
	   catch(InterruptedException e)
	   {
		   e.printStackTrace();
	   }
	   
	   WebElement AVTR = app.getAvatarHover();  /* get a Webelement from AutoPopUppage to enhance reusability */
	   Actions act=new Actions(driver);
	   act.moveToElement(AVTR).perform();
		
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, AVTR);
	   app.signInCheck();
		
   }
}
