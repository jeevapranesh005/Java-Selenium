package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class leafGround {
	
	public static void waitForVisibility(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement button = driver.findElement(By.id("j_idt87:j_idt89"));
		button.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_idt87:j_idt90")));
		
		WebElement hereButton = driver.findElement(By.id("j_idt87:j_idt90"));
		System.out.println(hereButton.getText());
	}
	
	public static void waitForInVisibility(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement button = driver.findElement(By.id("j_idt87:j_idt92"));
		button.click();	
		
		
		WebElement hereButton = driver.findElement(By.id("j_idt87:j_idt93"));
		wait.until(ExpectedConditions.invisibilityOf(hereButton));
		
		System.out.println("Button Disabled");
	}
	
	public static void waitForTextChange(WebDriver driver)
	{
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    

	    System.out.println("Before: " + driver.findElement(By.id("j_idt87:j_idt99")).getText());

	    driver.findElement(By.id("j_idt87:j_idt98")).click();

	    wait.until(ExpectedConditions.textToBePresentInElementLocated(
	    		By.id("j_idt87:j_idt99"), "Did you notice?"
	    ));

	    System.out.println("After: " + driver.findElement(By.id("j_idt87:j_idt99")).getText());
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/waits.xhtml;jsessionid=node01b4hzrtaju006q5jjxqonrnzj14506720.node0");
		waitForVisibility(driver);
		waitForInVisibility(driver);
		waitForTextChange(driver);
	}
}