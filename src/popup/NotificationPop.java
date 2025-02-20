package popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class NotificationPop {
		public static void main(String[] args) {
			
			EdgeOptions setting=new EdgeOptions();
			
			//setting.addArguments("--incognito");//to use chrome
			setting.addArguments("--disable-notifications");//use chrome
		
			WebDriver driver=new EdgeDriver(setting);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			
			driver.get("https://in.best-jobs-online.com/");
	
	}

}
