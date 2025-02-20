package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseGetAttribute {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/");
		
		Thread.sleep(2000);
		
		String value=driver.findElement(By.linkText("Try actiTIME for Free")).getAttribute("class");
		System.out.println(value);
	}

}
