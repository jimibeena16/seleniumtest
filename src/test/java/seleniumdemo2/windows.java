package seleniumdemo2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.DriverFactory;

public class windows {
	 public static void main(String[] args) {

		 WebDriver driver = DriverFactory.getDriver();

      driver.manage().window().maximize();
      
	driver.get("https://demoqa.com/browser-windows");

	String parentWindow =  driver.getWindowHandle();
	driver.findElement(By.id("tabButton")).click();

	Set<String> windows = driver.getWindowHandles();

	for(String window : windows) {

	    if(!window.equals(parentWindow)) {

	        driver.switchTo().window(window);

	        String text = driver.findElement(By.id("sampleHeading")).getText();

	        System.out.println(text);

	        if(text.equals("This is a sample page")) {
	            System.out.println("New tab opened successfully");
	        }

	        driver.close();
	    }
	}
	
	driver.switchTo().window(parentWindow);
	 }

}
