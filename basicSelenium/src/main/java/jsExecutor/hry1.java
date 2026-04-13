package jsExecutor;

import java.time.Duration;

import org.openqa.selenium.Alert; 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class hry1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String domain =js.executeScript("return document.domain").toString();
		
		System.out.println(domain);
		
		
		String url = js.executeScript("return document.URL;").toString();
		System.out.println("url is : "+url);
		
		js.executeScript("document.getElementsByName('name')[0].click();");
		js.executeScript("document.getElementsByName('name')[0].value='jeeva';");
		
		
		
		js.executeScript("document.getElementsByName('name')[1].click;");
		js.executeScript("document.getElementsByName('name')[1].value='Pranesh';");
		
		js.executeScript("document.getElementsByTagName('input')[2].click();");
		js.executeScript("document.getElementsByTagName('input')[2].value='Jeeva@gmail.com';");
		
		js.executeScript("document.getElementsByTagName('input')[3].click();");
		js.executeScript("document.getElementsByTagName('input')[3].value='1234567890';");
		
		js.executeScript("document.getElementsByTagName('input')[4].click();");
		js.executeScript("document.getElementsByTagName('input')[4].value='1234567890';");
		
		js.executeScript("document.getElementsByClassName('btn')[0].click();");
		
		String newUrl = js.executeScript("return document.URL;").toString();
		
		System.out.println(newUrl);
		
		if(!url.equals(newUrl)) {
			System.out.println("Resgister is completed");
		}
		else {
			System.out.println("register is not completed");
		}
	}
}
