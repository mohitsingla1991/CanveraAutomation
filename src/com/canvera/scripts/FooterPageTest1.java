package com.canvera.scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.canvera.generic.BaseLib;
import com.canvera.generic.WaitStatementLib;
import com.canvera.pageobject.AutoPopUpPage;
import com.canvera.pageobject.CanveraHomePage;
import com.canvera.pageobject.FooterPage;

public class FooterPageTest1 extends BaseLib
{
   @Test(priority = 1)
   public void verifyAboutCanveraLink()
   {
	   
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   WebElement popUpCloseBtn = app.getPopUpCloseButn();
	   popUpCloseBtn.click();
	   
	   FooterPage fp=new FooterPage(driver);
	   fp.verifyAboutCanveraLink(driver);
	   
	   
   }
   
   @Test(priority = 2, enabled = false)
   public void verifyTermAndPrivacyLink()
   {
	   
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   WebElement popUpCloseBtn = app.getPopUpCloseButn();
	   popUpCloseBtn.click();
	   
	   FooterPage fp=new FooterPage(driver);
	   fp.verifyTermAndPrivacyLink(driver);
	   
   }
   
   
   @Test(priority = 3, enabled = false)
   public void verifyHelpFaqLink()
   {
	   
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   WebElement popUpCloseBtn = app.getPopUpCloseButn();
	   popUpCloseBtn.click();
	   
	   FooterPage fp=new FooterPage(driver);
	   fp.verifyHelpFaqLink(driver);
	   
   }
   
   @Test(priority = 4, enabled = false)
   public void verifyContactUsLink()
   {
	   
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   WebElement popUpCloseBtn = app.getPopUpCloseButn();
	   popUpCloseBtn.click();
	   
	   FooterPage fp=new FooterPage(driver);
	   fp.verifyContactUsLink(driver);
	   
   }
   
   @Test(priority = 5, enabled = false)
   public void verifyBlogLink()
   {
	   
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   WebElement popUpCloseBtn = app.getPopUpCloseButn();
	   popUpCloseBtn.click();
	   
	   FooterPage fp=new FooterPage(driver);
	   fp.verifyBlogLink(driver);
	   
   }
   
   @Test(priority = 6, enabled = false)
   public void verifyPressLink()
   {
	   
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   WebElement popUpCloseBtn = app.getPopUpCloseButn();
	   popUpCloseBtn.click();
	   
	   FooterPage fp=new FooterPage(driver);
	   fp.verifyPressLink(driver);
	   
   }
   
   @Test(priority = 7, enabled = false)
   public void verifyTrackOrederLink()
   {
	   
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   WebElement popUpCloseBtn = app.getPopUpCloseButn();
	   popUpCloseBtn.click();
	   
	   FooterPage fp=new FooterPage(driver);
	   fp.verifyTrackOrderLink(driver);
	   
   }
   
   @Test(priority = 8, enabled = false)
   public void verifyPrintsFooterLink()
   {
	   
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   WebElement popUpCloseBtn = app.getPopUpCloseButn();
	   popUpCloseBtn.click();
	   
	   FooterPage fp=new FooterPage(driver);
	   fp.verifyPrintsFooterLink(driver);
	   
   }
   
   @Test(priority = 9, enabled = false)
   public void verifyPostersFooterLink()
   {
	   
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   WebElement popUpCloseBtn = app.getPopUpCloseButn();
	   popUpCloseBtn.click();
	   
	   FooterPage fp=new FooterPage(driver);
	   fp.verifyPostersFooterLink(driver);
	   
   }
   
   @Test(priority = 10, enabled = false)
   public void verifyCanvasFooterLink()
   {
	   
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   WebElement popUpCloseBtn = app.getPopUpCloseButn();
	   popUpCloseBtn.click();
	   
	   FooterPage fp=new FooterPage(driver);
	   fp.verifyCanvasFooterLink(driver);
	   
   }
   
   @Test(priority = 11, enabled = false)
   public void verifyCalendarsFooterLink()
   {
	   
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   WebElement popUpCloseBtn = app.getPopUpCloseButn();
	   popUpCloseBtn.click();
	   
	   FooterPage fp=new FooterPage(driver);
	   fp.verifyCalendarsFooterLink(driver);
	   
   }
   
   @Test(priority = 12, enabled = false)
   public void verifyYoubooksFooterLink()
   {
	   
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   WebElement popUpCloseBtn = app.getPopUpCloseButn();
	   popUpCloseBtn.click();
	   
	   FooterPage fp=new FooterPage(driver);
	   fp.verifyYoubooksFooterLink(driver);
	   
   }
   
   @Test(priority = 13, enabled = false)
   public void verifySharebooksFooterLink()
   {
	   
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   WebElement popUpCloseBtn = app.getPopUpCloseButn();
	   popUpCloseBtn.click();
	   
	   FooterPage fp=new FooterPage(driver);
	   fp.verifySharebooksFooterLink(driver);
	   
   }
   
   @Test(priority = 14, enabled = false)
   public void verifyFacebookFooterLink()
   {
	   
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   WebElement popUpCloseBtn = app.getPopUpCloseButn();
	   popUpCloseBtn.click();
	   
	   FooterPage fp=new FooterPage(driver);
	   fp.verifyFacebookFooterLink(driver);
	   
   }
   
   @Test(priority = 15, enabled = false)
   public void verifyTwitterFooterLink()
   {
	   
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   WebElement popUpCloseBtn = app.getPopUpCloseButn();
	   popUpCloseBtn.click();
	   
	   FooterPage fp=new FooterPage(driver);
	   fp.verifyTwitterFooterLink(driver);
	   
   }
   
   @Test(priority = 16, enabled = false)
   public void verifyPinterestFooterLink()
   {
	   
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   WebElement popUpCloseBtn = app.getPopUpCloseButn();
	   popUpCloseBtn.click();
	   
	   FooterPage fp=new FooterPage(driver);
	   fp.verifyPinterestFooterLink(driver);
	   
   }
   
   @Test(priority = 17, enabled = false)
   public void verifyInstagramFooterLink()
   {
	   
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   WebElement popUpCloseBtn = app.getPopUpCloseButn();
	   popUpCloseBtn.click();
	   
	   FooterPage fp=new FooterPage(driver);
	   fp.verifyInstagramFooterLink(driver);
	   
   }
   
   @Test(priority = 18, enabled = false)
   public void verifyCanveraFooterLink()
   {
	   
       AutoPopUpPage app=new AutoPopUpPage(driver);
       
	   WebElement popUpRightBlock = app.getPopUpRightBlock();
	   WaitStatementLib.explicitWaitForVisibility(driver, 30, popUpRightBlock);
	   WebElement popUpCloseBtn = app.getPopUpCloseButn();
	   popUpCloseBtn.click();
	   
	   FooterPage fp=new FooterPage(driver);
	   fp.verifyCanveraFooterLink(driver);
	   
   }
}
