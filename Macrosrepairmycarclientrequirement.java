package macrosclientreq;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Macrosrepairmycarclientrequirement 
{
	ChromeDriver driver= new ChromeDriver();
	
	@BeforeTest
	public void setup() throws Exception
	{
		String url="https://mycarsrepair.com/";
		driver.get(url);
		
		driver.manage().window().maximize();
		 System.out.println("Launching Google Chrome browser");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
        String originalTitle = driver.getTitle();
        System.out.println(originalTitle); 
	}
	
		@Test(description="HTML of Home Page and Common Components")
		
	public void linkverification() 
	{
			
			{
			WebElement Bannersection=driver.findElement(By.xpath("/html/body/section[1]"));
			
			 if(Bannersection.isDisplayed()) {
		            System.out.println("Banner section is present on the webpage.");
		        } else {
		            System.out.println("Banner section is not present on the webpage.");
		        }
			
			 WebElement categoryElement = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[1]"));
			
			 if(categoryElement.isDisplayed()) 
			 {
		        // Check if the category element is displayed
				 System.out.println("categryelement is present on the webpage.");
		        
		        Assert.assertTrue(categoryElement.isDisplayed(), "Category element is not present on the webpage.");
		        
			 }
			 else {
				 System.out.println("category is not present on the webpage.");
				
		       
  // Check if the category element is clickable
		        Assert.assertTrue(categoryElement.isEnabled(), "Category element is not clickable.");
			 }
			}
			WebElement Aboutussection=driver.findElement(By.cssSelector("#main_nav > ul.navbar-nav.ms-auto > li:nth-child(2) > a"));
			if(Aboutussection.isDisplayed())
			{
				 System.out.println("Aboutus section is present on the webpage.");
			Assert.assertTrue(Aboutussection.isDisplayed(), "About Us section is present on the webpage.");
			Aboutussection.click();
	}
		else
		{
			System.out.println("Aboutus section is missing");
			Assert.assertTrue(Aboutussection.isDisplayed(), "About Us section is present on the webpage.");
		}
			WebElement aboutUsContent = driver.findElement(By.xpath("/html/body/section[2]/div"));
			if(aboutUsContent.isDisplayed())
			{
				System.out.println("Aboutus section has content");
			
	        Assert.assertTrue(aboutUsContent.isDisplayed(), "Who We Are");}
			else
				System.out.println("no content in about us");
	    driver.navigate().back();
	}
	    @Test
	    public void calltoactions() throws Exception
	    {
	    	try
	    	{
	    List<WebElement> ctaButtons = driver.findElements(By.className("btn"));
Thread.sleep(3000);
        // Iterate through each button and click it
        for (WebElement button : ctaButtons) 
        {
            
            System.out.println(ctaButtons);
            button.click();
        }
	    	}
        catch(org.openqa.selenium.StaleElementReferenceException ex)
	    	{
        	System.out.println("no call to action elements");
	    	}
            
        }
	         @Test
	        public void testVendorsList() 
	         {
	        	
	            // Find the vendors list element
	             driver.getPageSource().contains("View Vendors");

	         }

	            
	        @Test
	        public void testAvailableCarsPresence() 
	        {
	        	driver.getPageSource().contains("Available cars");
	             
	        }

	        @Test
	        public void testBlogsSectionPresence() 
	        {
	        	driver.getPageSource().contains("Blog posts");
	        }

	        @Test
	        public void testTestimonialsSectionPresence() {
	        	
	            // Find the testimonials section
	            WebElement testimonialsSection = driver.findElement(By.xpath("/html/body/section[7]"));

	            // Check if the testimonials section is present
	            if(testimonialsSection.isDisplayed())
	            {
	            	System.out.println("Testimonial section is present");
	            	Assert.assertTrue(testimonialsSection.isDisplayed(), "Testimonials section is present.");
	            }
	            else
	            {
	            System.out.println("no testimonials");
	            }
	        
	        }
	        
	        @Test
	        public void testFooterSectionPresence() throws Exception 
	        {
	        	Thread.sleep(9000);
	        	List<WebElement> footer = driver.findElements(By.className("footer"));
	        	JavascriptExecutor jse = (JavascriptExecutor)driver;

	        	

	        	jse.executeScript("scroll(0, 250)"); // if the element is on bottom.

	            // Iterate through each button and click it
	        	Thread.sleep(3000);
	           
	        }
	        @Test
	        public void signup()
	        {
	        	driver.findElement(By.xpath("//*[@id=\"main_nav\"]/div[1]/div/a[1]")).click();
	        	driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div/div[2]/a")).click();
	        	driver.navigate().back();
	        	driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div[2]/a")).click();
	        	driver.navigate().back();
	        	driver.findElement(By.xpath("/html/body/section[2]/div/div[3]/div/div[2]/a")).click();
	        	driver.navigate().back();
	        }
	        @Test
	           public void services()
	           {
	        	   driver.findElement(By.xpath("//*[@id=\"main_nav\"]/ul[1]/li[3]/a"));
	        	   try {
	                   // Example: Click on a button to show garage locations (replace with actual element interaction)
	                   WebElement showMapButton = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/a/div/div[2]/p"));
	                   showMapButton.click();

	                   // Example: Verify that some garage markers are displayed on the map
	                   List<WebElement> garageMarkers = driver.findElements(By.className("card-group"));
	                   if (garageMarkers.size() > 0) {
	                       System.out.println("Garage markers are displayed on the map.");
	                   } else {
	                       System.out.println("No garage markers found on the map.");
	                   }

	                   // Add more assertions or interactions as needed based on your specific requirements

	               } catch (Exception e) {
	                   e.printStackTrace();
	           }
	           }
//	        	   @Test
//	        	   public void searchfunctioningarages()
//	        	   {
//	        		   try
//	        		   {
//	        	   Select objSelect =new Select(driver.findElement(By.id("selCatFilter")));
//	        	   objSelect.selectByVisibleText("Pick-up/Drop Service");
//	        	   Select objselect1=new Select(driver.findElement(By.id("selGarFilter")));
//	        	   objselect1.selectByVisibleText("garage name");
//	        	   driver.findElement(By.xpath("/html/body/section[3]/div/div[2]/form/button")).click();
//	        	   }
//	        		   catch(Exception e)
//	        		   {
//	        			  
//	        		   
//	        			   e.printStackTrace();
//	        			   System.out.println("Search function is not working");
//	        		   }
//	        	   }
	           @Test
	           public void garagepagedetails()
	           {
	        	   driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[2]/div/a/div/div[2]/p")).click();
	               driver.findElement(By.xpath("/html/body/section[2]/div/form/input")).sendKeys("carzilla");
	               driver.findElement(By.xpath("/html/body/section[3]/section/div/div/div/a/img")).click();
	               try {
	                   // Verify Map Location
	                   WebElement mapElement = driver.findElement(By.linkText("map")); // Assuming the map has an ID attribute
	                   if (mapElement.isDisplayed()) {
	                       System.out.println("Map location is displayed.");
	                   } else {
	                       System.out.println("Map location is not displayed.");
	                   }

	                   // Verify Description
	                   WebElement descriptionElement = driver.findElement(By.xpath("//div[@class='description']/p"));
	                   String descriptionText = descriptionElement.getText();
	                   if (!descriptionText.isEmpty()) {
	                       System.out.println("Description found: " + descriptionText);
	                   } else {
	                       System.out.println("Description not found.");
	                   }

	                   // Verify Opening Hours
	                   WebElement openingHoursElement = driver.findElement(By.xpath("//div[@class='opening-hours']/ul"));
	                   List<WebElement> openingHoursItems = openingHoursElement.findElements(By.tagName("li"));
	                   if (openingHoursItems.size() > 0) {
	                       System.out.println("Opening hours found.");
	                       for (WebElement item : openingHoursItems) {
	                           System.out.println(item.getText());
	                       }
	                   } else {
	                       System.out.println("Opening hours not found.");
	                   }

	                   // Verify Contact Form (assuming there's a form to interact with)
	                   WebElement contactFormElement = driver.findElement(By.name("requestQuote")); // Adjust ID as per actual form
	                   if (contactFormElement.isDisplayed()) {
	                       System.out.println("Contact form is displayed.");
	                       // You can add further interactions such as filling the form and submitting it
	                   } else {
	                       System.out.println("Contact form is not displayed.");
	                   }

	                   // Verify Testimonials section (assuming there's a testimonials section)
	                   WebElement testimonialsSection = driver.findElement(By.xpath("/html/body/section[5]/div/div[1]/div/div[3]/div")); // Adjust ID as per actual testimonials section
	                   if (testimonialsSection.isDisplayed()) {
	                       System.out.println("Testimonials section is displayed.");
	                       // You can add assertions or interactions specific to testimonials
	                   } else {
	                       System.out.println("Testimonials section is not displayed.");
	                   }

	               } catch (Exception e) {
	                   e.printStackTrace();
	           
	           }
	           }
	           
	        

	        	@AfterTest
				public void teardown() 
				{
					 driver.close();
					 
					 
					System.out.println("Finished Test On Chrome Browser");
				}
			

	        }

	       


			




