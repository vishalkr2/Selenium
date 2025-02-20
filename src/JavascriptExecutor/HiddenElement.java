package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HiddenElement {
public static void main(String[] args) {
	

	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	
	driver.get("https://www.facebook.com/r.php?entry_point=login");
	
	WebElement hiddenelem = driver.findElement(By.id("custom_gender"));
	//Hidden Element
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].value='sukesh'", hiddenelem);

}
}