package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopup {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		
		driver.switchTo().frame("login_page");
		
		driver.findElement(By.linkText("CONTINUE")).click();
		
		Alert alertOK = driver.switchTo().alert();
		
		System.out.println(alertOK.getText());
		
		alertOK.accept();
		
		//also use Dismiss method for OK button
		
	}
}
