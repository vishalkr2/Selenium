package synchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String[] args) {
        
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        
        driver.get("https://www.woodenstreet.com/");
        
        // Wait for the popup element to be visible
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginclose1")));
        
        // Click on the popup close button
        popup.click();
        
        // Optional: Close the browser
       // driver.quit();
    }
}
