package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table1Row {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> list1 = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[1]"));
		System.out.println(list1.size());
		for(WebElement ele : list1) {
			System.out.println(ele.getText());
	}
	}}
