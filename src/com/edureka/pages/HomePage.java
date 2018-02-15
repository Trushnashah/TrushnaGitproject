package com.edureka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(linkText="REGISTER")
	WebElement registerLink;
	
	@FindBy(how=How.LINK_TEXT, linkText="REGISTER")
	WebElement registerLinkHow;
	
	@FindBy(linkText="SIGN-ON")
	WebElement singIn;
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnRegister(){
		registerLinkHow.click();
	}
	
	public void clickonSignIn(){
		registerLinkHow.click();
	}
}
