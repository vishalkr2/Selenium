package Keys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://facebook.com/");
		 WebElement user = driver.findElement(By.id("email"));
		 user.sendKeys("vishal12@gmail.com");
		 user.sendKeys(Keys.CONTROL+"A");
		 user.sendKeys(Keys.CONTROL+"C");
		 
		 driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"V");
		
		//Actions a=new Actions(driver);
		 driver.findElement(By.xpath("//div[@class='_9lsa]")).click();
		//a.click(s).perform();
		
	}

}
