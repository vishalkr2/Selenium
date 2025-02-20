package Assignment;

import org.openqa.selenium.edge.EdgeDriver;

public class ToCaptureUrl {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://online.kfc.co.in/");
		String title=driver.getTitle();
		String Url=driver.getCurrentUrl();
		System.out.println(title + " "+Url);
	}

}
