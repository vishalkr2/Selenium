package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckRegister {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		
		
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		
		driver.findElement(By.id("gender-male")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("Vishal");
		driver.findElement(By.id("LastName")).sendKeys("Kumar");
		driver.findElement(By.id("Email")).sendKeys("Vishal12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Vishal@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Vishal@123");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		
		WebElement successMessage = driver.findElement(By.className("result"));
        if (successMessage.getText().contains("Your registration completed")) {
            System.out.println("Registration was successful!");
        } else {
            System.out.println("Registration failed or success message not found.");
        }
		
		
		
		
	}

}
