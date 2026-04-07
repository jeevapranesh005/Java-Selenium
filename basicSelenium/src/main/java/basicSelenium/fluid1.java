package basicSelenium;
import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;

public class fluid1 {
    public static void main(String[] args) {

        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://omayo.blogspot.com/");
        d.findElement(By.cssSelector(".dropbtn")).click();

        Wait<WebDriver> wait = new FluentWait<>(d)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(ElementNotInteractableException.class);

        WebElement fb = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.cssSelector("a[href='http://facebook.com']"));
            }
        });

        fb.click();
    }
}