package com.google.testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

@Test
public class StudentApplicationForm {
WebDriver _driver;
	
	@BeforeTest
	public void TestInit() {
		
		String driverPath ="C:\\Users\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		String Url = "https://demoqa.com/automation-practice-form";
		
		_driver = new ChromeDriver();
		
		_driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		_driver.manage().window().maximize();
		
		_driver.get(Url);
		
		
		
	}

	public void GoogleSearchTest() {

		_driver.findElement(By.id("firstName")).sendKeys("simran");
		  _driver.findElement(By.id("lastName")).sendKeys("singh"); 
		  _driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("ssimran@gmail.com");
		  _driver.findElement(By.xpath("//label[@for=\"gender-radio-1\"]")).click();		  
		  _driver.findElement(By.id("userNumber")).sendKeys("1234");
		  // throw tab key here using 68 line
		  _driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		  
		  _driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();	
		  _driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']//option[text()='January']")).click();	
		  
		  _driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).click();	
		  _driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']//option[text()='2000']")).click();	
		  
		  _driver.findElement(By.xpath("//div[@aria-label=\"Choose Saturday, January 1st, 2000\"]")).click();		  

		  
		  _driver.findElement(By.id("subjectsInput")).sendKeys("English");
		  _driver.findElement(By.id("subjectsInput")).sendKeys(Keys.TAB);
		  _driver.findElement(By.id("subjectsInput")).sendKeys(Keys.TAB);	  
		  _driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();	  
		  _driver.findElement(By.id("currentAddress")).sendKeys("india");
		
		
		

	}
	
	
	@AfterTest
	public void Flush() throws InterruptedException
	{
		Thread.sleep(3000);
		_driver.quit();
	}

}
