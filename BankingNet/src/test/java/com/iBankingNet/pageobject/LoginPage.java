package com.iBankingNet.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	WebElement uName;
	
	@FindBy(name="password")
	WebElement psw;
	
	@FindBy(name = "btnLogin")
	WebElement loginBtn;
	
	public void setUserName(String username) {
		uName.sendKeys(username);
	} 
	
	public void setPsw(String password) {
		psw.sendKeys(password);
	} 
	public void login() {
		loginBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
