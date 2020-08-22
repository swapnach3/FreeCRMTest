package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
public class LoginPageTest extends TestBase{
	LoginPage  LoginPage;
	HomePage Homepage;
	
	public LoginPageTest() {
		
	super()	;
	}
	
@BeforeMethod
public void setUp() {
	
Initialization();
LoginPage = new LoginPage();
		
	}

@Test
public void LoginTest() {
	Homepage=LoginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
}
@AfterMethod
public void tearDown() {
	driver.close();
}

}
