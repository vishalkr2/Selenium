package MulipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ListElement {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new EdgeDriver();//upcasting 
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		 List<WebElement> element = driver.findElements(By.xpath("//ul[@class='top-menu']/li"));
		 
		 for (WebElement List : element) {
			 System.out.println(List.getText());
			
		}
		 
		
		
		
	}

}
