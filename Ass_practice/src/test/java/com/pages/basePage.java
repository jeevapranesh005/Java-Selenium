package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {
	
	WebDriver driver;
	WebDriverWait mywait;
	
	
	public basePage(WebDriver driver) {
		this.driver=driver;
		mywait= new WebDriverWait(driver,Duration.ofSeconds(15));
		
	}

}
