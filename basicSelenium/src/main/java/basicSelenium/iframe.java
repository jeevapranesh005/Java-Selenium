package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		String frame1out = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Switch by locator : "+frame1out);
		
		driver.switchTo().defaultContent();
		String main = driver.findElement(By.xpath("//*[@id='framesWrapper']/h1")).getText();
		System.out.println(main);
		
		WebElement frame2= driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frame2);
		String next = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(next);
		
		
		
	}

}
