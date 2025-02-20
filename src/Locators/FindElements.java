package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElements {
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		List<WebElement> images = driver.findElements(By.tagName("img"));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		List<WebElement> btn = driver.findElements(By.tagName("button"));
		int size = images.size();
		int sizelink =links.size();
		System.out.println(size);
		System.out.println("link "+ sizelink);
		System.out.println("button "+btn.size());
	}
}
