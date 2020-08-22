package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//page factory -OR
	
	@FindBy(xpath=("//input[@name='email']"))
	WebElement username;
	
	@FindBy(xpath=("//input[@name='password']"))
	WebElement password;
	
	//div[@class='ui fluid large blue submit button']
	
	@FindBy(xpath=("//div[@class='ui fluid large blue submit button']"))
	
	WebElement LoginBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	public String validatePageTitle() {
		return driver.getTitle();
		
		}
	public HomePage Login(String un,String pwd) {
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginBtn.click();
		return new  HomePage();
		
	}
	
	
	
	

}
