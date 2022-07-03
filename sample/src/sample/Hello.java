package sample;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main(String[] args) {
		// Set the Driver Property and create the driver object.
		
		System.setProperty("webdriver.chrome.driver", "/home/sathishtipofeve/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://www.facebook.com";
		String expectedTitle= "Facebook - log in or sign up";
		String actualTitle="";
		String tagName="";
		
		//Launch the browser and test
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test Passed!");
		}
		else
			System.out.println("Test Failed!");
		
		//Locators
		tagName=driver.findElement(By.id("email")).getTagName();
		System.out.println("The Tag name: "+tagName);		
		
		System.out.println("1.) By ID "+driver.findElement(By.id("email")).getTagName());
		System.out.println("2.) By Name "+driver.findElement(By.name("email")).getTagName());
		System.out.println("3.) By Class name "+driver.findElement(By.className("_6lux")).getTagName());
		System.out.println("4.) By cssSelector ID "+driver.findElement(By.cssSelector("input#email")).getTagName());
		System.out.println("5.) By cssSelector name "+driver.findElement(By.cssSelector("input[name=email]")).getTagName());
		System.out.println("6.) By cssSelector tag "+driver.findElement(By.cssSelector("input.inputtext")).getTagName());
		System.out.println("7.) By Absolute XPATH "+driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a")).getTagName());
		System.out.println("8.) By Relative XPATH "+driver.findElement(By.xpath("//*[@id='email']")).getTagName());
		
		// Day 2
		
		System.out.println("FP Testing: "+driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a")).getText());
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='pageFooterChildren']/ul/li[23]/a")).sendKeys(click);
		
		try
		{
			Thread.sleep(3000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		try
		{
			Thread.sleep(3000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		driver.switchTo().window(tabs.get(0));
	}

}
