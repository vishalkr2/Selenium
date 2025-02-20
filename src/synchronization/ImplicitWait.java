package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ImplicitWait {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.woodenstreet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//div[@id='loginclose1']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		
		driver.close();
	}

}
