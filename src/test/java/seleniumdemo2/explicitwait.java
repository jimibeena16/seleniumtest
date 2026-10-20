package seleniumdemo2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.DriverFactory;

public class explicitwait {

    public static void main(String[] args) {

    	WebDriver driver = DriverFactory.getDriver();
        driver.get("https://demoqa.com/dynamic-properties");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));

        System.out.println(button.getText());

        driver.quit();
    }
}


//visibilityOfElementLocated - Wait until element is visible
//elementToBeClickable - Wait until element is clickable
//presenceOfElementLocated - Wait until element exists
//textToBePresentInElementLocated - Wait until text appears
//urlContains("inventory") - Wait for URL
//titleContains("Dashboard") - wait for title
//alertIsPresent() - wait for alert