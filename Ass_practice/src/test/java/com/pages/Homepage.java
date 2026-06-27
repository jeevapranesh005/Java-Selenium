package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends basePage{
	
	public Homepage(WebDriver driver) {
		super(driver);
	}


	
	
	
	By Welcome =  By.xpath("//a[text()='Welcome TamilKumar']");
	
	public String getWel() {
	    return mywait.until(ExpectedConditions.visibilityOfElementLocated(Welcome)).getText();
	}

}
