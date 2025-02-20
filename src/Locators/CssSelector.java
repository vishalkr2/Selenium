package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelector {
	public static void main(String[] args) throws Exception{
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		Thread.sleep(5000);
		
		
		//driver.quit();
	}

}
