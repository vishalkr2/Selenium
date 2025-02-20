package MulipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CaptureAllElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		List<WebElement> elem = driver.findElements(By.xpath("//ul[@class='list']/li"));
		
		
		for (WebElement webElement : elem) {
			System.out.println(webElement.getText());
			
		}
		
		
	}

}
