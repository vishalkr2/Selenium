package Mock;

import org.openqa.selenium.edge.EdgeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException{
		
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kalkifashion.com/in");
		
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.close();
		
	}

}
