package com.zoho.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.zoho.base.Page;

public class LandingPage extends Page {

	
	public void clickLogin(){
		
//		driver.findElement(By.xpath("//a[@class='zh-login']")).click();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Log In'][@class='top-nav-links log-in-top']"))).build().perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Income Tax E-Filing')][@class='login-products-list']")).click();
	}
	
}
