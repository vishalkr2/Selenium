import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WorkingWithEdge {

    EdgeDriver driver;
    String url = "https://demo.guru99.com/";

    public void setupBrowser() {
        // Set the correct path to msedgedriver.exe, NOT msedge.exe
        System.setProperty("webdriver.edge.driver", "\"C:\\Users\\sumit\\AppData\\Roaming\\fire-flink-client\\localnode\\msedgedriver.exe\"");

        EdgeOptions options = new EdgeOptions();
        options.addArguments("--no-sandbox");
        driver = new EdgeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void getTitle() {
        String pageTitle = driver.getTitle();
        System.out.println("Title of web page: " + pageTitle);
    }

    public void close() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    public static void main(String[] args) {
        WorkingWithEdge edge = new WorkingWithEdge();
        edge.setupBrowser();
        edge.getTitle();
        edge.close();
    }
}
