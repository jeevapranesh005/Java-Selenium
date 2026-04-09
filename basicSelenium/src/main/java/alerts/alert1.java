package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
//		WebElement simple = driver.findElement(By.xpath("//input[@id='alert1']"));
//		simple.click();
		
//		Alert sa = driver.switchTo().alert();
//		System.out.println(sa.getText());
//		sa.accept();		
  
		//promt
		WebElement promt = driver.findElement(By.xpath("//input[@id='prompt']"));
		promt.click();
		Alert pa = driver.switchTo().alert();
		pa.sendKeys("Jeevap");
		Thread.sleep(5000);
		pa.accept();
		
		
		//comform
//		WebElement comform = driver.findElement(By.xpath("//input[@id='confirm']"));
//		comform.click();
//		Alert ca = driver.switchTo().alert();
//		System.out.println(ca.getText()); 
//		System.out.println("finish");
//		
		
		
		
		
	}

}
