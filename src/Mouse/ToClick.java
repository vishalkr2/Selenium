package Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToClick{
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.flipkart.com/");
		
		//driver.findElement(By.xpath("//span[@role='button']")).click();
		
		
		Actions act=new Actions(driver);
		//WebElement electronics = driver.findElement(By.xpath("//div[@aria-label='Electronics']"));
		WebElement electronics=driver.findElement(By.xpath("//span[text()='Electronics']"));  
		
		Actions action=new Actions(driver);
		
		action.moveToElement(electronics).perform();
		
		WebElement game=driver.findElement(By.linkText("Gaming"));
		
		action.moveToElement(game).perform();
		WebElement gamingKey = driver.findElement(By.linkText("Gaming Keyboards"));
		action.click(gamingKey).perform();
		
		
		//WebElement d = driver.findElement(By.name("login"));
	}

}
