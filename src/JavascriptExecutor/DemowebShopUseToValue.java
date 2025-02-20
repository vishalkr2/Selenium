package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DemowebShopUseToValue {

	public static void main(String[] args) {


		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

		driver.get("https://demowebshop.tricentis.com/register");

		driver.findElement(By.id("gender-male")).click();
		WebElement Fname=driver.findElement(By.id("FirstName"));
		WebElement Lname=driver.findElement(By.id("LastName"));
		WebElement email=driver.findElement(By.id("Email"));
		WebElement pass=driver.findElement(By.id("Password"));
		WebElement passcon=driver.findElement(By.id("ConfirmPassword"));


		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='sukesh'", Fname);
		js.executeScript("arguments[0].value='Kr'", Lname);
		js.executeScript("arguments[0].value='Kr123@gmail.com'", email);
		js.executeScript("arguments[0].value='Kr@123'", pass);
		js.executeScript("arguments[0].value='Kr@123'", passcon);





	}
}