package com.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {

	public static void main(String args[]) throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.LINUX);
		
		URL url = new URL("http://172.17.0.1:4444/wd/hub"); //Points to the Selenium Grid HUB.
		WebDriver driver = new RemoteWebDriver(url,cap);
		
		driver.get("https://www.google.com");
		System.out.println("Google Title: "+driver.getTitle());
		
		driver.close();
	}
}
