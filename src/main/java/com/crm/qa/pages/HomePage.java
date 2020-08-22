package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	//driver.findElement(By.linkText("Contacts")).click();
	
	@FindBy(xpath="//span[@class='item-text' and contains(text(),'Contacts')]")
    WebElement Contactlink;
   
	//initiliaze page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
		
	}
	
	public ContactsPage ClickonContactsLink() {
		Contactlink.click();
		return new ContactsPage();
		
	}
}
