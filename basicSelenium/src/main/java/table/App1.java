package table;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("jeeva@gmail.com");
		

		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("1234567890");
		
		WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
		button.click();
		
		List<WebElement> row1 = driver.findElements(By.xpath("//tr[@class='contactTableBodyRow'][1]"));
		System.out.println(row1.size());
		
		for(WebElement ele: row1 ) {
			System.out.println(ele.getText());
		}
		
		

	}

}
