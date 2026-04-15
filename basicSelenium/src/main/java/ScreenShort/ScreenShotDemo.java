package ScreenShort;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo  {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.testim.io/");
		TakesScreenshot image=(TakesScreenshot) d;
		File source=image.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("./SeleniumScreenshots/Screenimage.png"));
		System.out.println("Screen Shot");
		d.quit();
		
	}

}