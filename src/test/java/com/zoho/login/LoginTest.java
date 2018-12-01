package com.zoho.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.zoho.base.Page;
import com.zoho.pages.LandingPage;
import com.zoho.pages.LoginPage;


public class LoginTest extends Page{
	
	
	
	@Test
	public void testLogin(){

		LandingPage landing = new LandingPage();
		landing.clickLogin();
		
		LoginPage login = new LoginPage();
		login.enterUsername("cleartaxuser@gmail.com");
		
		login.enterPassword("password1212");
		
		login.clickSubmit();

	}
	
	@AfterClass
	public void cleanUp(){
		driver.quit();
	}
}
