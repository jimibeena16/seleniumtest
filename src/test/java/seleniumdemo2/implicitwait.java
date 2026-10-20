package seleniumdemo2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.DriverFactory;

public class implicitwait {

    public static void main(String[] args) {

    	WebDriver driver = DriverFactory.getDriver();

        driver.manage().window().maximize();

        // --------------------------
        // IMPLICIT WAIT
        // --------------------------

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/dynamic-properties");

        WebElement element = driver.findElement(By.id("visibleAfter"));

        System.out.println(element.getText());

        driver.quit();
    }
}

