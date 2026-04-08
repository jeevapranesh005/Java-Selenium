package basicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Actiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement blogmenu = driver.findElement(By.id("blogsmenu"));
		Actions act = new Actions(driver);
		

		//context
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		act.contextClick(search).perform();
		
		
		act.moveToElement(blogmenu).perform();
		WebElement option = driver.findElement(By.xpath("//a[@href='http://www.selenium-by-arun.blogspot.com']"));
//		act.moveToElement(option).click().build().perform();
		WebElement doublec = driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
		act.doubleClick(doublec).perform();
		
	}

}
