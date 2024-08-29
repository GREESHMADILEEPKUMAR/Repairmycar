package macrosclientreq;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SendingQuotation
{
	
	private WebDriver driver;
	public SendingQuotation(WebDriver driver) 
	{
        this.driver = driver;
    }
    
	 @Test(priority = 1, description = "sendingquote")
	    public void viewDetail() throws InterruptedException {
	        // Perform actions after login
	        driver.findElement(By.xpath("/html/body/div/div[2]/nav/div[3]/a[3]")).click();
	        Thread.sleep(2000);
	       
	        driver.findElement(By.xpath("/html/body/div/div[3]/section/div/div[2]/div[1]/div/div[2]/div[3]/div/a[2]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[1]/div/div[1]/input")).sendKeys("Oil change");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[1]/div/div[2]/div/input")).sendKeys("1");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[1]/div/div[3]/input")).sendKeys("100");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[2]/div/div[1]/input")).sendKeys("Human Labour");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[2]/div/div[2]/div/input")).sendKeys("1");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[2]/div/div[3]/input")).sendKeys("100");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[3]/div/div[1]/input")).sendKeys("Axles");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[3]/div/div[2]/div/input")).sendKeys("1");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[3]/div/div[3]/input")).sendKeys("100");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[4]/div/div[1]/input")).sendKeys("polish & paint");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[4]/div/div[2]/div/input")).sendKeys("1");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[4]/div/div[3]/input")).sendKeys("100");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[5]/div/div[1]/input")).sendKeys("Bumper replacement");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[5]/div/div[2]/div/input")).sendKeys("2");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[5]/div/div[3]/input")).sendKeys("100");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[6]/div/div[1]/input")).sendKeys("inspection report");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[6]/div/div[2]/div/input")).sendKeys("1");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[6]/div/div[3]/input")).sendKeys("100");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[7]/div/div[1]/input")).sendKeys("Wash");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[7]/div/div[2]/div/input")).sendKeys("1");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[7]/div/div[3]/input")).sendKeys("100");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[7]/div/div/form/div/div/div[8]/div[5]/input")).sendKeys("7");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"floatingTextarea2\"]")).sendKeys("This is a quote request for testing purpose");
	        Thread.sleep(2000);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSubmit")));
//	        submitButton.click();
	        
	        
	        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSubmit")));
		       

	        Actions actions = new Actions(driver);

	        actions.moveToElement(submitButton).click().perform();
	        
	        driver.navigate().refresh();
	        driver.findElement(By.xpath("/html/body/div/div[2]/nav/div[4]/button")).click();
	        Thread.sleep(2000);
	        //driver.findElement(By.id("btnSubmit")); //*[@id="btnSubmit"]
	    }
	}
	    

