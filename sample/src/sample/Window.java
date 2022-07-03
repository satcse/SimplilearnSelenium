package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/sathishtipofeve/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		String originalWindow = driver.getWindowHandle();
		driver.get("https://selenium.dev");
		
		try
		{
			Thread.sleep(3000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		driver.navigate().to("https://facebook.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		try
		{
			Thread.sleep(3000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		driver.switchTo().window(originalWindow);
	}

}
