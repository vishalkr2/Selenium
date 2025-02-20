import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class googleMeet {

public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	
	driver.get("https://meet.google.com/landing");
	
	driver.findElement(By.xpath("//span[contains(text(),'New meeting')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Enter code')]")).click();
	
}
}
