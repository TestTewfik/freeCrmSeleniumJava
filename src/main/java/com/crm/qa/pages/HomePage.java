package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//td[contains(text(),'User: tew bel')]")
	WebElement userLoginLbl;
	
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLnk;
	
	@FindBy(xpath="//*[@id=\"navmenu\"]/ul/li[4]/ul/li[1]/a")
	WebElement newContactsLnk;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLnk;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLnk;

	//---------------Ctor ---------------------
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//------------------Methodes -----------------
	
	public boolean verifyCorrectUserDisplayed() {
		return userLoginLbl.isDisplayed();
	}
	
	public ContactsPage goToContactsPage() {
		contactsLnk.click();
		return new ContactsPage();
	}
	
	public DealsPage goToDealsPage() {
		dealsLnk.click();
		return new DealsPage();
	}
	
	public TasksPage goToTasksPage() {
		tasksLnk.click();
		return new TasksPage();
	}
	
	public ContactsPage goToCreateNewContact() {
		Actions action = new Actions(driver);
		action.moveToElement(contactsLnk).build().perform();
		newContactsLnk.click();
		return new ContactsPage();
		
	}
}
