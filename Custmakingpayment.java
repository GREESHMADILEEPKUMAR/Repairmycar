package macrosclientreq;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Custmakingpayment 
{
	private WebDriver driver;
	public Custmakingpayment(WebDriver driver) 
	{
        this.driver = driver;
    }
    

   
    @Test
    public void acceptquoteandpay() throws Exception 
    {
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div/div[3]/section/div/div[2]/div[1]/div[2]/div[2]/a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div/div[3]/section/div/div[2]/div[2]/div/div[2]/div[2]/div/a")).click();
    	Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[1]/div/div/div[2]/div/form/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[2]/div/form/div[3]/div/div/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("creditCardNumber")).sendKeys("4000 0000 0000 0002	");
        Thread.sleep(3000);
        WebElement Expirymonth = driver.findElement(By.id("creditCardMonth"));
        Select emonth = new Select(Expirymonth);
        emonth.selectByVisibleText("09");
        Thread.sleep(2000);
        
        WebElement expiryyear=driver.findElement(By.id("creditCardYear"));
        Select year= new Select(expiryyear);
        year.selectByVisibleText("2025");
        Thread.sleep(2000);
        
    	driver.findElement(By.id("cardCVV")).sendKeys("123");
    	Thread.sleep(2000);
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"card_btn_row\"]/div[2]/button[1]")));
        submitButton.click(); 
        wait.until(ExpectedConditions.urlMatches("https://mycarsrepair.com/user/quote_edit/\\d+"));

//        https://mycarsrepair.com/user/quote_edit/
//        String currentUrl = driver.getCurrentUrl();
//        assert currentUrl.matches("\\d+") : "Unexpected URL: " + currentUrl;
//
//        
      
        
    }
    }
