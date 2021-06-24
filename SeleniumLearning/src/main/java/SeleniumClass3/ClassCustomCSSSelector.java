package SeleniumClass3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassCustomCSSSelector {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-login")).click();

        Thread.sleep(5000);

        driver.findElement(By.cssSelector("#Email")).sendKeys("test@gmail.com");

        /*
        #Email
        input#Email

        ID:
        input[id='Email']
        input[id='Email'][type='email'] - 2 properties

        Class:
        .email
        .newsletter-subscribe-button
        input.email
        button.login-button

        Text method in CSS:
        input[id^='Password']  ^ starting with
        input[id$='word']  $ ending with

        Contains:
        button[id*='subscribe']
         */
}
}
