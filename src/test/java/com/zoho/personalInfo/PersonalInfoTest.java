package com.zoho.personalInfo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.zoho.base.Page;
import com.zoho.pages.HomePage;
import com.zoho.pages.LandingPage;
import com.zoho.pages.LoginPage;
import com.zoho.pages.PersonalInfo;

public class PersonalInfoTest extends Page {

	@Test
	public void testPersonalInfo(){
	LandingPage landing = new LandingPage();
	landing.clickLogin();
	
	LoginPage login = new LoginPage();
	login.enterUsername("cleartaxuser@gmail.com");
	
	login.enterPassword("password1212");
	
	login.clickSubmit();
	
	HomePage home = new HomePage();
	home.clickContinueHere();
	
	PersonalInfo personal = new PersonalInfo();
	personal.enterFirstName("first");
	personal.enterLastName("");
	personal.enterFatherName("father");
	personal.enterDOB("13/13/99");
	personal.enterPan("WSEKE98876");
	personal.clickSave();

	String expectedErrorMsg = "Please fix the following errors";
	
	Assert.assertTrue(expectedErrorMsg.equals(personal.getErrorMsg()), "Error message is not same");
	
}

@AfterClass
public void cleanUp(){
	driver.quit();
}
	

}