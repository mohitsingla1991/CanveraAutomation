package com.canvera.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class CanveraHomePage 
{
  @FindBy(xpath="//a[@class='navbar-brand active']")
  private WebElement canveraLogo;
  
  @FindBy(xpath="//div[@id='trade-brief-nav']//li[@class='web-product hidden-xs']//a[text()='Prints']")
  private WebElement printsProductLink;
  
  @FindBy(xpath="//div[@id='trade-brief-nav']//li[@class='web-product hidden-xs']//a[text()='Posters']")
  private WebElement postersProductLink;
  
  @FindBy(xpath="//div[@id='trade-brief-nav']//li[@class='web-product hidden-xs']//a[text()='Canvas']")
  private WebElement canvasProductLink;
  
  @FindBy(xpath="//div[@id='trade-brief-nav']//li[@class='web-product hidden-xs']//a[text()='Calendars']")
  private WebElement calendarsProductLink;
  
  @FindBy(xpath="//div[@id='trade-brief-nav']//li[@class='web-product hidden-xs']//a[text()='Youbooks']")
  private WebElement youbooksProductLink;
  
  @FindBy(xpath="//div[@id='trade-brief-nav']//li[@class='web-product hidden-xs']//a[text()='Sharebooks']")
  private WebElement sharebooksProductLink;
  
  
  public CanveraHomePage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void verifyCanveraLogo()
  {
	 WebElement expRes = canveraLogo;
	 WebElement actRes = canveraLogo;
	 
	 Assert.assertEquals(actRes, expRes, "Canvera Logo Present on Home page");
	 Reporter.log("Canvera logo present on Home page, hence script is PASS", true);
  }
  
}
