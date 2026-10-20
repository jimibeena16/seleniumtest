package seleniumdemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.DriverFactory;

public class xpath {

    public static void main(String[] args) throws InterruptedException {

    	WebDriver driver = DriverFactory.getDriver();

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        // 1. Absolute XPath
        // /html/body/div/div/div/div/div/div/form/div/input

        // 2. Relative XPath
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Jimi");
        Thread.sleep(2000);
        // 3. XPath using attribute
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jimi@test.com");
        
       
        // 4. contains()
        driver.findElement(By.xpath("//textarea[contains(@id,'current')]")).sendKeys("Kochi");
        Thread.sleep(2000);
        // 5. starts-with()
        driver.findElement(By.xpath("//input[starts-with(@id,'userN')]"));

        // 6. XPath with text()
        String heading = driver.findElement(By.xpath("//h1[text()='Text Box']")).getText();

        System.out.println(heading);

        driver.quit();
    }
}