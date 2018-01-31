package testdemo;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;

public class testde() 
{

	//@Test
	public void test() {
		//fail("Not yet implemented");
		System.setProperty("webdriver.gecko.driver", "D:\\Naresh\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver browser = new FirefoxDriver();
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url = "https://www.google.co.in";
		System.out.println("Testing");
	}

}
