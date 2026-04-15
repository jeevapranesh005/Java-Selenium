import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class SS1 {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testim.io/");

        TakesScreenshot screenshot = (TakesScreenshot) driver;

        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("./screenshots/test.png");

        FileUtils.copyFile(source, destination);

        driver.quit();
    }
}