package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='table1']//th"));
		int columnSize = column.size();
		System.out.println(columnSize);
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		int rowSize = row.size();
		System.out.println(rowSize);
		
		for(int r=1;r<=rowSize;r++) {
			for(int c=1;c<=columnSize;c++) {
				WebElement data;
				if(r==1) {
					data= driver.findElement(By.xpath("//table[@id='table1']//tr["+r+"]//th["+c+"]"));
					System.out.println(data.getText()); 
					 	
				}
			}
		}
		
		
	}
	

}
