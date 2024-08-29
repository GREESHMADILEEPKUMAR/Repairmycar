package macrosclientreq;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Insurancecompanyregistration 
{
ChromeDriver driver= new ChromeDriver();
private WebDriverWait wait;
	
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
         
         
         signUpButton.click();
         
     }
     public static void imgupload(WebDriver driver) throws Exception
     {
      
    	 WebElement fileInput=driver.findElement(By.xpath("/html/body/section[2]/div/form/div[2]/div[5]/div/div/div/input"));
        
         fileInput.sendKeys("/Users/Shubbak/Downloads/alshaytest.png");        
     }
  

      public static void loginbutton(WebDriver driver)
      {
      	 WebElement loginButton = driver.findElement(By.xpath("//button[@class='custom-button py-2 rounded-pill get_appointment w-100' and text()='Login']"));
           
           loginButton.click();
      }
     @Test(priority=1)

 	public void registerAndVerifyUser() throws Exception 
 	{
 	driver.findElement(By.xpath("//*[@id=\"main_nav\"]/div[1]/div/a[1]")).click();
 	WebElement vendorLink = driver.findElement(By.xpath("/html/body/section[2]/div/div[3]/div/div[2]/a"));
     
     // Click the anchor element
     vendorLink.click();
     driver.findElement(By.id("inputName")).sendKeys("Insurancecompany");
     driver.findElement(By.name("company_name")).sendKeys("Test Insurance");
     driver.findElement(By.name("email")).sendKeys("greeshmadilip20@gmail.com");
     imgupload(driver);
     driver.findElement(By.name("trading_license")).sendKeys("1234454465");
     
     
     
     WebElement nextpage=driver.findElement(By.cssSelector("#multi-step-form > div.step.step-1 > button"));
     nextpage.sendKeys("12345678");
     driver.executeScript("arguments[0].click();", nextpage);
     driver.findElement(By.name("post_box")).sendKeys("1234");
     driver.findElement(By.name("billing_area")).sendKeys("dubai");
     Select objSelect =new Select(driver.findElement(By.name("city")));
     objSelect.selectByVisibleText("Dubai");
     driver.findElement(By.xpath("/html/body/section[2]/div/form/div[3]/div[4]/input")).sendKeys("Sharjah");
     WebElement inputField=driver.findElement(By.xpath("/html/body/section[2]/div/form/div[3]/div[5]/div[1]/input"));
     inputField.sendKeys("Al nahda");

     // Wait until suggestions are visible (you might need to adjust the locator based on the actual suggestion list)
     WebElement suggestionList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".suggestion-class")));

     // Find and click the desired suggestion
     // Adjust the locator strategy and value based on the actual suggestion list
     WebElement suggestion = driver.findElement(By.xpath("//div[@class='suggestion-class']/div[text()='New York']"));
     suggestion.click();
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
    

