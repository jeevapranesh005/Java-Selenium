package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://leafground.com/drag.xhtml");   
		Actions act=new Actions(d);
		WebElement drag=d.findElement(By.cssSelector("div[id='form:"
				+ ".drag_content'] "));
		WebElement drop=d.findElement(By.cssSelector("div[id='form:drop_header']"));
		
		act.dragAndDrop(drag,drop).perform();
//		act.clickAndHold(drag).moveToElement(drop).build().perform();
	}

}