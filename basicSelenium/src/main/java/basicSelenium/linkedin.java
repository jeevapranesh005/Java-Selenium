package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//using cssSelector
public class linkedin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/checkpoint/lg/sign-in-another-account");
		WebElement user = driver.findElement(By.cssSelector("input#username"));
		user.sendKeys("jeevapranesh.vrp@gmail.com");
		WebElement pass = driver.findElement(By.cssSelector("input#password"));
		pass.sendKeys("Jeeva@1101");
		WebElement clicks = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		clicks.click();
		
		String title =driver.getTitle();
		
		
		if(title.equals("Feed | LinkedIn")) {
			System.out.println("welcome");
			System.out.println(title );
		}else {
			System.out.println("not login");
				
		}
		
		driver.quit();
		
	}
	
}
