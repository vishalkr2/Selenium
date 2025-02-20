package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class getCssValueMethod {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");

		Thread.sleep(2000);

		WebElement TryFreeElement=driver.findElement(By.linkText("Try actiTIME for Free"));
		//System.out.println(value);
		System.out.println(TryFreeElement.getCssValue("border-radius"));
		System.out.println(TryFreeElement.getCssValue("font-size"));
		System.out.println(TryFreeElement.getCssValue("background-color"));
		System.out.println(TryFreeElement.getCssValue("font-family"));


		driver.quit();


	}

}
