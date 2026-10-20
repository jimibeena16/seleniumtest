package com.training.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.training.pages.*;

import utilities.DriverFactory;

public class LoginTest1 {

    @Test
    public void verifyLogin() {

    	WebDriver driver = DriverFactory.getDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        LoginPage1 loginPage = new LoginPage1(driver);

        loginPage.login("standard_user","secret_sauce");

        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));

        driver.quit();
    }
}