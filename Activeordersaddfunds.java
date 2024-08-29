package macrosclientreq;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activeordersaddfunds 
{
	private WebDriver driver;
	private VendorLoginHelper Vendorloginhelper;
	 WebDriverWait wait;

    public Activeordersaddfunds(WebDriver driver) 
    {
        this.driver = driver;
    }
//    @BeforeTest
//    public void test()
//    {
//    	driver = new ChromeDriver();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//    	Vendorloginhelper = new VendorLoginHelper(driver); 
//    	driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://mycarsrepair.com/car_service");
//        System.out.println("Launching Google Chrome browser");
//    }
//    @Test(priority=1)
//    public void vendorLoginTest() 
//    {
//    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//    	Vendorloginhelper.login();
//    }

    @Test
    public void addextrafunds() throws Exception 
    {
driver.findElement(By.xpath("/html/body/div/div[3]/section/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/a")).click();
Thread.sleep(2000);

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[8]/div[1]/a")));


Actions actions = new Actions(driver);

actions.moveToElement(submitButton).click().perform();

driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[1]/div/div[1]/input")).sendKeys("particular");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[1]/div/div[2]/div/input")).sendKeys("1");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[1]/div/div[3]/input")).sendKeys("100");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[2]/div/div[1]/input")).sendKeys("sparedetails");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[2]/div/div[2]/div/input")).sendKeys("1");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[2]/div/div[3]/input")).sendKeys("100");
Thread.sleep(2000);
driver.findElement(By.name("time")).sendKeys("2"); 
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"floatingTextarea2\"]")).sendKeys("Testing add funds");
Thread.sleep(2000);
WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement submitButton1 = wait1.until(ExpectedConditions.elementToBeClickable(By.id("btnSubmit")));


Actions actions1 = new Actions(driver);

actions1.moveToElement(submitButton1).click().perform();
driver.navigate().back();
    }
@Test
public void chngestatus() throws Exception 
{

	WebElement Jobstatus = driver.findElement(By.name("job_status"));
    Select brand = new Select(Jobstatus);
    brand.selectByVisibleText("Inspected");
    Thread.sleep(3000);
    //driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
    WebElement triggerButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")); // Replace with the actual button ID
    triggerButton.click();

    
    Alert alert = driver.switchTo().alert();

    
    String alertText = alert.getText();
    System.out.println("Alert text: " + alertText);

    // Click "OK" on the alert
    alert.accept();
    Thread.sleep(3000); // Replace with WebDriverWait for a more robust solution

//    // Locate the toast notification
//    WebElement toastNotification = driver.findElement(By.className("toast-message")); // Replace with the actual class name or selector
//
//    // Verify that the toast notification is displayed
//    Assert.assertTrue(toastNotification.isDisplayed(), "Toast notification is not displayed");
//
//    // Verify the content of the toast notification
//    String expectedMessage = "Success! Your action was completed."; // Replace with the expected message
//    String actualMessage = toastNotification.getText();
//    Assert.assertEquals(actualMessage, expectedMessage, "Toast notification message is incorrect");

 }
    }
