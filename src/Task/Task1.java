package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task1 {
	public static void main(String[] args)throws Exception {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dream11.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("About Us")).click();
		
		
		String parent = driver.getWindowHandle();
		
		 Set<String> child = driver.getWindowHandles();
		
		for (String handle: child) {
			
			if(!handle.equals(parent)) {
				
				driver.switchTo().window(handle);
				
				driver.findElement(By.linkText("Dream Responsibly")).click();
				
			}
			
		}
		
		
	}

}
