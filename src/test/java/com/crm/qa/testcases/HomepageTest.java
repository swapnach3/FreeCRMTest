package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomepageTest extends TestBase {
	LoginPage  LoginPage;
	HomePage Homepage;
	
  
	
	public HomepageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void Setup() {
		Initialization();
		LoginPage=new LoginPage();
		Homepage=LoginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void verifyPageTitleTest() {
	String homepagetitle= Homepage.verifyHomePageTitle();
		Assert.assertEquals(homepagetitle, "Cogmento CRM","Home page title not matched");
	}
	@Test(priority=2)
	public void ClickonContactsLink() {
		Homepage.ClickonContactsLink();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		
	}
}
