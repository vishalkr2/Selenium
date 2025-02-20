package Mouse;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovebyOffset {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://www.flipkart.com/");
		
		
		Actions actions=new Actions(driver);
		actions.moveByOffset(471, 168).perform();
		
		
	}

}
