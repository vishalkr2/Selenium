package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathBySurrounding {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
		
		Thread.sleep(60000);
		driver.findElement(By.xpath("//span[text()='roadster']/../..//button[text()='add to cart']")).click();
		
//		driver.findElement(By.linkText("Log in")).click();
//		Thread.sleep(3000);

}
}