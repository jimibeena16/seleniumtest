package seleniumdemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.DriverFactory;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverFactory.getDriver();
		 driver.manage().window().maximize();
		 
		driver.get("https://demoqa.com/checkbox");
		  driver.findElement(By.xpath("//span[contains(@class,'rc-tree-switcher')]")).click();
		  
		  WebElement checkbox = driver.findElement(By.xpath("//span[@aria-label='Select Downloads']"));
		  checkbox.click();
		    	 
		   Thread.sleep(3000);
		  String result = driver.findElement(By.id("result")).getText();
		         if(result.contains("downloads")) {
		             System.out.println("Downloads selected");
		         } else {
		             System.out.println("Downloads not selected");
		         }
              driver.quit();

	}

}
