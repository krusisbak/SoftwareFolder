package HomeWork2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        Thread.sleep(2000);

        driver.findElement(By.id("FirstName")).sendKeys ("Krutik");
        driver.findElement(By.id("LastName")).sendKeys("Prajapati");
        driver.findElement(By.id("Email")).sendKeys("krusisbak@hotmail.co.uk");
        driver.findElement(By.id("ConfirmEmail")).sendKeys("krusisbak@hotmail.co.uk");
        driver.findElement(By.id("Username")).sendKeys("KrutikonAutomation");
        driver.findElement(By.id("check-availability-button")).click();
        driver.findElement(By.id("CountryId")).sendKeys("United Kingdom");
        driver.findElement(By.xpath("//*[@id=\"TimeZoneId\"]/option[47]")).click();
        driver.findElement(By.xpath("//*[@id=\"register-page\"]/body/div[6]/section/div/div/div/div/div/div[2]/form/div/div[1]/div[2]/div[8]/div/label")).click();
        driver.findElement(By.id("Password")).sendKeys("Dasnadas@9");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Dasnadas@9");
        driver.findElement(By.id("Details_CompanyIndustryId")).sendKeys("other");
        driver.findElement(By.xpath("//*[@id=\"Details_NopCommerceIntendedUseId\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"Details_CompanyRoleId\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"Details_CompanySizeId\"]/option[2]")).click();
        driver.findElement(By.id("Details_CompanyWebsiteUrl")).sendKeys("Yogi Divine Society");
        //driver.findElement(By.id("register-button")).click();

       // Thread.sleep(2000);
        //driver.close();

    }
}


