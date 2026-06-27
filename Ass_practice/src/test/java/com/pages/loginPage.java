package com.pages;import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage extends basePage {

	
	
	public loginPage(WebDriver driver) {
		super(driver);
		
	}
	
	By login= By.xpath("(//a[normalize-space()='Log in'])[1]");
	By userName = By.xpath("(//input[@id='loginusername'])[1]");
	By password= By.xpath("(//input[@id='loginpassword'])[1]");
	By button = By.xpath("(//button[normalize-space()='Log in'])[1]");
	
	public void login(String username, String pass) {
		driver.findElement(login).click();
		 mywait.until(ExpectedConditions.visibilityOfElementLocated(userName)).sendKeys(username);
		
		driver.findElement(password).sendKeys(pass);
		driver.findElement(button).click();
	}
	
	public String loginInvalid(String username, String pass) {
	    driver.findElement(login).click();

	    mywait.until(ExpectedConditions.visibilityOfElementLocated(userName)).sendKeys(username);
	    driver.findElement(password).sendKeys(pass);
	    driver.findElement(button).click();

	    // ✅ Wait for alert
	    mywait.until(ExpectedConditions.alertIsPresent());
	    String alertText = driver.switchTo().alert().getText();
	    driver.switchTo().alert().accept();

	    return alertText;
	}
	
	
	
}
