package table;

import java.util.List;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable {
	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("jeeva@gmail.com");
		

		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("1234567890");
		
		WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
		button.click();
		
		String expected = "jeeva pranesh";
		List<WebElement> contactNumber = driver.findElements(By.xpath("//table[@id='myTable']//tr//td[2]"));
		System.out.println(contactNumber.size());
		
		int i=1;
		for(WebElement name : contactNumber) {
			if(name.getText().equals(expected)) {
				List<WebElement> details = driver.findElements(By.xpath("//table[@id='myTable']//tr[@class='contactTableBodyRow']["+i+"]"));
				for(WebElement row : details) {
					System.out.println(row.getText());
				}
			}
			i++;
		}
		driver.quit();
	}
}
