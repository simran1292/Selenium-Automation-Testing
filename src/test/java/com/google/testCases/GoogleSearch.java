package com.google.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearch {
	
	WebDriver _driver;
	
	@BeforeTest
	public void TestInit() {
		
		String driverPath ="C:\\Users\\user\\chromeDriver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		String Url = "https://www.google.co.in/";
		
		_driver = new ChromeDriver();
		
		_driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		_driver.manage().window().maximize();
		
		_driver.get(Url);
		
	}

	@Test
	public void GoogleSearchTest() {
		
		_driver.findElement(By.xpath("//input[@title='Search']")).clear();
		_driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Home");
				
		_driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		
		Assert.assertTrue(_driver.findElement(By.id("result-stats")).isDisplayed(), "Google Search not worked");

		
		
		
		
		
	}
	
	
	@AfterTest
	public void Flush() throws InterruptedException
	{
		Thread.sleep(3000);
		_driver.quit();
	}

}
