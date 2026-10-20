package frameworks;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.DriverFactory;

public class DataDrivenTest {

    @Test
    public void loginTest() throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("test-data/login-data.csv"));

        String line;

        br.readLine(); // Skip header

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            String username = data[0];
            String password = data[1];

            WebDriver driver = DriverFactory.getDriver();
            driver.manage().window().maximize();

            driver.get("https://www.saucedemo.com/");

            driver.findElement(By.id("user-name")).sendKeys(username);

            driver.findElement(By.id("password")).sendKeys(password);

            driver.findElement(By.id("login-button")).click();

            driver.quit();
        }

        br.close();
    }
}