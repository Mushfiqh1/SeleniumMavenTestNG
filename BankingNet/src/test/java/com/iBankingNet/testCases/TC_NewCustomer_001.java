package com.iBankingNet.testCases;

import org.testng.annotations.Test;


import com.iBankingNet.pageobject.NewCustomer;


public class TC_NewCustomer_001 extends BaseClass {

	@Test
	public void test() {
		driver.get(url);
		NewCustomer nw = new NewCustomer(driver);
				
		nw.setUserName(userId);
		nw.setPsw(userPassword);
		nw.login();
		nw.openlinktext();
		nw.Setcname("John Doe");
		
		
	}
}
