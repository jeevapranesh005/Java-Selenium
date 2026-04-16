package ScreenShort;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//
public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.selenium.dev/");
		try {
			WebElement logo=d.findElement(By.cssSelector("body > div:nth-child(2) > main:nth-child(1) > section:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > svg:nth-child(1) > path:nth-child(4)"));
			File source=(File) ((TakesScreenshot) logo).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File("./SeleniumScreenshots/logo"+System.currentTimeMillis()+".png"));
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("Screenshot taken");
		d.quit();
	}

}