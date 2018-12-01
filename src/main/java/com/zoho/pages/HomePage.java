package com.zoho.pages;

import org.openqa.selenium.By;

import com.zoho.base.Page;

public class HomePage extends Page{

//	public void clickCRM(){
//		driver.findElement(By.xpath("//div[text()='CRM']")).click();
//	}
	
	
	public void clickContinueHere(){
		driver.findElement(By.xpath("//a[contains(text(),'Continue Here')]")).click();
	}
}
