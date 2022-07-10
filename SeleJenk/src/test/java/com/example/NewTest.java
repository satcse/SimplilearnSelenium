package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
	private WebDriver driver;
	SoftAssert soft = new SoftAssert();

	@Test
	public void f() {		
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		AssertJUnit.assertEquals("Facebook - log in or sign up", title);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.setProperty("webdriver.chrome.driver", "/home/sathishtipofeve/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}
}
