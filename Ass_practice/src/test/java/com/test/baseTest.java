
package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.pages.Homepage;
import com.pages.loginPage;

public class baseTest {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // Getter
    public WebDriver getDriver() {
        return driver.get();
    }

    loginPage lpage;
    Homepage hpage;

    @BeforeMethod
    public void setup() {
        driver.set(new ChromeDriver());

        getDriver().manage().window().maximize();
        getDriver().get("https://www.demoblaze.com/");
    }

    @AfterMethod
    public void close() {
        getDriver().quit();
        driver.remove();   // ✅ VERY IMPORTANT for parallel
    }
}