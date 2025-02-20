package webelement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsDisableOrIsEnableMethod {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		
		if(element.isDisplayed()) {
			
			System.out.println("Yes it is Dislayed "+ element.getText());
		}
		System.out.println(element.isDisplayed());
		System.out.println(element.isEnabled());
		
		
		System.out.println("__________________________________________________________________________");
		
		
		System.out.println("--After Entering Data---");
		
		driver.findElement(By.name("username")).sendKeys("Test123@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Test@1245");
		//
		System.out.println(element.isEnabled());
		element.click();
		System.out.println(element.isSelected());
		System.out.println(element.isDisplayed());
		
		
		
		
		
	}
	
	

}
