package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {

	SoftAssert soft = new SoftAssert();
	WebDriver driver;
	
	@Test
	public void LaunchChrome()
	{
		System.setProperty("webdriver.chrome.driver", "/home/sathishtipofeve/Downloads/chromedriver");
		driver = new ChromeDriver();
		
		//driver.get("https://www.facebook.com");
		try
		{
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(dependsOnMethods="LaunchChrome")
	public void Facebook()
	{
		driver.get("https://www.facebook.com");
		soft.assertEquals("FB Title", driver.getTitle());
		try
		{
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(dependsOnMethods="Facebook")
	public void Login()
	{
		driver.findElement(By.id("email")).sendKeys("sathishsimpli@xyz.com");
		driver.findElement(By.id("pass")).sendKeys("fsdfsdfsdfsd");
		driver.findElement(By.name("login")).click();
		soft.assertAll();
		try
		{
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
