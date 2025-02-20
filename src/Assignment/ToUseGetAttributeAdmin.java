package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseGetAttributeAdmin {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(3000);
		
		String value=driver.findElement(By.id("username")).getAttribute("value");
		System.out.println(value);
		Thread.sleep(2000);
		WebElement elem = driver.findElement(By.id("password"));
		List<WebElement> elem2 = driver.findElements(By.tagName("div"));
		System.out.println(elem.getSize());
		
		System.out.println(elem.getAttribute("value"));
		elem.clear();
		elem.sendKeys("Test");
		String value2=elem.getAttribute("value");
		
		System.out.println(value2);
		
		
		String value3=driver.findElement(By.xpath("//img[@src='layouts/v7/resources/Images/vtiger.png']")).getAttribute("src");
		System.out.println(value3);
		
		
	}

}
