package macrosclientreq;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Requestaquote 
{
	 private WebDriver driver;
	
	 WebDriverWait wait;

	    public Requestaquote(WebDriver driver) 
	    {
	        this.driver = driver;
	    }
	    public void requestingquote() throws Exception {
	    	
	        driver.findElement(By.xpath("//*[@id='dashboardSidebarRightContent']/nav[1]/div[1]/ul/li[2]/a")).click();
	        Thread.sleep(3000);

	        WebElement selectElement = driver.findElement(By.id("lookingFor"));
	        Select dropdown = new Select(selectElement);
	        dropdown.selectByVisibleText("I have Inspection Report & Looking for the Quotation");

	        WebElement brandelement = driver.findElement(By.id("company"));
	        Select brand = new Select(brandelement);
	        brand.selectByVisibleText("Toyota");
	       
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

	        driver.findElement(By.name("phone")).sendKeys("+971561662476");
	        driver.findElement(By.name("registration_no")).sendKeys("D45677");
	        driver.findElement(By.name("Chasis_no")).sendKeys("345678");
	        driver.findElement(By.name("color")).sendKeys("Red");

	        WebElement yearmodel = driver.findElement(By.name("model_year_id"));
	        Select year = new Select(yearmodel);
	        year.selectByVisibleText("2010");

	        driver.findElement(By.name("mileage")).sendKeys("2000");

	        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.select2-search__field")));
	        searchInput.click();
	        searchInput.sendKeys("Extended warranty");
	        searchInput.sendKeys(Keys.ENTER);

	        driver.findElement(By.xpath("//*[@id='home']/div/div[11]/textarea")).sendKeys("Requesting a quote for testing a scenario based on uniformity on id");

	        nextbutton();

	        // Page 2
	        carimgupload();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/div[2]/div/div/div/form/div/div[2]/div/div[2]/div/button")).click();
	        accidentreport();
	        driver.findElement(By.xpath("//*[@id=\"inspectionReport\"]/div/div[2]/textarea")).sendKeys("Special Report");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"inspectionReport\"]/div/div[3]/div/button")).click();
	        registrationcopyimage();
//	        WebElement country=driver.findElement(By.xpath("//*[@id=\"address\"]"));
//	        country.sendKeys("Dubai");
//	        country.sendKeys(Keys.DOWN);
//	        country.sendKeys(Keys.ENTER);
	        
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Locate the input field and enter the address
	        WebElement addressInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address")));
	        addressInput.sendKeys("Dubai mall"); // Replace with the address you want to search for

	        // Wait for the dropdown to appear and locate the first item
	        WebElement dropdownItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'pac-item')][1]")));

	        // Click on the desired dropdown item
	        dropdownItem.click();
	        
	        WebElement garage = driver.findElement(By.name("qoute_range"));

	        Select garageselect = new Select(garage);
	       
	        garageselect.selectByVisibleText("All");
	        
	        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sety\"]")));
	        submit.click();
	       
	        driver.navigate().refresh();
	        driver.findElement(By.xpath("/html/body/div/div[2]/nav/div[3]/button")).click();
	        
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
}
