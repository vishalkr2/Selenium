package Demo;



import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

public class GetandSetPosition {
	public static void main(String[] args) {
			EdgeDriver driver=new EdgeDriver();
			driver.get("https://www.flipkart.com/");
			//driver.manage().window().maximize();
			Point postitionsize=driver.manage().window().getPosition();
			System.out.println(postitionsize);
			System.out.println(postitionsize.getX());
			
			//Dimension postitionsizeSet=driver.manage().window().setPosition();
			Point p=new Point(30, 30);
			driver.manage().window().setPosition(p);
			driver.manage().window().setPosition(new Point(150,180));
			driver.quit();
			
	}

}
