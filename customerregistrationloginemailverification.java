package macrosclientreq;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class customerregistrationloginemailverification
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
@Test(priority=1,description="email verification")

	public void registerAndVerifyUser() 
	{
        // Navigate to registration page
        driver.findElement(By.xpath("//*[@id=\"main_nav\"]/div[1]/div/a[1]")).click();
        
        customerbuttonclick(driver);
        
        driver.findElement(By.name("name")).sendKeys("Rahul");
        
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.clear();
        emailInput.sendKeys("qaqcgmiii@gmail.com");
        
        WebElement password=driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("12345678");
        
        WebElement passwordconfirm=driver.findElement(By.name("password_confirmation"));
        passwordconfirm.clear();
        passwordconfirm.sendKeys("12345678");
        
        
        
        // Submit the form
        clicksubmit(driver);
        
        
        // Simulate checking email for verification link and clicking on it
        // Example: Assuming verification link is sent to a test email account
        // You would need code to check the email and extract the verification link
        
        // Assert that email verification was successful
        // Example assertion (you would need to implement the verification logic)
    
    }

    
 
        public static void clicksubmit(WebDriver driver) 
        {
        	WebElement signUpButton = driver.findElement(By.xpath("//button[@class='custom-button py-2 rounded-pill get_appointment w-100 mt-4' and text()='Sign Up']"));
            
            // Click the button
            signUpButton.click();
            
        }
        public static void customerbuttonclick(WebDriver driver)
        {
        	WebElement customer = driver.findElement(By.xpath("/html/body/section[2]/div/div[3]/div/div[2]/a"));
            customer.click();
        }
      
        }



