package SeleniumClass3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassActionsSendKeys {
    //Difference between normal and Action send keys.
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-login")).click();

        Thread.sleep(5000);

        WebElement email = driver.findElement(By.id("Email"));
        WebElement password = driver.findElement(By.id("Password"));
        WebElement loginBtn = driver.findElement(By.className("login-button"));

        Actions actions = new Actions(driver);

        actions.sendKeys(email, "test@gmail.com").build().perform();
        actions.sendKeys(password, "testing").build().perform();
        actions.click(loginBtn).build().perform();

    }
}
