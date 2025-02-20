package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();
		//driver.manage().wait()
		
		driver.get("https://www.freshersworld.com/");
		Thread.sleep(2000);
//		element.click();
//		long endtime=System.currentTimeMillis();
//		long time=endtime-starttime;

              long startTime = System.currentTimeMillis();
            System.out.println("Waiting for element... Start time: " + startTime);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80
            		));

            // Wait for the element to be visible
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iz-optin-wp-btn1Txt")));
            element.click();
            // Log end time
            long endTime = System.currentTimeMillis();
            System.out.println("Element displayed! End time: " + endTime);
            
		driver.findElement(By.id("reg_new_btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstname")).sendKeys("Arav");
		
		driver.findElement(By.id("lastname")).sendKeys("Kumar");
		driver.findElement(By.id("email")).sendKeys("Kumar123Arav@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Kumar@123");
		driver.findElement(By.id("mobile")).sendKeys("9988776655");
		//driver.findElement(By.xpath("//span[@id='select2-currentCity-container' and @title='presentation']")).
	WebElement city = driver.findElement(By.id("currentCity"));
	
		Select select=new Select(city) ;
		
		select.selectByVisibleText(" Bangalore ");
		WebElement dropcourse = driver.findElement(By.id("course"));
		
	     Select select2=new Select(dropcourse);
	     Thread.sleep(2000);
	     select2.selectByVisibleText("BCA");
	     

		
		
		
		
		
	}
}
