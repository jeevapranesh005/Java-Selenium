package basicSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class demotest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		WebElement Search = driver.findElement(By.name("q"));
		Search.sendKeys("selenium",Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.close();
		
	}
}
