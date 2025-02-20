package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class linkText {
	public static void main(String[] args) throws Exception{
		
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	

}
