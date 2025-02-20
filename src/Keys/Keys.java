package Keys;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Keys {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.in/");
		String parent = driver.getWindowHandle();
		
		WebElement st = driver.findElement(By.id("twotabsearchtextbox"));
		st.sendKeys("iphone"+org.openqa.selenium.Keys.BACK_SPACE);
		
		
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
	}



}
