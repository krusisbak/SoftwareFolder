package HomeWork2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRegistrationForm {
    public static void main (String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        Thread.sleep(2000);
        driver.findElement(By.className("ico-register")).click();

        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();

        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Krutik");
        driver.findElement(By.id("LastName")).sendKeys("Prajapati");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("24");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("September");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1984");
        driver.findElement(By.id("Email")).sendKeys("krusisbak@hotmail.co.uk");
        driver.findElement(By.id("Company")).sendKeys("Yogi Divine Society");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.id(("Password"))).sendKeys("Dasnadas@9");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Dasnadas@9");
        //driver.findElement(By.id("register-button")).click();

        Thread.sleep(2000);
        driver.close();


    }
}
