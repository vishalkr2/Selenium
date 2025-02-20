package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ContainsXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();

		driver.findElement(By.xpath("//input[@value='Log in']")).click();

//		String errorMsg=driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getText();
//		System.out.println(errorMsg);
		
		 // Retrieve the error message
		 // Retrieve the error message
        WebElement errorElement = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]"));
        String actualErrorMsg = errorElement.getText();

        // Expected error message
        String expectedErrorMsg = "Login was unsuccessful. Please correct the errors and try again.";

        // Verify and validate the error message using if-else
        if (actualErrorMsg.equals(expectedErrorMsg)) {
            System.out.println("Validation Passed: " + actualErrorMsg);
        } else {
            System.out.println("Validation Failed!");
            System.out.println("Expected: " + expectedErrorMsg);
            System.out.println("Actual: " + actualErrorMsg);
        }
        Thread.sleep(3000);
        driver.quit();
//	

	}

}
