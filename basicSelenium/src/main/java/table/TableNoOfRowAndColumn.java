package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableNoOfRowAndColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> list1 = driver.findElements(By.xpath("//table[@id='table1']//thead//th"));
		List<WebElement> list2 = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		System.out.println("cloumn :"+list1.size());
		System.out.println("rows : "+list2.size());	
		
	}

}
