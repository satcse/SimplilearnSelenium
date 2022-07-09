package com.testannotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
	
	@Test
	public void Test1()
	{
		System.out.println("Test1 Executed");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Test2 Executed");
	}

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test Executed");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test Executed");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method Executed");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method Executed");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class Executed");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class Executed");
	}
}
