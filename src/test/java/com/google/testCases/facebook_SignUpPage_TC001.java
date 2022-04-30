package com.google.testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class facebook_SignUpPage_TC001 {
	WebDriver _driver;
	  @BeforeTest
	  public void beforeTest() {
		  
		  String driverPath ="C:\\Users\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			
			String Url = "https://www.facebook.com/";
			
			_driver = new ChromeDriver();
			
			_driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			_driver.manage().window().maximize();
			
			_driver.get(Url);
		  
		  
	  }

	
	
  @Test
  public void faceBookLogin() {
	  _driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	  _driver.findElement(By.name("firstname")).sendKeys("simran");
	  _driver.findElement(By.name("lastname")).sendKeys("singh");
	  _driver.findElement(By.name("reg_email__")).sendKeys("ssimran4022@gmail.com");
	  _driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ssimran4022@gmail.com");
	  _driver.findElement(By.id("password_step_input")).sendKeys("simran1234");
	  _driver.findElement(By.id("day")).click();
	  _driver.findElement(By.xpath("//option[text()='3']")).click();
	  _driver.findElement(By.id("month")).click();
	  _driver.findElement(By.xpath("//option[text()='Jan']")).click();
	  _driver.findElement(By.id("year")).click();
	  _driver.findElement(By.xpath("//option[text()='2000']")).click();
	  _driver.findElement(By.xpath("//label[text()='Male']")).click();
	_driver.findElement(By.xpath("//div[@class ='_1lch']//button[text()= 'Sign Up']")).click();
	 Assert.assertTrue(_driver.findElement(By.xpath("//span[text()='Simran']")).isDisplayed());
	
	  
	  
	  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	//  _driver.quit();
  }

}
