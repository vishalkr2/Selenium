package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(3000);
		for(;;) {

			try {
				driver.findElement(By.id("loginclose1")).click();
				break;
			}catch (Exception e) {
				Thread.sleep(3000);
			}

			driver.findElement(By.linkText("Sofas")).click();

			
				driver.findElement(By.xpath("//img[@alt='Berlin 3 Seater Sofa (Velvet, Indigo Blue)']")).click();
				WebElement cart = driver.findElement(By.xpath("//a[@id='button-cart-buy-now']"));
				cart.click();
				for(;;) {

					try {
						driver.findElement(By.id("loginclose1")).click();
						break;
					}catch (Exception e) {
						Thread.sleep(3000);
					}
				}
				Thread.sleep(2000);
				driver.navigate().back();
				//driver.navigate().back();
				driver.findElement(By.xpath("//img[@alt='Henry 3 Seater Sofa (Velvet, Indigo Blue)']")).click();
				cart.click();
				Thread.sleep(2000);
				driver.navigate().back();
				driver.navigate().back();
				driver.findElement(By.xpath("//img[@alt='Oxford 3 Seater Fabric Sofa']")).click();
				cart.click();





			}

		}

	}
