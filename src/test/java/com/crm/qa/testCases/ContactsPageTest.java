package com.crm.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	public ContactsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		homePage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	/*@Test(priority=1)
	public void verifyHomePageTitleTest()   {
		String homePageTitle = homePage.getTitlePage();
		Assert.assertEquals(homePageTitle, "CRMPRO","No match with home page title");
		
	}
	
	
	@Test(priority=2)
	public void verifyUsernameTest()    {
		testUtil.switchFrame("mainpanel");
		boolean isUsernameDisplayed = homePage.verifyCorrectUserDisplayed();
		Assert.assertTrue(isUsernameDisplayed);
	}*/
	
	@Test(priority=3)
	public void createNewContactTest() throws InterruptedException    {
		testUtil.switchFrame("mainpanel");
		contactsPage = homePage.goToCreateNewContact();
		contactsPage.createNewContact("Prof.", "first", "last");
		Thread.sleep(3000);
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	

}
