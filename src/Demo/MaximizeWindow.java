package Demo;




import org.openqa.selenium.edge.EdgeDriver;

public class MaximizeWindow {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.booking.com/");
		
		//Thread.sleep(3000);
//		Options op=driver.manage();
//		Window max = op.window();
//				
//		max.maximize();
//		Window mini=op.window();
//		mini.minimize();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
		
		
	}

}
