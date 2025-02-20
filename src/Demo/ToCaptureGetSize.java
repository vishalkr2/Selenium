package Demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;

public class ToCaptureGetSize {
	public static void main(String[] args) {
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Dimension sizeof = driver.manage().window().getSize();
	System.out.println(sizeof);
	System.out.println(sizeof.getHeight());
	System.out.println(sizeof.getWidth());
	driver.manage().window().minimize();
	System.out.println(sizeof.getHeight());
	System.out.println(sizeof.getWidth());
	driver.close();
	
	
	
	
}
}

