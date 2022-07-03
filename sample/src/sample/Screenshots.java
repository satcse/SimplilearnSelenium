package sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/sathishtipofeve/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File scr = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(scr, new File("/home/sathishtipofeve/Downloads/test.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();
	}

}
