package seleniumdemo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.DriverFactory;

public class sample {

public static void main(String[] args) {
		
	WebDriver driver = DriverFactory.getDriver();
		// Open URL
        driver.get("https://demoqa.com");
        
       // driver.navigate().to("https://demoqa.com");

        // Get title
        System.out.println(driver.getTitle());

        // Get current URL
        System.out.println(driver.getCurrentUrl());

        // Maximize
        driver.manage().window().maximize();

        // Refresh
        driver.navigate().refresh();

        // Back
        driver.navigate().back();

        // Forward
        driver.navigate().forward();

        // Close current window
        // driver.close();

        // Close complete browser session
        driver.quit();
		}

}
