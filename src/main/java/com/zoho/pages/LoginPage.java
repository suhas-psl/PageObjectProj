package com.zoho.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.zoho.base.Page;

public class LoginPage extends Page {

	public void enterUsername(String username){
		
//		driver.findElement(By.xpath("//input[@id='lid']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys(username);
		
	}
	
	public void enterPassword(String password){
//		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
	}
	
	public void clickSubmit(){
//		driver.findElement(By.xpath("//div[@id='signin_submit']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
