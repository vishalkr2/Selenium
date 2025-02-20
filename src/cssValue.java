import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class cssValue {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement elem = driver.findElement(By.xpath("//button[text()='Sign in']"));
		
		System.out.println(elem.getCssValue("margin")+" Width "+ elem.getCssValue("width"));
		WebElement elem2=driver.findElement(By.linkText("forgot password?"));
		String tagname=elem2.getTagName();
		System.out.println(elem2.getTagName());
		System.out.println(tagname);
		
		Point elem3=driver.findElement(By.linkText("forgot password?")).getLocation();
		
		System.out.println(elem3.getX());
		System.out.println(elem3.getY());
		
		
		
		
		
		
		
		
		
	}



}
