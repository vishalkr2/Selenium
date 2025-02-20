package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToHandleDisableElements {

	public static void main(String[] args) {
		

		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		
		
		driver.findElement(By.linkText("jdk-17.0.14_linux-aarch64_bin.tar.gz")).click();
		
		
		WebElement disableElement = driver.findElement(By.linkText("Download jdk-17.0.14_linux-aarch64_bin.tar.gz"));
		disableElement.click();
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", disableElement);
//		
		
		//System.out.println(disableElement.isEnabled());
}}