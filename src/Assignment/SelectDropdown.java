package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		driver.findElement(By.partialLinkText("Books")).click();
		
		
		WebElement product = driver.findElement(By.id("products-orderby"));
		
		WebElement size = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		
		WebElement view = driver.findElement(By.id("products-viewmode"));
		
		
		Select pro=new Select(product);
		
		Select sizedrop=new Select(size);
		Select viewdrop=new Select(view);
		
		pro.selectByIndex(4);
		Thread.sleep(2000);

		sizedrop.selectByValue("https://demowebshop.tricentis.com/books?orderby=11&pagesize=12");
		viewdrop.selectByValue("https://demowebshop.tricentis.com/books?pagesize=11&viewmode=list");
		
		
	}

}
