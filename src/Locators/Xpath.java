package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Login in")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

}
