package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathVisibleText {
	public static void main(String[] args)throws RuntimeException, InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(30000);
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		
		
		
	}

}
