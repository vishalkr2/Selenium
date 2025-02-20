package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseClearMethod {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm");
		
		WebElement user=driver.findElement(By.id("username"));
		user.clear();
		
		Thread.sleep(2000);
		user.sendKeys("Test21@gmail.com");
		WebElement pass = driver.findElement(By.id("password"));
		pass.clear();
		pass.sendKeys("Test@123");
	}

}
