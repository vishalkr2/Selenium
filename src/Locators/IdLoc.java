package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class IdLoc {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.Facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.id("email")).sendKeys("Hello@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Hello@123");
		driver.findElement(By.name("login")).click();
		
		
		
	}

}
