package Mock;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.edge.EdgeDriver;

public class Task3 {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.olivegarden.com/");
		
		Dimension size=driver.manage().window().getSize();
		System.out.println(size);
		
		driver.manage().window().setSize(new Dimension(500, 500));
		
		Thread.sleep(3000);
		driver.close();
	}

}
