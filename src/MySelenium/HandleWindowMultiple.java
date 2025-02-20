package MySelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleWindowMultiple {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		String parentwindow=driver.getWindowHandle();
		System.out.println("Parent Window " +parentwindow);
		
		
		Set<String> allwindow = driver.getWindowHandles();
		
		for (String handle : allwindow) {
			System.out.println(handle);
			if(!handle.equals(parentwindow)) {
				driver.switchTo().window(handle);
				Thread.sleep(3000);
				JavascriptException j=new JavascriptException(handle);
				driver.close();
				
				
			}
			Thread.sleep(4000);
			//driver.close();
			
			
		}
		
	}

}
