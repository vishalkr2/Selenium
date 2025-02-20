package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseCloseMethod {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://stackoverflow.com/questions/41894087/selenium-chromedriver-c-sharp-how-to-send-a-shortcut-browser");
		
		Thread.sleep(3000);
		driver.close();//Not close the server
		//driver.quit();//stop the server
		
		
		
		
	}
	

}
