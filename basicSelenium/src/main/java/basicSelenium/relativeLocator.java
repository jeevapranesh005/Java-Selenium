package basicSelenium;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
public class relativeLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();		
//		WebElement submit = driver.findElement(with(By.tagName("input")).below(firstname));	
		driver.get("https://www.hyrtutorials.com/");
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		
		WebElement menu = driver.findElement(By.xpath("//a[text()=\"Selenium Practice\"]"));
		action.moveToElement(menu).perform();
		
		WebElement choice = driver.findElement(By.xpath("//a[text()=\"XPath Practice\"]"));
		choice.click();
		Thread.sleep(2000);
		
		WebElement first = driver.findElement(By.xpath("//label[text()=\"First Name \"]/following::input[1][@type='text']"));
		first.sendKeys("jeeva");
		Thread.sleep(2000);
		WebElement sen = driver.findElement(with(By.tagName("input")).below(first));
		sen.sendKeys("pranehh");
		Thread.sleep(5000);
		WebElement thr=driver.findElement(with(By.tagName("input")).below(sen));
		thr.sendKeys("jee@11");
		Thread.sleep(5000);
		
		WebElement table = driver.findElement(By.xpath("//tr[2]/child::td[text()=\"Maria Anders\"]"));
		WebElement lef = driver.findElement(with(By.tagName("input")).toLeftOf(table));
		lef.click();
		Thread.sleep(5000);
		
		WebElement tab = driver.findElement(By.xpath("//tr[2]/child::td[text()=\"5000\"]"));
		WebElement rig = driver.findElement(with(By.tagName("a")).toRightOf(tab));
		rig.click();
		Thread.sleep(5000);
		
		

		
		
		
		
		//label[text()="First Name "]/following::input[1][@type='text']
		driver.quit();
	}
}
