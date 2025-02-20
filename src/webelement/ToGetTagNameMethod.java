package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToGetTagNameMethod {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");

		Thread.sleep(2000);

		WebElement Tagname=driver.findElement(By.linkText("Try actiTIME for Free"));
		System.out.println(Tagname.getTagName());
		


		driver.quit();


	}
}
