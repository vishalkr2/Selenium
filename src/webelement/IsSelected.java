package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsSelected {
	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		
		
		WebElement element = driver.findElement(By.xpath("//option[@value='199']"));
		element.click();
		System.out.println(element.isSelected());
	}

}
