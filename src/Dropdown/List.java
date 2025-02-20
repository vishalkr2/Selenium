package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class List {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.get("https://demoapp.skillrary.com/");
		
		
		WebElement ListBox = driver.findElement(By.id("cars"));
		
		
		Select b=new Select(ListBox);
		
		b.selectByIndex(0);
		
		b.selectByIndex(3);
		System.out.println(b.getAllSelectedOptions());
		
		
		//Thread.sleep()
		
	}

}
