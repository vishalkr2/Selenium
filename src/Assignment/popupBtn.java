package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.SessionId;

public class popupBtn {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(13000);
		driver.findElement(By.id("loginclose1")).click();
		SessionId s = driver.getSessionId();
		System.out.println(s);
		String d = driver.getWindowHandle();
		System.out.println(d);
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}

}
