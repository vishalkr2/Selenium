package ScreenShotElement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShort {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		
		driver.get("https://www.flipkart.com/");
		TakesScreenshot sc=(TakesScreenshot)driver;
		File temp=sc.getScreenshotAs(OutputType.FILE);
		File src=new File("./ScreenSort/Flipkart2.png");
	
		FileHandler.copy(temp,src);
		
	}

}
