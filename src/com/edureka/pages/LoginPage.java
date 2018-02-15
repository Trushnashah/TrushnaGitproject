package com.edureka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name ="userName")
	WebElement userName;

	// Locator Type, LocatorValue -- name, userName
	@FindBy(name = "password")
	WebElement passwordEle;
	
	@FindBy(name="login")
	WebElement login;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterUserName(String username) {
		userName.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordEle.sendKeys(password);
	}

	public void clickOnloginButton(){
		login.click();
	}
}
