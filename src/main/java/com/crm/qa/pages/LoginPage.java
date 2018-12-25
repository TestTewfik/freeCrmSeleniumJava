package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page factory - OR
	@FindBy(name="username")
	WebElement usernameTxt;
	
	@FindBy(name="password")
	WebElement passwordTxt;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//font[text()='Sign Up']")
	WebElement signUpLink;
	
	@FindBy(xpath="//img[@class='img-responsive'][@alt='free crm logo']")
	WebElement crmLogo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateCrmImage() {
		return crmLogo.isDisplayed();
	}
	
	public HomePage doLogin(String user, String pwd) throws InterruptedException {
		usernameTxt.sendKeys(user);
		passwordTxt.sendKeys(pwd);
		Thread.sleep(1000);
		loginBtn.click();
		return new HomePage();
	}
	
	
	
}
