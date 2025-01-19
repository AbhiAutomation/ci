package com.soni.JKP1008;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

/**
 * Unit test for simple App.
 */
public class TestClass_1 {
	@Test
	@Parameters({"browser"})
	public void test1(String strBrowser)
	{
		System.out.println("TestClass_1:First Test 1:" +Thread.currentThread().getId());
		Assert.assertEquals(true, true);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void test2()
	{
		System.out.println("TestClass_1:Second Test 2:" +Thread.currentThread().getId());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

   
}
