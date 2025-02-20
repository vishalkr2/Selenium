package Demo;

import org.openqa.selenium.edge.EdgeDriver;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.californiaburrito.in/");
		
		
		
		String Url=driver.getCurrentUrl();
		
	
		Thread.sleep(3000);
		System.out.println(Url);
		driver.close();
		
	}

}
