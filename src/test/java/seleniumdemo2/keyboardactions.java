package seleniumdemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.DriverFactory;

public class keyboardactions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverFactory.getDriver();

	      driver.manage().window().maximize();
		
		 driver.get("https://demoqa.com/text-box");

    	 WebElement currentAddress =
    	         driver.findElement(By.id("currentAddress"));

    	 currentAddress.sendKeys("Trivandrum, Kerala");

    	 currentAddress.sendKeys(Keys.CONTROL + "a");
    	 currentAddress.sendKeys(Keys.CONTROL + "c");

    	 currentAddress.sendKeys(Keys.TAB);

    	 WebElement permanentAddress =
    	         driver.switchTo().activeElement();

    	 permanentAddress.sendKeys(Keys.CONTROL + "v");

    	 System.out.println("Copied and pasted successfully");

         Thread.sleep(3000);


	}

}
