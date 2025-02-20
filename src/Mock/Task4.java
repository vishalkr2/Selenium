package Mock;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

public class Task4 {
	public static void main(String[] args) throws Exception {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.barbequenation.com/");
		String Sessionid=driver.getWindowHandle();
		
		String Url=driver.getCurrentUrl();
		Dimension size=driver.manage().window().getSize();
		Point position = driver.manage().window().getPosition();
			
		
		System.out.println("1.id "+Sessionid+ " 2.Size Window "+size+" 3.Postion Window "+ position);
//		System.out.println(size);
//		System.out.println(position);
	Thread.sleep(3000);
		
		driver.quit();
		
	
	}

}
