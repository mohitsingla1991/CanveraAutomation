package com.canvera.scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.canvera.generic.BaseLib;
import com.canvera.generic.WaitStatementLib;
import com.canvera.pageobject.AutoPopUpPage;
import com.canvera.pageobject.CanveraHomePage;

public class HomePageTest1 extends BaseLib
{
   @Test
   public void verifyCanveraLogoHomePage()
   {
	   
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   
	   WebElement popUpCloseBtn = app.getPopUpCloseButn();
	   popUpCloseBtn.click();
	   
	   CanveraHomePage chp=new CanveraHomePage(driver);
	   chp.verifyCanveraLogo();
	   
	   
   }
}
