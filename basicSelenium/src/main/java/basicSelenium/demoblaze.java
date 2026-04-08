package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//user : john@12345
//pass : 12345

//1.login
//2.wait
//manual la close the login
//

public class demoblaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("a#login2")).click();
		WebElement user =driver.findElement(By.cssSelector("input#loginusername"));
		user.click();
		user.sendKeys("john@12345");
		WebElement pass =driver.findElement(By.cssSelector("input#loginpassword"));
		pass.click();
		pass.sendKeys("12345");
		driver.findElement(By.cssSelector("button[type='button'][onclick='logIn()']")).click();
		//Welcome john@12345
		WebElement tit = driver.findElement(By.cssSelector("a#nameofuser"));
		System.out.println(tit.getText());
		
	}

}
