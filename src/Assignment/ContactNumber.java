package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ContactNumber {
	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.get("https://www.dream11.com/");
		WebElement f1 = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(f1);
		
		driver.findElement(By.id("regEmail")).sendKeys("9987544476");
		
	}

}
