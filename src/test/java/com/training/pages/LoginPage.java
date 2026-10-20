package com.training.pages;
import org.openqa.selenium.*;

import utilities.DriverFactory;

//normal POM
public class LoginPage {
	
 private final WebDriver driver;
 
 private final By username=By.id("user-name");
 private final By password=By.id("password");
 private final By loginButton=By.id("login-button");
 
 public LoginPage(WebDriver driver) {
	 this.driver = driver;
	
	 }
 
 public void login(String user,String pass){
	 
  driver.findElement(username).sendKeys(user);
  driver.findElement(password).sendKeys(pass);
  driver.findElement(loginButton).click();
  
 }
}