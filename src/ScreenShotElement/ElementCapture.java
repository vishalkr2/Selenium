package ScreenShotElement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ElementCapture {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://uidai.gov.in/en/");
		
		Thread.sleep(4000);
		
		
		File temp=driver.findElement(By.xpath("//img[@alt='Aadhaar']")).getScreenshotAs(OutputType.FILE);
		
		File src=new File("./ScreenSort/adhaar.png");
		
		FileHandler.copy(temp, src);
		
		
		
	}

}
