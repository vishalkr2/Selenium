package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NameLocate {
	public static void main(String[] args) throws Exception{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://instagram.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.name("username")).sendKeys("Hey12@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("Test@123");
		Thread.sleep(2000);
		
		driver.findElement(By.name("")).click();
		
		
		
		
		
		
		
	}
}
