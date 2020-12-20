package com.iBankingNet.testCases;


import org.testng.annotations.Test;

import com.iBankingNet.pageobject.LoginPage;

public class TC_Login_001 extends BaseClass{
	
	
	
	@Test
	public void test() {
		driver.get(url);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.setUserName(userId);
		loginpage.setPsw(userPassword);
		loginpage.login();
		
		
	}
	
	
}
