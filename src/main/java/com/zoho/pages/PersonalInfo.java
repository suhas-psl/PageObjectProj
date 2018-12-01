package com.zoho.pages;

import org.openqa.selenium.By;

import com.zoho.base.Page;

public class PersonalInfo extends Page {

	
	public void enterFirstName(String firstname){
		driver.findElement(By.xpath("//input[@id='firstName']")).clear();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstname);
	}
	
	public void enterLastName(String lastname){
		driver.findElement(By.xpath("//input[@id='lastName']")).clear();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastname);
	}
	
	public void enterDOB(String birthdate){
		driver.findElement(By.xpath("//input[@id='dateofBirth']")).clear();
		driver.findElement(By.xpath("//input[@id='dateofBirth']")).sendKeys(birthdate);
	}
	
	public void enterPan(String pan){
		driver.findElement(By.xpath("//input[@id='pan']")).clear();
		driver.findElement(By.xpath("//input[@id='pan']")).sendKeys(pan);
	}
	
	public void enterFatherName(String fathername){
		driver.findElement(By.xpath("//input[@id='fatherName']")).clear();
		driver.findElement(By.xpath("//input[@id='fatherName']")).sendKeys(fathername);
	}
	
	public void clickSave(){
		
		driver.findElement(By.xpath("//button[@type=' submit']")).click();
	}
	
	public String getErrorMsg(){
		return driver.findElement(By.xpath("//div[@class=\"validation-summary-errors validation-error\"]")).getText();
	}
}
