package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.edge.EdgeDriver;
public class CssSelector {
	public static void main(String[] args) throws Exception{

	

		
				EdgeDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
				
				
				driver.get("https://demowebshop.tricentis.com/");
				Thread.sleep(4000);
				
				
				
				driver.findElement(By.linkText("Register")).click();
				Thread.sleep(2000);
				String title=driver.getTitle();
				
				driver.findElement(By.cssSelector("input[id='fullName']")).sendKeys("Arjun Kumar");
		        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("arjun.kumar@example.com");
		        driver.findElement(By.cssSelector("input[type='password'][name='password']")).sendKeys("SecurePassword123");
		        driver.findElement(By.cssSelector("input[id='confirmPassword']")).sendKeys("SecurePassword123");
		        driver.findElement(By.cssSelector("input[type='radio'][value='male']")).click();
		        driver.findElement(By.cssSelector("button[type='submit']")).click();
				
			
				WebElement successMessage = driver.findElement(By.className("result"));
		        if (successMessage.getText().contains("Your registration completed")) {
		            System.out.println("Registration was successful!");
		        } else {
		            System.out.println("Registration failed or success message not found.");
		        }
				
				
				
				
			}


	}
