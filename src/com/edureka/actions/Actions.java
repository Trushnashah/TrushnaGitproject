package com.edureka.actions;

import org.openqa.selenium.WebDriver;

import com.edureka.pages.HomePage;
import com.edureka.pages.LoginPage;



public class Actions {

	public static void login(WebDriver driver,String userName, String password){
		
		HomePage homepage = new HomePage(driver);
		homepage.clickonSignIn();
		
		LoginPage page = new LoginPage(driver);
		
		page.enterUserName(userName);
		page.enterPassword(password);
		page.clickOnloginButton();
	}

}