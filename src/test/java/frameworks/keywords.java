package frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.DriverFactory;

public class keywords {

    WebDriver driver;

    public void openBrowser() {

    	driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

   public void openURL(String url) {

        driver.get(url);
    }

   public void enterUsername(String username) {

        driver.findElement(By.id("user-name")).sendKeys(username);
    }

   public void enterPassword(String password) {

        driver.findElement(By.id("password")).sendKeys(password);
    }

   public void clickLogin() {

       driver.findElement(By.id("login-button")).click();
   }

    public void closeBrowser(){

        driver.quit();
    }
}
