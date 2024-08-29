package macrosclientreq;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class vendoregistrationloginemailverification 
{
ChromeDriver driver= new ChromeDriver();
	
	@BeforeTest
	public void setup() throws Exception
	{
		String url="https://phplaravel-1252460-4564107.cloudwaysapps.com/";
		driver.get(url);
		
		driver.manage().window().maximize();
		 System.out.println("Launching Google Chrome browser");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
       
	}
	
	 public static void clicksubmit(WebDriver driver) 
     {
     	WebElement signUpButton = driver.findElement(By.xpath("//button[@class='custom-button py-2 rounded-pill get_appointment w-100 mt-4' and text()='Sign Up']"));
         
         // Click the button
         signUpButton.click();
         
     }
     public static void imgupload(WebDriver driver) throws Exception
     {
         //WebElement fileInput = driver.findElement(By.xpath("/html/body/section[2]/div/form/div[2]/div[7]/div[1]/div/div/div[2]/i"));
    	 WebElement fileInput=driver.findElement(By.xpath("/html/body/section[2]/div/form/div[2]/div[7]/div[1]/div/div/input"));
         //fileInput.click();
         fileInput.sendKeys("/Users/Shubbak/Downloads/alshaytest.png");
          WebElement fileinput2=driver.findElement(By.xpath("/html/body/section[2]/div/form/div[2]/div[7]/div[2]/div/div/input"));
          fileinput2.sendKeys("/Users/Shubbak/Downloads/alshaytest.png");        
     }
    public static void nextbutton(WebDriver driver)
    {
    	 WebElement button = driver.findElement(By.cssSelector(".btn.btn-primary.next-step.rounded-2.my-3"));
    	 

        button.click();
     }
     public static void customerbuttonclick(WebDriver driver)
     {
     	WebElement customer = driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div/div[2]/a"));
         customer.click();
     }
     public static void loginbutton(WebDriver driver)
     {
     	 WebElement loginButton = driver.findElement(By.xpath("//button[@class='custom-button py-2 rounded-pill get_appointment w-100' and text()='Login']"));
          
          loginButton.click();
     }
    @Test(priority=1,description="email verification")

	public void registerAndVerifyUser() throws Exception 
	{
	driver.findElement(By.xpath("//*[@id=\"main_nav\"]/div[1]/div/a[1]")).click();
	WebElement vendorLink = driver.findElement(By.xpath("//a[@class='custom-button py-2 px-4 rounded-pill' and @href='https://phplaravel-1252460-4564107.cloudwaysapps.com/vendor/register']"));
    
    // Click the anchor element
    vendorLink.click();
    driver.findElement(By.name("garage_name")).sendKeys("Testinggarageemail");
    driver.findElement(By.name("name")).sendKeys("Greeshma Dileep Kumar");
    driver.findElement(By.id("inputEmail")).sendKeys("greeshmadilip20@gmail.com");
    WebElement inputField = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
    
    
    inputField.sendKeys("Extended Warranty"); 

    inputField.sendKeys(Keys.ENTER);

    imgupload(driver);
    driver.findElement(By.name("trading_license")).sendKeys("123456789");
    Thread.sleep(2000);
    nextbutton(driver);
//    driver.executeScript("arguments[0].click();", button);
//    button.click();
    
    WebElement nextpage=driver.findElement(By.xpath("/html/body/section[2]/div/form/div[3]/div[2]/div[1]/input"));
    nextpage.sendKeys("12345678");
    driver.executeScript("arguments[0].click();", nextpage);
    
    driver.findElement(By.name("billing_area")).sendKeys("Dubai");
    Select objSelect =new Select(driver.findElement(By.name("city")));
    objSelect.selectByVisibleText("Dubai");
    driver.findElement(By.xpath("/html/body/section[2]/div/form/div[3]/div[4]/input")).sendKeys("Sharjah");
    driver.findElement(By.xpath("/html/body/section[2]/div/form/div[3]/div[5]/div[1]/input")).sendKeys("Al nahda");
    driver.findElement(By.name("appointment_number")).sendKeys("+971561662476");
    WebElement password=driver.findElement(By.name("password"));
    password.clear();
    password.sendKeys("12345678");
    WebElement confirmpassword=driver.findElement(By.name("conform_password"));
    confirmpassword.clear();
    confirmpassword.sendKeys("12345678");
    driver.findElement(By.cssSelector("flex-grow-1 flex-wrap btn btn-primary get_appointment")).click();
     }
   


}
