package Keys;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demostack {

	public static void main(String[] args) {
		 WebDriver driver=new EdgeDriver();
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://www.woodenstreet.com/");
			
			
			//List<WebElement> st = driver.findElements(By.partialLinkText("Sofas"));
			
			 List<WebElement> sofa = driver.findElements(By.xpath("//ul[@class='main_menu']/li"));
			for (WebElement webElement : sofa) {
				System.out.println(webElement.getText());
				
			}
			
	}

}
