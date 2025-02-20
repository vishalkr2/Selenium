package Mock;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.edge.EdgeDriver;

public class Task5 {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
	
	EdgeDriver driver=new EdgeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.giallozafferano.it/");
	 driver.navigate().to(new URL("https://www.giallozafferano.it"));
	 driver.navigate().back();
	 Thread.sleep(3000);
	 driver.navigate().forward();
	 Thread.sleep(3000);
	 driver.navigate().refresh();
	 Thread.sleep(3000);
	 driver.quit();

}
}