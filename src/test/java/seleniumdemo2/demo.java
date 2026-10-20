package seleniumdemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.DriverFactory;

public class demo {

	public static void main(String[] args) {
		//  WebDriver driver = new ChromeDriver();
		  WebDriver driver = DriverFactory.getDriver();
	        try {

	             driver.get("https://www.saucedemo.com/");

	             driver.findElement(By.id("wrong-username")).sendKeys("standard_user");

	         } catch (Exception e) {

	           System.out.println("Error: " + e.getMessage());

	         } finally {

	            System.out.println("Browser closed");
	            driver.quit();

	         }
	     }
	
	}


