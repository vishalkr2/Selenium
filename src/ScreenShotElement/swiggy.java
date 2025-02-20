package ScreenShotElement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class swiggy {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		
		File temp = driver.findElement(By.xpath("//img[@loading='lazy' and @width='100%']")).getScreenshotAs(OutputType.FILE);
		File src=new File("./ScreenSort/swiggy.png");
		FileHandler.copy(temp, src);
	}

}
