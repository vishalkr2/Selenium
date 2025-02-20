package Keys;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class google {

    public static void main(String[] args) throws InterruptedException {
        EdgeOptions op = new EdgeOptions();
        op.addArguments("-inprivate");
        WebDriver driver = new EdgeDriver(op);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://google.com/");

        driver.findElement(By.name("q")).sendKeys("shoes" + Keys.ENTER);
        Thread.sleep(2000);

        // Wait for user input to solve CAPTCHA
        System.out.println("Solve the CAPTCHA manually, then press Enter...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Wait for user input before proceeding
        scanner.close();

        System.out.println("Continuing automation...");
        // Proceed with further actions after CAPTCHA is solved
    }
}
