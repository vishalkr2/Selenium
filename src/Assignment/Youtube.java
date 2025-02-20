package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Youtube {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://youtube.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("search_query")).sendKeys("kaha se ye hawa aayi");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='ytSearchboxComponentSearchButton']")).click();
		
		//driver.findElement(By.xpath("//a[href='/watch?v=y12BRDS1CHI&pp=ygUUa2FoYSBzZSB5ZSBoYXdhIGFheWk%3D']")).click();
		
		Thread.sleep(3000);
		  
		//driver.findElement(By.cssSelector("a[href='/watch?v=y12BRDS1CHI&pp=ygUUa2FoYSBzZSB5ZSBoYXdhIGFheWk%3D'")).click();
		driver.findElement(By.xpath("//img[contains(@src,'Sut_KOIbwn0')]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("button[data-title-no-tooltip='Pause']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[data-title-no-tooltip='Play']")).click();
		
		
		WebElement Playbtn = driver.findElement(By.cssSelector("div[id='movie_player']"));
		//Playbtn.click();
		Thread.sleep(20000);
		//5sec Increase  Forward
		Playbtn.sendKeys(Keys.RIGHT);
		Playbtn.sendKeys(Keys.RIGHT);
		
		
	}

}
