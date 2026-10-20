package com.training.pages;
import org.openqa.selenium.*;

public class ProductsPage {
	
 private final WebDriver driver;
 
 private final By title=By.cssSelector("[data-test='title']");
 
 public ProductsPage(WebDriver driver){
	 this.driver=driver;
	 }
 public boolean isDisplayed(){
	 return driver.findElement(title).isDisplayed();
	 }
}