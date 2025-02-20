package MulipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FacbookUnPwdAlignOrNot {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://facebook.com/");
		
		
		List<WebElement> cordinate = driver.findElements(By.xpath("//div[@class='_6lux']"));
		
		for (WebElement webElement : cordinate) {
			System.out.println(webElement.getRect().getX());
		}
		
		
		
		//driver.findElement(By.xpath(""));
		//		if(usr.==usr2) {
		//			System.out.println("Same");
		//		}
		//		System.out.println("Not Same");
		//		

	}

}
