package ScreenShotElement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ZomatoElem {
	public static void main(String[] args) throws IOException {
	
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		TakesScreenshot p=(TakesScreenshot)driver;
		File temp=p.getScreenshotAs(OutputType.FILE);
		//File temp = driver.findElement(By.xpath("//img[@src='https://b.zmtcdn.com/web_assets/8313a97515fcb0447d2d77c276532a511583262271.png']")).getScreenshotAs(OutputType.FILE);
		File src=new File("./ScreenSort/zomatoful.png");
	
		FileHandler.copy(temp, src);
		
	}

}
