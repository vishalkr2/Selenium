package MulipleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookLogoDisplay {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com/");
		
		WebElement display = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		if(display.isDisplayed()) {
		System.out.println("Facebook logo is displayed "+display.getText());
	}
		else {
			System.out.println("Facebook logo is not displayed "+display.getText());
		}
		
		driver.quit();

}}
