package webelement;

import org.openqa.selenium.Rectangle;

import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;

public class GetRect {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");

		Thread.sleep(2000);
		Rectangle  loc = driver.findElement(By.linkText("Try actiTIME for Free")).getRect();
		System.out.println("Height "+loc.getHeight());
		System.out.println("Width "+loc.getWidth());
		System.out.println("x-axis "+loc.getX());
		System.out.println("y-axis "+loc.getY());
}


}
