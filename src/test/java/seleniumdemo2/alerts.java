package seleniumdemo2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.DriverFactory;

public class alerts {

	public static void main(String[] args) {
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = DriverFactory.getDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://demoqa.com/alerts");
		 driver.findElement(By.id("alertButton")).click();

		 Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		 alert.accept();
		 
		 driver.quit();

	}

}
