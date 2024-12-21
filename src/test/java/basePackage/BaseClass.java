package basePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
    public static WebDriver driver;
    public static Properties prop;

    //FirstPageObjectClass firstPageObject;
    //OTPPageObjectCLass otpPageObject;
    //LastPageObjectClass lasPageObject;

    // Method to initialize the driver
    @BeforeTest
    @Parameters({"browser"})
    public static void initializeDriver(String br) {
    	
    	try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Users\\Madhur\\eclipse-workspace\\Websites.co.in\\src\\test\\resources\\config.properties");
            prop.load(fis);
        } catch (IOException e) {
            System.out.println("Error loading configuration file: " + e.getMessage());
        }
    	
        //String br = prop.getProperty("browser").toLowerCase();

        switch (br.toLowerCase()) {
            case "chrome": driver = new ChromeDriver();
            break;
            case "firefox": driver = new FirefoxDriver();
            break;
            case "edge": driver = new EdgeDriver();
            break;
            default:
            System.out.println("Browser not supported!");
            return;   
        }
        // Basic driver configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(prop.getProperty("url")); // Navigate to the base URL
    }

    // Method to quit the driver
    
    //@AfterTest
    //public static void quitDriver() throws InterruptedException {
    	//Thread.sleep(10000);
        //if (driver != null) {
            //driver.quit();
        //}
    //}
    
    @AfterMethod
    public void pauseBetweenTests() throws InterruptedException {
        System.out.println("Pausing before the next test...");
        Thread.sleep(4000); // Pause for 5 seconds
    }
}
