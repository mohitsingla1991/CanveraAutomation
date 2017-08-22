package com.canvera.scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.canvera.generic.BaseLib;
import com.canvera.generic.WaitStatementLib;
import com.canvera.pageobject.AutoPopUpPage;

public class AutoPopUpTest2 extends BaseLib
{
   @Test
   public void signInNormal()
   {
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   
	   app.clickSignInlink();
	   WaitStatementLib.implicitWaitForSeconds(driver, 30);
	   
	   app.signInNormalPage();
	   
	   try 
	   {
		Thread.sleep(5000);
	   }
	   
	   catch (InterruptedException e) 
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
