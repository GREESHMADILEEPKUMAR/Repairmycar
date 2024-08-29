package macrosclientreq;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MYCARSREPAIRJOURNEY 
{
	private ChromeDriver driver;
    private CustomerLoginHelper loginHelper;
    private VendorLoginHelper Vendorloginhelper;
    private SendingQuotation Quotesendinghelper;
    private Custmakingpayment paymentforquotation;
    private UpdateQuoteafterpayment updatedquote;
    private Activeordersaddfunds addfunds;

    
    WebDriverWait wait;
    

    @BeforeTest
    public void setup() 
    {
    	driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        loginHelper = new CustomerLoginHelper(driver);
        Vendorloginhelper = new VendorLoginHelper(driver); 
        Quotesendinghelper=new SendingQuotation(driver);
        paymentforquotation=new Custmakingpayment(driver);
        updatedquote=new UpdateQuoteafterpayment(driver);
        addfunds=new Activeordersaddfunds(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mycarsrepair.com/car_service");
        System.out.println("Launching Google Chrome browser");
    }

    public void loginbutton() {
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='custom-button py-2 rounded-pill get_appointment w-100' and text()='Login']"));
        loginButton.click();
    }

    public void customerbuttonclick() {
        WebElement customer = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div[2]/a"));
        customer.click();
    }

    public void nextbutton() {
        try {
            WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn.btn-secondary.block.get_appointment.next-tab-btn")));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", button);
            WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(button));
            clickableButton.click();
        } catch (TimeoutException e) {
            System.out.println("Failed to find or click the button within the timeout period.");
            e.printStackTrace();
        }
    }

   ///////////
public void accidentreport()throws Exception
{
	WebElement inspectionreportupload=driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/div[2]/div/div/div/form/div/div[3]/div/div[1]/div/div/input"));
	inspectionreportupload.sendKeys("/Users/Shubbak/Downloads/alshaytest.png");
	
}
public void registrationcopyimage()
{
	WebElement regcopy=driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/div[2]/div/div/div/form/div/div[4]/div/div[1]/div/div/input"));
	regcopy.sendKeys("/Users/Shubbak/Downloads/alshaytest.png");
}
    @Test(priority=1)
    public void customerLoginTest() 
    {

        loginHelper.login();

    }
  //start of quote request page1
    @Test(priority=2)
    public void requestingquote() throws Exception {
        driver.findElement(By.xpath("//*[@id='dashboardSidebarRightContent']/nav[1]/div[1]/ul/li[2]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("phone")).sendKeys("+971561662476");
        Thread.sleep(3000);

        WebElement selectElement = driver.findElement(By.id("lookingFor"));
        Select dropdown = new Select(selectElement);
        dropdown.selectByVisibleText("I have Inspection Report & Looking for the Quotation");
        Thread.sleep(3000);

        WebElement brandelement = driver.findElement(By.id("company"));
        Select brand = new Select(brandelement);
        brand.selectByVisibleText("Toyota");
        Thread.sleep(3000);

        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id='car_model']/select"));
        Select dropdown1 = new Select(dropdownElement);
        try {
            dropdown1.selectByIndex(2);
        } catch (StaleElementReferenceException e) {
            dropdownElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='car_model']/select")));
            dropdown1 = new Select(dropdownElement);
            dropdown1.selectByIndex(2);
        } catch (TimeoutException e) {
            System.out.println("The element was not found within the specified timeout.");
            e.printStackTrace();
        }
        Thread.sleep(3000);
        WebElement yearmodel = driver.findElement(By.name("model_year_id"));
        Select year = new Select(yearmodel);
        year.selectByVisibleText("2010");
        Thread.sleep(3000);
       
        driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[8]/input")).sendKeys("D45677");
        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.select2-search__field")));
        searchInput.click();
        searchInput.sendKeys("Extended warranty");
        searchInput.sendKeys(Keys.ENTER);
        
        
        WebElement garage = driver.findElement(By.name("qoute_range"));

        Select garageselect = new Select(garage);
       
        garageselect.selectByVisibleText("All");
        
        //end of quote request page1
        nextbutton();

        // Page 2
        //carimgupload();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/div[2]/div/div/div/form/div/div[2]/div/div[2]/div/button")).click();
        accidentreport();
        driver.findElement(By.xpath("//*[@id=\"inspectionReport\"]/div/div[2]/textarea")).sendKeys("Special Report");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"inspectionReport\"]/div/div[3]/div/button")).click();
        registrationcopyimage();
;
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       
        
        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sety\"]")));
        submit.click();
       //log out
        driver.navigate().refresh();
        driver.findElement(By.xpath("/html/body/div/div[2]/nav/div[3]/button")).click();
        Thread.sleep(3000);
    }
    @Test(priority=3)
    public void vendorLoginTest() 
    {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    	Vendorloginhelper.login();

    }
    @Test(priority=4)
    public void Qutotaion() throws Exception 
    {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    	 Quotesendinghelper.viewDetail();

    }
    //customer login again
    @Test(priority=5)
    
   public void customerloginforpayment()
    	{
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            loginHelper.login();
        }	
    @Test(priority=6)
    public void customeronpayment() throws Exception
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    	paymentforquotation.acceptquoteandpay();
    	
    }
    @Test(priority=7)
    public void updatingquote() throws Exception
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	updatedquote.UpdateQuoteafterpay();
    	
    }
    @Test(priority=8)
    public void vendorLoginTestafterpayment() throws Exception 
    {
    	Thread.sleep(3000);
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    	Vendorloginhelper.login();

    }
    @Test(priority=9)
    public void extrafunds() throws Exception
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    	addfunds.addextrafunds();

    }
    
       

    
    @AfterTest
    public void teardown()
    {
    	
    	driver.quit();
    }
    
}
