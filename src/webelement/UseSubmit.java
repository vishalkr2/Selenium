package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class UseSubmit {
	public static void main(String[] args) throws InterruptedException {
	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='Search']")).submit();
	}

}
