package Demo;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.edge.EdgeDriver;

import graphql.relay.Edge;

public class UseNavigate {
	public static void main(String[] args) throws Exception{
		EdgeDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		
		Navigation navbar=driver.navigate();
		navbar.back();
		Thread.sleep(2000);
	
		navbar.forward();
		Thread.sleep(2000);
		navbar.refresh();
		
		
	}

}
