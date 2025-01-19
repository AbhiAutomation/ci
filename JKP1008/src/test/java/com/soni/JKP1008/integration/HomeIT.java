package com.soni.JKP1008.integration;

import org.testng.annotations.*;

public class HomeIT {
	
	@Test
	public void integrationTest()
	{
		System.out.println("Intergration Test 1:" +Thread.currentThread().getId());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
