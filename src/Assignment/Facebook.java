package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		driver.findElement(By.id("day")).click();
		
		driver.findElement(By.xpath("//option[@value='14']")).click();
		driver.findElement(By.xpath("//select[@id='month']")).click();
		
		
		
		//driver.findElement(By.id("month"));
		driver.findElement(By.xpath("//option[@value='2']")).click();
		
		driver.findElement(By.id("year"));
		driver.findElement(By.xpath("//option[@value='2004']")).click();
		
				}

}
