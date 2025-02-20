package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathByMultiple {
	
		public static void main(String[] args) throws InterruptedException {
			EdgeDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.shoppersstack.com/");
			Thread.sleep(8000);
			driver.findElement(By.id("loginBtn")).click();
			Thread.sleep(8000);
			driver.findElement(By.id("email")).sendKeys("dibyajyotisenapati033@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("Password")).sendKeys("Dibya@898989");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Password")).click();
			Thread.sleep(2000);
			driver.quit();

		}
		
		
	}
