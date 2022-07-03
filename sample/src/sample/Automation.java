package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automation {

	public static void main(String[] args) throws InterruptedException, AWTException {

		//System.setProperty("webdriver.chrome.driver", "/home/sathishtipofeve/Downloads/chromedriver");
		//WebDriver driver = new ChromeDriver(); // Starting Chrome Browser
		
		System.setProperty("webdriver.gecko.driver", "/home/sathishtipofeve/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize(); // Maximizing window
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // Page Load Timeout
		
		driver.get("https://www.grammarly.com/plagiarism-checker"); // Open the website
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver; // Creating JS Handler
		js.executeScript("window.scrollBy(0,200)");
		
		Thread.sleep(2000); // For demo only
		WebElement browse = driver.findElement(By.className("_3255a-uploadButton"));
		
		browse.click();
		Thread.sleep(2000);
		
		
		//Creating Robot Object
		Robot rb = new Robot();
		
		//Copying File Path to Clipboard
		StringSelection str = new StringSelection("/home/sathishtipofeve/Downloads/sample.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		//Press CTRL+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		//Release CTRL+V
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		//Press and Release Enter Key
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);	
		
	}

}
