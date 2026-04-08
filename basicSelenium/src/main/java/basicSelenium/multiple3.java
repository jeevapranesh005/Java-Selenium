package basicSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		String parent = driver.getWindowHandle();
		
		Set <String> count= driver.getWindowHandles();
		System.out.println(count.size());
		
		driver.findElement(By.xpath("//span[normalize-space()='Close Windows']")).click();
		
		Set <String> count1= driver.getWindowHandles();
		System.out.println(count1.size());
		for(String id:count1) {
			driver.switchTo().window(id);
			if(!parent.equals(id)) {
				driver.close();
				
			}
		}
	
	}

}
