package com.soni.JKP1008;

import org.testng.Assert;
import org.testng.annotations.Test; 

public class TestClass_2 {

	
	@Test
	public void test1()
	{
		System.out.println("TestClass_2:First Test 1:" +Thread.currentThread().getId());
		Assert.assertEquals(true, false);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	public void test2()
	{
		System.out.println("TestClass_2:Second Test 2:" +Thread.currentThread().getId());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

