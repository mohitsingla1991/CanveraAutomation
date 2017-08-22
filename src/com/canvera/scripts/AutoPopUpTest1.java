package com.canvera.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvera.generic.BaseLib;
import com.canvera.generic.WaitStatementLib;
import com.canvera.pageobject.AutoPopUpPage;

public class AutoPopUpTest1 extends BaseLib
{
   @Test
   public void autoPopUpVerify()
   {   
	   AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   
//	   WebDriverWait wait=new WebDriverWait(driver, 30);
//	   String pop_xpath = "//div[@class='col-md-7 right-block']";
//	   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(pop_xpath))); 
//	  
	   app.verifyAutoPopUp();
   }
}
