package com.canvera.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.canvera.generic.ExcelUtilities;

public class SignUpPage 
{
   @FindBy(xpath="//div[@class='col-md-5 col-sm-6 right-zero']//div[@class='new-user-form']//form[@class='ng-untouched ng-pristine ng-invalid']//input[@placeholder='Enter your name']")
   private WebElement fullNameTxtBx;
   
   @FindBy(xpath="//div[@class='col-md-5 col-sm-6 right-zero']//input[@placeholder='Enter your email ID']")
   private WebElement emailTxtBx;
   
   @FindBy(xpath="//div[@class='col-md-5 col-sm-6 right-zero']//div[@class='form-group']//label[text()='Password']//following-sibling::input[@placeholder='Enter your password']")
   private WebElement pwdTxtBx;
   
   @FindBy(xpath="//div[@class='col-md-5 col-sm-6 right-zero']//div[@class='form-group']//label[text()='Confirm Password']//following-sibling::input[@placeholder='Enter your password']")
   private WebElement cnfmPwdtxBx;
   
   @FindBy(xpath="//div[@class='col-md-5 col-sm-6 right-zero']//button[text()='Sign up']")
   private WebElement signUpBtn;
   
   
   public SignUpPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   public void signUpUser()
   {
	 fullNameTxtBx.sendKeys(ExcelUtilities.readData("Sheet2",3,0));
	 emailTxtBx.sendKeys(ExcelUtilities.readData("Sheet2",3,1));
	 pwdTxtBx.sendKeys(ExcelUtilities.readData("Sheet2",3,2));
	 cnfmPwdtxBx.sendKeys(ExcelUtilities.readData("Sheet2",3,3));
	 signUpBtn.click();	 
	   
   }
}
