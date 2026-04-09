package basicSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Actions act = new Actions(driver);
		String parent = driver.getWindowHandle();
		
		WebElement comp = driver.findElement(By.linkText("compendiumdev"));
		act.keyDown(Keys.CONTROL).moveToElement(comp).click().build().perform();
		
		
		Set<String> count = driver.getWindowHandles();
		
		for(String id : count) {
			driver.switchTo().window(id);
		}
		System.out.println(count.size());
		driver.switchTo().window(parent);
	}

}
