package basicSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindow2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		String parent = driver.getWindowHandle();
		
		Set <String> count= driver.getWindowHandles();
		System.out.println(count.size());
		
		driver.findElement(By.xpath("//span[normalize-space()='Open']")).click();
		String child = driver.getWindowHandle();
		
		String title = driver.getTitle();
		
		Set <String> count2= driver.getWindowHandles();
		System.out.println(count2.size());
		
		for(String id :count2) {
			
			if(child.equals(id)) {
				System.out.println("new tab open");
			}
		}
		
		
		
		
		
		

	}

}
