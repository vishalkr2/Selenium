package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class IdFindElement {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/free-online-trial");
		
		Thread.sleep(3000);
		driver.findElement(By.id("cookie-button--got-it")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("Akarsh");
		driver.findElement(By.id("LastName")).sendKeys("Kr");
		driver.findElement(By.id("Email")).sendKeys("Kr12@gmail.com");
		driver.findElement(By.id("Company")).sendKeys("ATool");
		driver.findElement(By.id("confirm-button")).click();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
