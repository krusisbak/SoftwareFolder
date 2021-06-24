package HomeWork2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraticeRegisterForm {

    public static void main (String[] args ) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.nopcommerce.com/en");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        Thread.sleep(2000);

        driver.findElement(By.className(("userlink"))).click();
        driver.findElement(By.className("ico-register")).click();

        Thread.sleep(2000);
        driver.close();

    }
}
