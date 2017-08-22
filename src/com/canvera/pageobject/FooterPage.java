package com.canvera.pageobject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.canvera.generic.WaitStatementLib;

public class FooterPage {
	
	  

	@FindBy(xpath=".//div[@class='col-md-6 col-sm-6 hidden-xs']//div[@class='col-md-6 col-sm-6']//ul[@class='list-unstyled']//li//a[text()='About Canvera']")
	  private WebElement aboutCanveraLink;
	  
	  @FindBy(xpath="//div[@class='col-md-6 col-sm-6 hidden-xs']//div[@class='col-md-6 col-sm-6']//ul[@class='list-unstyled']//li//following-sibling::li//a[text()='Terms & Privacy']")
	  private WebElement termAndPrivacyLink;
	  
	  @FindBy(xpath="//div[@class='col-md-6 col-sm-6 hidden-xs']//div[@class='col-md-6 col-sm-6']//ul[@class='list-unstyled']//li//following-sibling::li//following-sibling::li//a[text()='Help/FAQ']")
	  private WebElement helpFaqLink;
	  
	  @FindBy(xpath="//div[@class='col-md-6 col-sm-6 hidden-xs']//div[@class='col-md-6 col-sm-6']//ul[@class='list-unstyled']//li//following-sibling::li//following-sibling::li//following-sibling::li//a[text()='Contact Us']")
	  private WebElement contactUsLink;
	  
	  @FindBy(xpath="//div[@class='col-md-2 col-sm-2 hidden-xs']//ul[@class='list-unstyled block2']//a[text()='Blog']")
	  private WebElement blogLink;
	  
	  
	  @FindBy(xpath="//div[@class='col-md-2 col-sm-2 hidden-xs']//ul[@class='list-unstyled block2']//li//following-sibling::li//a[text()='Press']")
	  private WebElement pressLink;
	  
	  @FindBy(xpath="//div[@class='col-md-2 col-sm-2 hidden-xs']//ul[@class='list-unstyled block2']//li//following-sibling::li//following-sibling::li//a[text()='Track order']")
	  private WebElement trackOrderLink;
	  
	  @FindBy(xpath="//div[@class='col-md-6 col-sm-6 col-xs-5']//ul[@class='list-unstyled']//li//a[text()='Prints']")
	  private WebElement printsFooterLink;
	  
	  @FindBy(xpath="//div[@class='col-md-6 col-sm-6 col-xs-5']//ul[@class='list-unstyled']//li//following-sibling::li//a[text()='Posters']")
	  private WebElement postersFooterLink;
	  
	  @FindBy(xpath="//div[@class='col-md-6 col-sm-6 col-xs-5']//ul[@class='list-unstyled']//li//following-sibling::li//following-sibling::li//a[text()='Canvas']")
	  private WebElement canvasFooterLink;
	  
	  @FindBy(xpath="//div[@class='col-md-6 col-sm-6 col-xs-5']//ul[@class='list-unstyled']//li//following-sibling::li//following-sibling::li//following-sibling::li//a[text()='Calendars']")
	  private WebElement calendarsFooterLink;
	  
	  @FindBy(xpath="//div[@class='col-md-6 col-sm-6 col-xs-5']//ul[@class='list-unstyled']//li//following-sibling::li//following-sibling::li//following-sibling::li//following-sibling::li//a[text()='Youbooks']")
	  private WebElement youbooksFooterLink;
	  
	  @FindBy(xpath="//div[@class='col-md-6 col-sm-6 col-xs-5']//ul[@class='list-unstyled']//li//following-sibling::li//following-sibling::li//following-sibling::li//following-sibling::li//following-sibling::li//a[text()='Sharebooks']")
	  private WebElement sharebooksFooterLink;
	  
	  @FindBy(xpath="//ul[@class='list-inline social-icon-list']//li//a[@title='facebook']")
	  private WebElement facebookFooterLink;
	  
	  @FindBy(xpath="//ul[@class='list-inline social-icon-list']//li//following-sibling::li//a[@title='twitter']")
	  private WebElement twitterFooterLink;
	  
	  @FindBy(xpath="//ul[@class='list-inline social-icon-list']//li//following-sibling::li//following-sibling::li//a[@title='pinterest']")
	  private WebElement pinterestFooterLink;
	  
	  @FindBy(xpath="//ul[@class='list-inline social-icon-list']//li//following-sibling::li//following-sibling::li//following-sibling::li//a[@title='instagram']")
	  private WebElement instagramFooterLink;
	  
	  @FindBy(xpath="//canvera-footer//p")
	  private String canveraFooterLink;
	  
	  
	  public FooterPage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  public void verifyAboutCanveraLink(WebDriver driver)
	  {
		  System.out.println("inside verifyAboutCanveraLink ");
		  String winHandleBefore = driver.getWindowHandle();
		  aboutCanveraLink.click();
		  Set <String> handles =  driver.getWindowHandles();
		  
	   for(String winHandle : handles)
		   
	   {
	       if(!winHandle.equals(winHandleBefore))
	   
	   {
		 //   driver.switchTo().window(winHandle).getTitle();
		
		String expRes = "About Us | Meet Our Leaders";
		
			 String actRes = driver.switchTo().window(winHandle).getTitle();
			 Reporter.log(actRes, true);
			 
			 Assert.assertEquals(actRes, expRes, "About Canvera Not Present on Home page");
			 Reporter.log("About Canvera present on Home page, hence script is PASS", true); 
			 
			 driver.close();
			 driver.switchTo().window(winHandleBefore);
					 
	   }
	 }
  }
	  public void verifyTermAndPrivacyLink(WebDriver driver)
	  {
		  System.out.println("inside verifyTermAndPrivacyLink");
		  String winHandleBefore = driver.getWindowHandle();
		  termAndPrivacyLink.click();
		  Set <String> handles =  driver.getWindowHandles();
		  
	   for(String winHandle : handles)
		   
	   {
	       if(!winHandle.equals(winHandleBefore))
	   
	   {
		 //   driver.switchTo().window(winHandle).getTitle();
		
		String expRes = "Terms of Service | Canvera";
		
			 String actRes = driver.switchTo().window(winHandle).getTitle();
			 Reporter.log(actRes, true);
			 
			 Assert.assertEquals(actRes, expRes, "Verify Term & Privacy Not Present on Home page");
			 Reporter.log("Term & Privacy present on Home page, hence script is PASS", true); 		
			 
			 driver.close();
			 driver.switchTo().window(winHandleBefore);
			 
	   }
	 }
		 
 }
	  
	  public void verifyHelpFaqLink(WebDriver driver)
	  {
		  System.out.println("inside verifyHelpFaqLink");
		  String winHandleBefore = driver.getWindowHandle();
		  helpFaqLink.click();
		  Set <String> handles =  driver.getWindowHandles();
		  
	   for(String winHandle : handles)
		   
	   {
	       if(!winHandle.equals(winHandleBefore))
	   
	   {
		 //   driver.switchTo().window(winHandle).getTitle();
		
		String expRes = "";
		
			 String actRes = driver.switchTo().window(winHandle).getTitle();
			 Reporter.log(actRes, true);
			 
			 Assert.assertEquals(actRes, expRes, "Help FAQ Not Present on Home page");
			 Reporter.log("Help FAQ present on Home page, hence script is PASS", true); 		
			 
			 driver.close();
			 driver.switchTo().window(winHandleBefore);
			 
	   }
	 }
 }
	  
	  public void verifyContactUsLink(WebDriver driver)
	  {
		  System.out.println("inside verifyContactUsLink");
		  String winHandleBefore = driver.getWindowHandle();
		  contactUsLink.click();
		  Set <String> handles =  driver.getWindowHandles();
		  
	   for(String winHandle : handles)
		   
	   {
	       if(!winHandle.equals(winHandleBefore))
	   
	   {
		
		String expRes = "Contact | Canvera - Preserving Memories | Exquisite Photobooks for Special Occasions";
		
			 String actRes = driver.switchTo().window(winHandle).getTitle();
			 Reporter.log(actRes, true);
			 
			 Assert.assertEquals(actRes, expRes, "Contact us Not Present on Home page");
			 Reporter.log("Contact us present on Home page, hence script is PASS", true); 		
			 
			 driver.close();
			 driver.switchTo().window(winHandleBefore);
			 
	   }
	 }
	  }
	  
	  public void verifyBlogLink(WebDriver driver)
	  {
		  System.out.println("inside verifyBlogLink");
		  String winHandleBefore = driver.getWindowHandle();
		  blogLink.click();
		  Set <String> handles =  driver.getWindowHandles();
		  
	   for(String winHandle : handles)
		   
	   {
	       if(!winHandle.equals(winHandleBefore))
	   
	   {
		
		String expRes = "#Yougraphy Blog - High Quality Online Photo Printing";
		
			 String actRes = driver.switchTo().window(winHandle).getTitle();
			 Reporter.log(actRes, true);
			 
			 Assert.assertEquals(actRes, expRes, "Blog Not Present on Home page");
			 Reporter.log("Blog present on Home page, hence script is PASS", true); 		
			 
			 driver.close();
			 driver.switchTo().window(winHandleBefore);
			 
	   }
	 }
	  }
	  
	  public void verifyPressLink(WebDriver driver)
	  {
		  System.out.println("inside verifyPressLink");
		  String winHandleBefore = driver.getWindowHandle();
		  pressLink.click();
		  Set <String> handles =  driver.getWindowHandles();
		  
	   for(String winHandle : handles)
		   
	   {
	       if(!winHandle.equals(winHandleBefore))
	   
	   {
		
		String expRes = "News | Canvera - Preserving Memories | Exquisite Photobooks for Special Occasions";
		
			 String actRes = driver.switchTo().window(winHandle).getTitle();
			 Reporter.log(actRes, true);
			 
			 Assert.assertEquals(actRes, expRes, "Press Not Present on Home page");
			 Reporter.log("Press present on Home page, hence script is PASS", true); 		
			 
			 driver.close();
			 driver.switchTo().window(winHandleBefore);
			 
	   }
	 } 
	  }
	  
	  public void verifyTrackOrderLink(WebDriver driver)
	  {
		  System.out.println("inside verifyTrackOrderLink");
		  String winHandleBefore = driver.getWindowHandle();
		  trackOrderLink.click();
		  Set <String> handles =  driver.getWindowHandles();
		  
	   for(String winHandle : handles)
		   
	   {
	       if(!winHandle.equals(winHandleBefore))
	   
	   {
		
		String expRes = "";
		
			 String actRes = driver.switchTo().window(winHandle).getTitle();
			 Reporter.log(actRes, true);
			 
			 Assert.assertEquals(actRes, expRes, "Tracking Not Present on Home page");
			 Reporter.log("Tracking present on Home page, hence script is PASS", true); 		
			 
			 driver.close();
			 driver.switchTo().window(winHandleBefore);
			 
	   }
	 }
	  }
	  
	  public void verifyPrintsFooterLink(WebDriver driver)
	  {
		  System.out.println("inside verifyPrintsFooterLink");
		  WaitStatementLib.explicitWaitForClickable(driver, 20, printsFooterLink);
		  printsFooterLink.click();
		  
		  try 
		    {
		   Thread.sleep(5000);
		 } 
		    catch (InterruptedException e1) 
		    {
		   e1.printStackTrace();
		 }
		
		String expRes = "High Quality Online Digital Photo Printing";
		
			 String actRes = driver.getTitle();
			 Reporter.log(actRes, true);
			 
			 Assert.assertEquals(actRes, expRes, "Print link Not Present on Home page");
			 Reporter.log("Print Link present on Home page, hence script is PASS", true); 		
			 
	  }
	  
	  public void verifyPostersFooterLink(WebDriver driver)
	  {
		  System.out.println("inside verifyPostersFooterLink");
		  WaitStatementLib.explicitWaitForClickable(driver, 20, postersFooterLink);
		  postersFooterLink.click();
		  
		  try 
		    {
		   Thread.sleep(5000);
		 } 
		    catch (InterruptedException e1) 
		    {
		   e1.printStackTrace();
		 }
		
		String expRes = "Online Photo Poster Printing - Assured Quality";
		
			 String actRes = driver.getTitle();
			 Reporter.log(actRes, true);
			 
			 Assert.assertEquals(actRes, expRes, "Poster link Not Present on Home page");
			 Reporter.log("Poster Link present on Home page, hence script is PASS", true); 
	  }
	  
	  public void verifyCanvasFooterLink(WebDriver driver)
	  {
		  System.out.println("inside verifyCanvasFooterLink");
		  WaitStatementLib.explicitWaitForClickable(driver, 20, canvasFooterLink);
		  canvasFooterLink.click();
		  
		  try 
		    {
		   Thread.sleep(5000);
		 } 
		    catch (InterruptedException e1) 
		    {
		   e1.printStackTrace();
		 }
		
		String expRes = "High Quality Canvas Prints Online";
		
			 String actRes = driver.getTitle();
			 Reporter.log(actRes, true);
			 
			 Assert.assertEquals(actRes, expRes, "Canvas link Not Present on Home page");
			 Reporter.log("Canvas Link present on Home page, hence script is PASS", true);  
	  }
	  
	  public void verifyCalendarsFooterLink(WebDriver driver)
	  {
		  System.out.println("inside verifyCalendarsFooterLink");
		  WaitStatementLib.explicitWaitForClickable(driver, 20, calendarsFooterLink);
		  calendarsFooterLink.click();
		  
		  try 
		    {
		   Thread.sleep(5000);
		 } 
		    catch (InterruptedException e1) 
		    {
		   e1.printStackTrace();
		 }
		
		String expRes = "Personalised Photo Calendar Printing Online";
		
			 String actRes = driver.getTitle();
			 Reporter.log(actRes, true);
			 
			 Assert.assertEquals(actRes, expRes, "Calendars link Not Present on Home page");
			 Reporter.log("Calendars Link present on Home page, hence script is PASS", true); 
	  }
	  
	  public void verifyYoubooksFooterLink(WebDriver driver)
	  {
		  System.out.println("inside verifyYoubooksFooterLink");
		  WaitStatementLib.explicitWaitForClickable(driver, 20, youbooksFooterLink);
		  youbooksFooterLink.click();
		  
		  try 
		    {
		   Thread.sleep(5000);
		 } 
		    catch (InterruptedException e1) 
		    {
		   e1.printStackTrace();
		 }
		
		String expRes = "Personalised Photo Books and Photo Album";
		
			 String actRes = driver.getTitle();
			 Reporter.log(actRes, true);
			 
			 Assert.assertEquals(actRes, expRes, "Youbooks link Not Present on Home page");
			 Reporter.log("Youbooks Link present on Home page, hence script is PASS", true); 
	  }
	  
	  public void verifySharebooksFooterLink(WebDriver driver)
	  {
		  System.out.println("inside verifySharebooksFooterLink");
		  WaitStatementLib.explicitWaitForClickable(driver, 20, sharebooksFooterLink);
		  sharebooksFooterLink.click();
		  
		  try 
		    {
		   Thread.sleep(5000);
		 } 
		    catch (InterruptedException e1) 
		    {
		   e1.printStackTrace();
		 }
		
		  	String expRes = "Print Photo Share Books Online";
		
			 String actRes = driver.getTitle();
			 Reporter.log(actRes, true);
			 
			 Assert.assertEquals(actRes, expRes, "Sharebooks link Not Present on Home page");
			 Reporter.log("Sharebooks Link present on Home page, hence script is PASS", true); 
	  }
	  
	  public void verifyFacebookFooterLink(WebDriver driver)
	  {
		  System.out.println("inside verifyFacebookFooterLink");
		  String winHandleBefore = driver.getWindowHandle();
		  facebookFooterLink.click();
		  Set <String> handles =  driver.getWindowHandles();
		  
	   for(String winHandle : handles)
		   
	   {
	       if(!winHandle.equals(winHandleBefore))
	   
	   {
		
		String expRes = "Canvera - Home | Facebook";
		
			 String actRes = driver.switchTo().window(winHandle).getTitle();
			 Reporter.log(actRes, true);
			 
			 Assert.assertEquals(actRes, expRes, "Fb Link Not Present on Home page");
			 Reporter.log("Fb Link present on Home page, hence script is PASS", true); 		
			 
			 driver.close();
			 driver.switchTo().window(winHandleBefore);
			 
	   }
	 }
	  }
	  
	  public void verifyTwitterFooterLink(WebDriver driver)
	  {
		  System.out.println("inside verifyTwitterFooterLink");
		  String winHandleBefore = driver.getWindowHandle();
		  twitterFooterLink.click();
		  Set <String> handles =  driver.getWindowHandles();
		  
	   for(String winHandle : handles)
		   
	   {
	       if(!winHandle.equals(winHandleBefore))
	   
	   {
		
		String expRes = "Canvera (@canvera) | Twitter";
		
			 String actRes = driver.switchTo().window(winHandle).getTitle();
			 Reporter.log(actRes, true);
			 
			 Assert.assertEquals(actRes, expRes, "Twitter Not Present on Home page");
			 Reporter.log("Twitter present on Home page, hence script is PASS", true); 		
			 
			 driver.close();
			 driver.switchTo().window(winHandleBefore);
			 
	   }
	 }
	  }
	  
	  public void verifyPinterestFooterLink(WebDriver driver)
	  {
		  System.out.println("inside verifyPinterestFooterLink");
		  String winHandleBefore = driver.getWindowHandle();
		  pinterestFooterLink.click();
		  Set <String> handles =  driver.getWindowHandles();
		  
	   for(String winHandle : handles)
		   
	   {
	       if(!winHandle.equals(winHandleBefore))
	   
	   {
		
		String expRes = "Canvera (canvera) on Pinterest";
		
			 String actRes = driver.switchTo().window(winHandle).getTitle();
			 Reporter.log(actRes, true);
			 
			 Assert.assertEquals(actRes, expRes, "pIntereset Not Present on Home page");
			 Reporter.log("pIntereset present on Home page, hence script is PASS", true); 		
			 
			 driver.close();
			 driver.switchTo().window(winHandleBefore);
			 
	   }
	 }
	  }
	  
	  public void verifyInstagramFooterLink(WebDriver driver)
	  {
		  System.out.println("inside verifyInstagramFooterLink");
		  String winHandleBefore = driver.getWindowHandle();
		  instagramFooterLink.click();
		  Set <String> handles =  driver.getWindowHandles();
		  
	   for(String winHandle : handles)
		   
	   {
	       if(!winHandle.equals(winHandleBefore))
	   
	   {
		
		String expRes = "Canvera Official (@canveradotcom) • Instagram photos and videos";
		
			 String actRes = driver.switchTo().window(winHandle).getTitle();
			 Reporter.log(actRes, true);
			 
			 Assert.assertEquals(actRes, expRes, "Insta Not Present on Home page");
			 Reporter.log("Insta Link present on Home page, hence script is PASS", true); 		
			 
			 driver.close();
			 driver.switchTo().window(winHandleBefore);
			 
	   }
	 }
	  }
	  
	  public void verifyCanveraFooterLink(WebDriver driver)
	  {
		  System.out.println("inside verifyCanverafooterLink");
		 
		  
		  
		String expRes = "© 2017 Canvera. All rights reserved.";
		
			  String actRes = driver.findElement(By.xpath(canveraFooterLink)).getText();
			 Reporter.log(actRes, true);
			 
			 Assert.assertEquals(actRes, expRes, "Footer text Not Present on Home page");
			 Reporter.log("Footer text present on Home page, hence script is PASS", true); 
	  }
	  
}


	



