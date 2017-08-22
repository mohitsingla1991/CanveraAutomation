package com.canvera.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.canvera.generic.ExcelUtilities;
import com.canvera.generic.WaitStatementLib;
import com.canvera.scripts.AutoPopUpTest1;

public class AutoPopUpPage 
{   
	//AutoPopUpTest1.java webelements
	
	@FindBy(xpath="//div[@class='col-md-7 right-block']")
	private WebElement popUpRightBlock;
	
	@FindBy(className="close")
	private WebElement popUpCloseButn;
	
	//AutoPopUpTest1.java webelements
	
	//AutoPopUpTest2.java webelements
	
	@FindBy(xpath="//a[text()='Sign In here']")
	private WebElement signInNormalLink;
	
	@FindBy(id="email")
	private WebElement emailTxtBox;
	
	@FindBy(id="password")
	private WebElement pwdTxtBox;
	
	@FindBy(id="sign-in-btn")
	private WebElement signInBtn;
	
	@FindBy(xpath="//i[@class='icon icon-user-circle-line hidden-xs']")
	private WebElement avatarHover;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOutLink;
	
	//AutoPopUpTest2.java webelements
	
	//AutoPopUpTest3.java webelements
	
	@FindBy(id="sign-up-btn")
	private WebElement autoPopUpSignUpBtn;
	
	//AutoPopUpTest3.java webelements
	
	//AutoPopUpTest4.java webelements

	@FindBy(xpath="//button[@id='facebook-signin-btn']")
	private WebElement FacebookSignInBtn;
	
	//AutoPopUpTest4.java webelements

	//AutoPopUpTest5.java webelements
	
	@FindBy(xpath="//button[text()='Sign in with Google']")
	private WebElement GoogleSignInBtn;
	
	//AutoPopUpTest5.java webelements
	
	//AutoPopUpTest6.java webelements
	
	@FindBy(xpath="//button[text()='Sign up with Facebook']")
	private WebElement FbSignUpBtn;
	
	//AutoPopUpTest6.java webelements
	
	//AutoPopUpTest7.java webelements
	
	@FindBy(xpath="//button[text()='Sign up with Google']")
	private WebElement GoogleSignUpBtn;
	
	//AutoPopUpTest7.java webelements
	
	
	public AutoPopUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void verifyAutoPopUp()
	{
		WebElement expRes=popUpRightBlock;
		WebElement actRes=popUpRightBlock;
		   
	    Assert.assertEquals(actRes, expRes, "AutoPOPUp appeared");
		Reporter.log("AutoPOPUp appeared, hence script is PASS", true);
		
		popUpCloseButn.click();
	}

	public WebElement getPopUpRightBlock() {
		return popUpRightBlock;
	}

	public WebElement getPopUpCloseButn() {
		return popUpCloseButn;
	}
	
	public void clickSignInlink()
	{
		signInNormalLink.click();
		FacebookSignInBtn.click();
	}
	
	public void signInNormalPage()
	{
	   emailTxtBox.sendKeys(ExcelUtilities.readData("Sheet1", 2, 1));
	   pwdTxtBox.sendKeys(ExcelUtilities.readData("Sheet1", 2, 2));
	   signInBtn.click();
	}
		
	public WebElement getAvatarHover() {
		return avatarHover;
	}

	public void signInCheck()
	{
       signOutLink.click();
       Reporter.log("User Signed Out", true);
	}
	
	public void clickSignUpBtn()
	{
		autoPopUpSignUpBtn.click();
	}
	
	public void clickSignInLinkToGoogle()
	{
	   signInNormalLink.click();
	   GoogleSignInBtn.click();
	}
	
	public void clickFbSignUpBtn()
	{
		FbSignUpBtn.click();
	}
	
	public void clickGglSignUpBtn()
	{
		GoogleSignUpBtn.click();
	}
}
