package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ClassNameLocator {
    public static void main(String[] args) throws InterruptedException {
        // Initialize WebDriver for the first window (Instagram)
        WebDriver driver1 = new EdgeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://instagram.com/");
        Thread.sleep(3000);

        // Fix: Use CSS Selector instead of className for multiple class names
        driver1.findElement(By.cssSelector("input[class='_aa4b._add6._ac4d._ap35']")).sendKeys("Hello");
        Thread.sleep(3000);

        // Initialize WebDriver for the second window (Demo Web Shop)
        WebDriver driver2 = new EdgeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://demowebshop.tricentis.com/");
        Thread.sleep(3000);

        // Locate and interact with elements in the second window
        WebElement login = driver2.findElement(By.linkText("Log in"));
        login.click();
        Thread.sleep(3000);
        driver2.findElement(By.className("email")).sendKeys("HelloWorld");
    }
}
