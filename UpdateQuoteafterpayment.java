package macrosclientreq;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UpdateQuoteafterpayment 
{
	private WebDriver driver;
	public UpdateQuoteafterpayment(WebDriver driver) 
	{
        this.driver = driver;
    }
	 public void carimgupload() throws Exception {
	        WebElement fileInput = driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/div[2]/div/div/div/form/div/div[2]/div/div[1]/div/div/input"));
	        fileInput.sendKeys("/Users/Shubbak/Downloads/alshaytest.png");
	    }
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

   
    @Test
    public void UpdateQuoteafterpay() throws Exception 
    {
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/input[3]")).sendKeys("KL5688");
    driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/input")).sendKeys("345678");
    driver.findElement(By.name("color")).sendKeys("Red");
    driver.findElement(By.name("mileage")).sendKeys("2000");
    driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[5]/textarea")).sendKeys("Requesting a quote for testing a scenario based on uniformity on id");
    driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/div[2]/div/div/div/form/div/div[1]/div/div[6]/div/button")).click();
    carimgupload();
    driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/div[2]/div/div/div/form/div/div[2]/div/div[2]/div/button")).click();
    accidentreport();
    driver.findElement(By.xpath("//*[@id=\"inspectionReport\"]/div/div[2]/textarea")).sendKeys("Special Report");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"inspectionReport\"]/div/div[3]/div/button")).click();
    registrationcopyimage();
    WebElement country=driver.findElement(By.xpath("//*[@id=\"address\"]"));
  country.sendKeys("Dubai");
  country.sendKeys(Keys.DOWN);
  country.sendKeys(Keys.ENTER);
  //driver.findElement(By.xpath("//*[@id=\"fourthtab\"]/div/div[2]/div[2]/div/div/button")).click();
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  WebElement submitButton= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"fourthtab\"]/div/div[2]/div[2]/div/div/button")));
  submitButton.click();
  driver.navigate().refresh();
  driver.findElement(By.xpath("/html/body/div/div[2]/nav/div[3]/button")).click();
  Thread.sleep(2000);
    }
    }
