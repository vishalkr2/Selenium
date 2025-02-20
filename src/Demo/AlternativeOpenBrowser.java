package Demo;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.edge.EdgeDriver;

public class AlternativeOpenBrowser {
	//@SuppressWarnings("deprecation") 
	public static void main(String[] args) throws MalformedURLException {
		EdgeDriver driver=new EdgeDriver();
		
		//driver.navigate().to("https://www.flipkart.com/");
		driver.get("https://www.google.com/");
		driver.get("https://www.flipkart.com/");
		//driver.navigate().to(new URL("https://www.flipkart.com/"));
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
	}

}
