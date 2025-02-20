import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleAlertUsingExplicitWait {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.get("https://demowebshop.tricentis.com/");
	
	String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
	
	driver.findElement(By.linkText("Register")).sendKeys(tab);
	// driver.switchTo().newWindow(WindowType.TAB);//blank page Tab will be open
	ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
    //switch to active tab
    driver.switchTo().window(wid.get(1));
	
	//driver.switchTo().;
	
	
}
}
