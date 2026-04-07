package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.ExpectedConditions;
public class explicity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement timer =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timerButton")));
		timer.click();
		
		WebElement timer1 =wait.until(ExpectedConditions.elementToBeClickable(By.id("alert2")));
		timer1.click();
		
		
		driver.quit();
	
	}
}
