package com.soni.JKP1008;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class TestClass_4 {
	@Test
	@Parameters({ "browser", "testDataLocation", "username", "password", "url" })

	// default value firfox will provide if parameter is not set in testng.xm file
	public void test1(@Optional("firefox") String strBrowser, String strTestDatLocation, String username,
			String password, String url) {
		String strBrowserFromCMD = System.getProperty("browser");
		if(strBrowserFromCMD!=null)
			strBrowser=strBrowserFromCMD;
		System.out.println("Browser value from command line " + strBrowserFromCMD);

		System.out.println("TestClass_1:First Test 1:" + Thread.currentThread().getId());
		System.out.println("Browser name is " + strBrowser);
		System.out.println("TestDatalocation  is " + strTestDatLocation);
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		System.out.println("URL: " + url);
		
		Assert.assertEquals(true, true);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
