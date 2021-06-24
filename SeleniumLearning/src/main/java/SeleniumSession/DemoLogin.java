package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLogin {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        Thread.sleep(2000);

        driver.findElement(By.className("ico-login")).click();

        Thread.sleep(2000);

        //ID concept
        driver.findElement(By.id("Email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("test@123");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click(); //own syntax

//        //create a variable so can be reused
   //     WebElement email = driver.findElement(By.id("Email"));  //DataType - Variable Name = Value
     //   email.sendKeys("test@gmail.com");
       // email.sendKeys("test123@test.com");

        //driver.findElement(By.linkText("nopCommerce")).click();

        //driver.findElement(By.partialLinkText("Log")).click(); // Log in and Log out

        Thread.sleep(2000);

    }

}
