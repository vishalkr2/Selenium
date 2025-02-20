package Keys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Deom {

public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.vtiger.com/");
	
	Actions actions=new Actions(driver);
	
	WebElement comp = driver.findElement(By.partialLinkText("Company"));
	//comp.click();
	
	actions.moveToElement(comp).perform();
	driver.findElement(By.partialLinkText("Contact Us")).click();
	
	WebElement s = driver.findElement(By.xpath("//p[contains(text(),'+91 9243602352')]"));
	System.out.println("Banglauru number: "+s.getText());
	
	
	

}
}
