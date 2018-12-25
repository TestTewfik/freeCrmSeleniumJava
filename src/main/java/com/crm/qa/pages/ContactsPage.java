package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	
	@FindBy(name="title")
	WebElement titleList;
	
	@FindBy(id="first_name")
	WebElement firstnameTxt;
	
	@FindBy(id="surname")
	WebElement lastnameTxt;
	
	

	//---------------Ctor ---------------------
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	//---------------Methodes------------
	public Select getTitleElement() {
		Select select = new Select(titleList);
		return select;
		 
	}
	
	public void createNewContact(String text, String firstname, String lastname) {
		getTitleElement().selectByVisibleText(text);
		firstnameTxt.sendKeys(firstname);
		lastnameTxt.sendKeys(lastname);
		
	}
	
	
	
}
