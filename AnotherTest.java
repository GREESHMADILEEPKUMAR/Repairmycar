package macrosclientreq;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnotherTest 
{
    ChromeDriver driver;
    WebDriverWait wait;
    CustomerLoginHelper loginHelper;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        loginHelper = new CustomerLoginHelper(driver);
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://phplaravel-1252460-4564107.cloudwaysapps.com/");
        System.out.println("Launching Google Chrome browser");
    }

    @Test
    public void someTest() {
        loginHelper.login();
        // Add additional test logic here
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
