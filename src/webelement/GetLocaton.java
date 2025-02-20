package webelement;

import org.openqa.selenium.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;

public class GetLocaton {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");

		Thread.sleep(2000);
		Point  location = driver.findElement(By.linkText("Try actiTIME for Free")).getLocation();
		System.out.println(location);
		System.out.println(location.getX());
		System.out.println(location.getY());
}
}
