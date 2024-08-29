package macrosclientreq;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Vendorsendingquote {
    
    private ChromeDriver driver;
    private VendorLoginHelper vendorLoginHelper;

    @BeforeTest
    public void setup() {
        // Initialize WebDriver
        driver = new ChromeDriver();
        new WebDriverWait(driver, Duration.ofSeconds(20));
        vendorLoginHelper = new VendorLoginHelper(driver);

        // Open the URL
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://phplaravel-1252460-4564107.cloudwaysapps.com/");
        System.out.println("Launching Google Chrome browser");
    }

    @Test(priority = 1)
    public void testVendorLogin() {
        vendorLoginHelper.login();
    }

    @Test(priority = 2, description = "sendingquote")
    public void viewDetail() {
        // Perform actions after login
        driver.findElement(By.xpath("/html/body/div/div[2]/nav/div[3]/a[3]")).click();
        driver.findElement(By.xpath("/html/body/div/div[3]/section/div/div[2]/div[1]/div/div[2]/div[3]/div/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[1]/div/div[1]/input")).sendKeys("Oil change");
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[1]/div/div[2]/div/input")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[1]/div/div[3]/input")).sendKeys("100");
        
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[2]/div/div[1]/input")).sendKeys("Human Labour");
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[2]/div/div[2]/div/input")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[2]/div/div[3]/input")).sendKeys("100");
        
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[3]/div/div[1]/input")).sendKeys("Axles");
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[3]/div/div[2]/div/input")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[3]/div/div[3]/input")).sendKeys("100");
        
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[4]/div/div[1]/input")).sendKeys("polish & paint");
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[4]/div/div[2]/div/input")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[4]/div/div[3]/input")).sendKeys("100");
        
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[5]/div/div[1]/input")).sendKeys("Bumper replacement");
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[5]/div/div[2]/div/input")).sendKeys("2");
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[5]/div/div[3]/input")).sendKeys("100");
        
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[6]/div/div[1]/input")).sendKeys("inspection report");
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[6]/div/div[2]/div/input")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[6]/div/div[3]/input")).sendKeys("100");
        
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[7]/div/div[1]/input")).sendKeys("Wash");
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[7]/div/div[2]/div/input")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[7]/div/div[3]/input")).sendKeys("100");
        
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[8]/div[5]/input")).sendKeys("7");
        driver.findElement(By.xpath("//*[@id=\"floatingTextarea2\"]")).sendKeys("This is a quote request for testing purpose");
    
        // Uncomment this line if you need to submit the form}
         driver.findElement(By.id("btnSubmit"));
    }
}
    
