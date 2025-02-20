package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToCaptureSourceCode  {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.google.com/");
		String a=driver.getPageSource();
		System.out.println(a);
		Thread.sleep(5000);
		//driver.close();
		driver.quit();
	}

}
