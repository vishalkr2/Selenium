package Dropdown;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectDowpdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		
		WebElement dropday = driver.findElement(By.id("day"));
		WebElement dropmonth = driver.findElement(By.id("month"));
		WebElement dropyear = driver.findElement(By.id("year"));
		
		
		
		Select day=new Select(dropday);
		Select month=new Select(dropmonth);
		Select year=new Select(dropyear);
		
		day.selectByIndex(15);
		month.selectByValue("2");
		year.selectByVisibleText("2004");
		
		
		//isMultiple
		System.out.println(day.isMultiple());
		System.out.println(month.isMultiple());
		System.out.println(year.isMultiple());
		System.out.println("--------------------------");
		
		
		List<WebElement> listDay = day.getOptions();
		for (WebElement webElement : listDay) {
			System.out.println(webElement.getText());
			
		}
		System.out.println("-------------------------------");
	List<WebElement> listmonth=month.getOptions();
	for (WebElement m: listmonth) {
		System.out.println(m.getText());
		Thread.sleep(3000);
		
		
		
	}
	System.out.println("------------------------------------");
	List<WebElement> y = year.getOptions();
	
	for (WebElement ListYear : y) {
		System.out.println(ListYear.getText());
		Thread.sleep(3000);
		
		
	}

		
		
		
		
		
				
		
		
		
	}

}
