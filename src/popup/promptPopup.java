package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class promptPopup {
public static void main(String[] args) {
	
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	
	
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	
	
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	
	driver.switchTo().alert();
	Alert promptpop=driver.switchTo().alert();
	
	promptpop.sendKeys("Hello Everyone");
	promptpop.accept();
	
	
	
}
}
