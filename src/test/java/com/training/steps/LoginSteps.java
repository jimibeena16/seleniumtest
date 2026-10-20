package com.training.steps;
import com.training.pages.*;
import io.cucumber.java.en.*;
import utilities.DriverFactory;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class LoginSteps {
	
 private WebDriver driver;
 
 @Given("I open the SauceDemo login page")
 public void open() {
	 driver = DriverFactory.getDriver();
	    
     driver.manage().window().maximize();
     driver.get("https://www.saucedemo.com/");
 }

 
 @When("I login with username {string} and password {string}")
 public void login(String u,String p){
	 new LoginPage(driver).login(u,p);
	 }
 
 @Then("the Products page should be displayed")
 public void verify(){
	 Assert.assertTrue(new ProductsPage(driver).isDisplayed());
	 driver.quit();
	 }
 
 @Given("user opens SauceDemo login page")
 public void user_opens_sauce_demo_login_page() {
	 driver = DriverFactory.getDriver();
     driver.manage().window().maximize();
     driver.get("https://www.saucedemo.com/");
 }

 @When("user enters username {string} and password {string}")
 public void user_enters_username_and_password(String username, String password) {
     driver.findElement(By.id("user-name")).sendKeys(username);
     driver.findElement(By.id("password")).sendKeys(password);
 }

 @And("user clicks login button")
 public void user_clicks_login_button() {
     driver.findElement(By.id("login-button")).click();
 }

 @Then("user should see the inventory page")
 public void user_should_see_the_inventory_page() {
     String currentUrl = driver.getCurrentUrl();

     if (currentUrl.contains("inventory")) {
         System.out.println("Login Successful");
     } else {
         System.out.println("Login Failed");
     }

     driver.quit();
 }
}