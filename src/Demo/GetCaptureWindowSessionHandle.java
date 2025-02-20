package Demo;

import org.openqa.selenium.edge.EdgeDriver;

public class GetCaptureWindowSessionHandle {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		String id=driver.getWindowHandle();
		//System.out.println(id);//F7CF6EA0E188F5BDFDAA246ACE76CEB1 (32 alphanumerical values ener).get("https://www.instagram.com/");
		driver.get("https://www.instagram.com/");
		System.out.println(id);
		driver.get("https://www.instagram.com/");
		System.out.println(id);
		
	}

}
