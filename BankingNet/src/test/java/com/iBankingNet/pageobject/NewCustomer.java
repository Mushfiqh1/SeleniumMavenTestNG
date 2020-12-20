package com.iBankingNet.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer {
	
	WebDriver ldriver;
	
	public NewCustomer(WebDriver gdriver){
		ldriver = gdriver;
		PageFactory.initElements(gdriver, this);
	}
	
	
	@FindBy(name="uid")
	WebElement uName;
	
	@FindBy(name="password")
	WebElement psw;
	
	@FindBy(name = "btnLogin")
	WebElement loginBtn;
	
	@FindBy(linkText = "New Customer")
	WebElement linktext;
	
	
	@FindBy(name="name")
	WebElement cus_name;
	 
	
	public void setUserName(String username) {
		uName.sendKeys(username);
	} 
	
	public void setPsw(String password) {
		psw.sendKeys(password);
	} 
	public void login() { 
		loginBtn.click();
	}
	
	public void openlinktext()
	{
		linktext.click();
	}
	
	
	  public void Setcname(String cusname) { 
		  cus_name.sendKeys(cusname);
		  }
	 
}
