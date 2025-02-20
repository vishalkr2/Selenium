package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetColour {
	public static void main(String[] args) throws InterruptedException {






		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);

		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);

		WebElement elem=driver.findElement(By.xpath("//input[@value='Log in']"));
		
		elem.click();
		
		System.out.println();
		WebElement elem2=driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]"));
		//WebElement css=	driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
		System.out.println(elem2.getCssValue("color"));
	}

}
