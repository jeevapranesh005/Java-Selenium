package basicSelenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_window {
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://demoqa.com/browser-windows");
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow.size());
		
		//newchild
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> newallwindow = driver.getWindowHandles();
		System.out.println("new count "+newallwindow.size());
		
		
		Iterator<String> iterator = newallwindow.iterator();
		String mainwindow = iterator.next();
		String childwindow = iterator.next();
		System.out.println("parent window "+mainwindow);
		System.out.println("child "+childwindow);
		
		//switch to child
		driver.switchTo().newWindow(WindowType.TAB);
		
//		
//		//text of child window
//		WebElement text = driver.findElement(By.id("sampleHeading"));
//		System.out.println("child_title "+text.getText());
//		
//		
//		driver.close();
//		
//		driver.switchTo().window(parentWindow);
//		System.out.println("parent_title "+driver.getTitle());
//		
		driver.quit();
		
	}
}
