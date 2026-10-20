package seleniumdemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.DriverFactory;

public class radio {

	public static void main(String[] args) {
		WebDriver driver = DriverFactory.getDriver();
		 driver.manage().window().maximize();

		 driver.get("https://demoqa.com/radio-button");
		WebElement yesRadio = driver.findElement(By.xpath("//input[@id='yesRadio']"));
		yesRadio.click();
		
		System.out.println(yesRadio.isSelected());

	//	WebElement radio = driver.findElement(By.id("yesRadio"));
		//System.out.println(radio.isSelected());
		
		driver.quit();
	}

}
