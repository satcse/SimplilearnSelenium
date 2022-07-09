package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Integration {

	WebDriver driver;
	WebDriver driver2;
	
	@Test(groups="Chrome")
	public void LaunchChrome()
	{
		System.setProperty("webdriver.chrome.driver", "/home/sathishtipofeve/Downloads/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		/*try
		{
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}*/
	}
	
	@Test(groups="Chrome", dependsOnMethods="LaunchChrome")
	public void TryFacebook1()
	{
		System.out.println(Thread.currentThread().getId());
		driver.findElement(By.id("email")).sendKeys("sathishsimpli@xyz.com");
		driver.findElement(By.id("pass")).sendKeys("fsdfsdfsdfsd");
		driver.findElement(By.name("login")).click();
	}
		
	@Test(groups="Firefox")
	public void LaunchFirefox()
	{
		System.setProperty("webdriver.gecko.driver", "/home/sathishtipofeve/Downloads/geckodriver");
		driver2 = new FirefoxDriver();
		
		driver2.get("https://www.facebook.com");
		/*try
		{
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}*/
	}
	
	@Test(groups="Firefox",dependsOnMethods="LaunchFirefox")
	public void TryFacebook2()
	{
		System.out.println(Thread.currentThread().getId());
		driver2.findElement(By.id("email")).sendKeys("sathishsimpli@xyz.com");
		driver2.findElement(By.id("pass")).sendKeys("fsdfsdfsdfsd");
		driver2.findElement(By.name("login")).click();
		System.out.println(Thread.currentThread().getId());
	}
}
