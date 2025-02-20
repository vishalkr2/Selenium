package Demo;




import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;

public class SetSizeBrowser {
	public static void main(String[] args) {
			EdgeDriver driver=new EdgeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			
			//To set Size
			Dimension size=new Dimension(500,800);
			driver.manage().window().setSize(size);
			driver.manage().window().setSize(new Dimension(0, 0));
			
	}

}
