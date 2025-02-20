package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class AutomateInAmazon {

	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.amazon.in/");
	String parent = driver.getWindowHandle();
	
	WebElement st = driver.findElement(By.id("twotabsearchtextbox"));
	st.sendKeys("iphone");
	
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	
	driver.findElement(By.xpath("//span[text()='iPhone 16 Pro 256 GB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Leap in Battery Life. Works with AirPods; Black Titanium']")).click();
	//ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
    //switch to active tab
    
	
	
	Set<String> allwindow = driver.getWindowHandles();
	
	for (String handle : allwindow) {
		System.out.println(handle);
		if(!handle.equals(parent)) {
			driver.switchTo().window(handle);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
			TakesScreenshot sc=(TakesScreenshot)driver;
			File temp=sc.getScreenshotAs(OutputType.FILE);
			File src=new File("./ScreenSort/amazon6.png");
			

			FileHandler.copy(temp,src);
			
			
			
		}
		//Thread.sleep(4000);
//	driver.switchTo().window(parent);
//	Thread.sleep(3000);
//	driver.switchTo().window(wid.get(1));
	//Thread.sleep(5000);
	
	
	
	
	}
}
}
