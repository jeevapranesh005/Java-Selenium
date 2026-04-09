package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


public class Select1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml;jsessionid=node01nmph2bmyyaum154t0j5yzugy714556586.node0");
		WebElement UIAutomate = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	
		
		Select sel = new Select(UIAutomate);
		List<WebElement> list1 = sel.getOptions();
		System.out.println("The drop Down option size : "+list1.size());
		for(WebElement ele : list1) {
			System.out.println(ele.getText());
		}
		Boolean mult = sel.isMultiple();
		System.out.println("the multipele option is avalible in drop down : "+mult);
		sel.selectByIndex(2);
		sel.selectByVisibleText("Cypress");
		
		
		WebElement drop2= driver.findElement(By.xpath("//ul[@class='ui-autocomplete-multiple-container ui-autocomplete-dd-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-left']"));
		
	}

}
