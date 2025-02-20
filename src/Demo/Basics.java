package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Basics {
	public static void main(String[] args) {
		
	
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
	}

}
