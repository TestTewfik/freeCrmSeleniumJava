package com.crm.qa.util;

import org.openqa.selenium.Alert;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;

	public void switchFrame(String arg) {
		driver.switchTo().frame(arg);
	}

	public Alert switchAlert(Alert alert) {

		driver.switchTo().alert();
		return alert;
	}

	public void switchToDefault() {
		driver.switchTo().defaultContent();
	}

}
