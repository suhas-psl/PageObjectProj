//package com.zoho.crm;
//
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.Test;
//
//import com.zoho.base.Page;
//import com.zoho.pages.CRMPage;
//import com.zoho.pages.HomePage;
//import com.zoho.pages.LandingPage;
//import com.zoho.pages.LoginPage;
//
//public class CRMTest extends Page{
//
//	@Test
//	public void testCRM() throws InterruptedException{
//
//		LandingPage landing = new LandingPage();
//		landing.clickLogin();
//		
//		LoginPage login = new LoginPage();
//		login.enterUsername("trainer@way2automation.com");
//		
//		login.enterPassword("Selenium@123");
//		
//		login.clickSubmit();
//		
//		HomePage home = new HomePage();
//		home.clickCRM();
//		
//		CRMPage crm = new CRMPage();
//		crm.logout();
//		
//		
//	}
//	
//	@AfterClass
//	public void cleanUp(){
//		driver.quit();
//	}
//}
