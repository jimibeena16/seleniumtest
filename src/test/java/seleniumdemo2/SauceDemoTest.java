package seleniumdemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.DriverFactory;

public class SauceDemoTest {

    @Test
    public void validLogin() {

    	WebDriver driver = DriverFactory.getDriver();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
              .click();

        String title = driver.findElement(By.className("title"))
                             .getText();

        Assert.assertEquals(title, "Products");

        driver.quit();
    }
}
