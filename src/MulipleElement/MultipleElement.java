package MulipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		
		
		
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		for(;;) {
			try {
				driver.findElement(By.id("loginclose1")).click();
				break;
			}catch (Exception e) {
				Thread.sleep(3000);// TODO: handle exception
			}
		}
		List<WebElement> dr = driver.findElements(By.xpath("//ul[@class='container flex']/li"));
		
		for (WebElement string : dr) {
			System.out.println(string.getText());
			
		}
		
	}

}
