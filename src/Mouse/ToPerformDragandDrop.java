package Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragandDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		
		//iframe 
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		
		
		//identify image
		WebElement img1=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement img4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		
		
		//identify dropbox
		
		WebElement trash = driver.findElement(By.id("trash"));
		
		
		Actions actions=new Actions(driver);
		
		actions.clickAndHold(img1).moveToElement(trash).release().perform();
		actions.dragAndDropBy(img2, 500, 0).perform();
		//actions.dragAndDrop(img1, trash).perform();
		//actions.dragAndDrop(img2, trash).perform();
		actions.dragAndDrop(img3, trash).perform();
		actions.dragAndDrop(img4, trash).perform();
		Thread.sleep(2000);
		
		//identify gallery
		
		WebElement gallary = driver.findElement(By.id("gallery"));
		//drag and drop(WE src,WE target)
		//perform dragand drop action 
		actions.dragAndDrop(img1, gallary).perform();
		actions.dragAndDrop(img2, gallary).perform();
		actions.dragAndDrop(img3, gallary).perform();
		actions.dragAndDrop(img4, gallary).perform();
		
		
		
		
		
		
	}

}
