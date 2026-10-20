package com.training.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import utilities.DriverFactory;

public class BaseTest {
	
 protected WebDriver driver;
 
 @BeforeMethod public void setUp(){ 
	// driver=new ChromeDriver(); 
	 driver = DriverFactory.getDriver();
	 driver.manage().window().maximize(); 
	 }
 
 @AfterMethod public void tearDown(){
	 if(driver!=null) {
		 driver.quit();
	 }
   }
	 
}