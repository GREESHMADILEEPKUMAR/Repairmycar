package macrosclientreq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VendorLoginHelper {
    private WebDriver driver;

    public VendorLoginHelper(WebDriver driver) {
        this.driver = driver;
    }
   
    public void login() {
        driver.findElement(By.xpath("//*[@id='main_nav']/div[1]/div/a[2]")).click();
        WebElement customer = driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div/div[2]/a"));
        customer.click();
        WebElement email = driver.findElement(By.id("inputEmail"));
        email.clear();
        email.sendKeys("greeshmadilip22@gmail.com");
        WebElement password = driver.findElement(By.id("inputPassword"));
        password.clear();
        password.sendKeys("12345678");
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='custom-button py-2 rounded-pill get_appointment w-100' and text()='Login']"));
        loginButton.click();
    }
}
