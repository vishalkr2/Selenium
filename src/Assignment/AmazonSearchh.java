package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonSearchh{
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}
	

}
