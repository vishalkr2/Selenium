package webelement;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToCaptureSizeOfElement {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");

		Thread.sleep(2000);
		Dimension sizeelement = driver.findElement(By.linkText("Try actiTIME for Free")).getSize();
		System.out.println(sizeelement);
		System.out.println(sizeelement.getHeight());
		System.out.println(sizeelement.getWidth());
		


		driver.quit();

}
}
