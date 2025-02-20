package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadpopup {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://www.naukri.com/registration/createAccount");
		
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		
		 driver.findElement(By.xpath("//input[@id='resumeUpload']")).sendKeys("C:\\Users\\sumit\\Downloads\\AICTE_Internship_2024_Project_Report_Template_2 (1).docx");
		//we can work to upload the file to using path so we can use input 
		
		
		
		
	}

}
