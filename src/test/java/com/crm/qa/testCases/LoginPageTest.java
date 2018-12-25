package com.crm.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage  = new LoginPage();
	}

	
	@Test(priority=2)
	public void loginPageTitleTest() {
		Assert.assertEquals(getTitlePage(), "#1 Free CRM software in the cloud for sales and service","Title not equal");
	}
	
	@Test(priority=3)
	public void CrmImageTitle() {
		Assert.assertTrue(loginPage.validateCrmImage());
	}
	
	@Test(priority=1)
	public void doLoginTest() throws Exception  {
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
