package macrosclientreq;


	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.AfterMethod;
	import org.testng.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.interactions.Actions;

	public class test 
	{


		private WebDriver driver;

	    @BeforeMethod
	    public void setUp()
	    {
	        // Automatically manage ChromeDriver version
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().setSize(new Dimension(1414, 877));
	    }
	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }

	    @Test
	    public void testAddToCartAndCheckout() {
	        // Navigate to the website
	        driver.get("https://photography.shubbaktech.ae/");

	        // Click on menu trigger
	        driver.findElement(By.cssSelector(".mat-menu-trigger > .menu-label")).click();

	        // Mouse over the element
	        WebElement element = driver.findElement(By.cssSelector(".mat-focus-indicator:nth-child(3)"));
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element).perform();

	        // Click on the focused element
	        driver.findElement(By.cssSelector(".cdk-focused")).click();

	        // Mouse out of the element
	        element = driver.findElement(By.tagName("body"));
	        builder.moveToElement(element, 0, 0).perform();

	        // Add product to cart
	        driver.findElement(By.cssSelector(".ng-tns-c91-9 > .gap-3")).click();
	        driver.findElement(By.cssSelector(".ng-tns-c91-9 .text-base > .ng-star-inserted")).click();
	        driver.findElement(By.cssSelector(".ng-tns-c200-12 > .initial-add-to-cart-btn > .flex")).click();

	        // Navigate to shopping cart
	        driver.findElement(By.cssSelector(".shoping-cart")).click();

	        // Proceed to checkout
	        driver.findElement(By.cssSelector(".text-md")).click();

	        // Fill in email and password
	        driver.findElement(By.id("mat-input-0")).sendKeys("greeshma@shubbaktech.com");
	        driver.findElement(By.id("mat-input-1")).sendKeys("123");

	        // Select a payment method
	        driver.findElement(By.cssSelector(".ng-tns-c62-22:nth-child(4)")).click();
	        driver.findElement(By.id("mat-input-1")).click();

	        // Complete payment details
	        driver.findElement(By.cssSelector(".button-large")).click();
	        driver.findElement(By.cssSelector(".bank")).click();

	        WebElement bankDropdown = driver.findElement(By.cssSelector(".bank"));
	        bankDropdown.findElement(By.xpath("//option[. = 'Knet Test Card [KNET1]']")).click();

	        driver.findElement(By.id("debitNumber")).sendKeys("0000000001");
	        driver.findElement(By.cssSelector("#cardExpdate .paymentselect:nth-child(1)")).click();

	        WebElement expMonthDropdown = driver.findElement(By.cssSelector("#cardExpdate .paymentselect:nth-child(1)"));
	        expMonthDropdown.findElement(By.xpath("//option[. = '09']")).click();

	        driver.findElement(By.cssSelector(".paymentselect:nth-child(2)")).click();

	        WebElement expYearDropdown = driver.findElement(By.cssSelector(".paymentselect:nth-child(2)"));
	        expYearDropdown.findElement(By.xpath("//option[. = '2025']")).click();

	        driver.findElement(By.id("cardPin")).sendKeys("1234");
	        driver.findElement(By.id("proceed")).click();
	        driver.findElement(By.id("proceedConfirm")).click();

	        // Verify the final step or confirmation
	        WebElement confirmation = driver.findElement(By.cssSelector(".ion-activated"));
	        Assert.assertNotNull(confirmation, "Confirmation step is not completed.");
	    }
	

}
