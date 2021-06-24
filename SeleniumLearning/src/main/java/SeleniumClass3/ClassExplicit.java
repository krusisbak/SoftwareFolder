package SeleniumClass3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClassExplicit {
    public static void main(String[] args) {

        //Explicit Wait - more powerful than implicit wait - also dynamic.
        //Actual element like thread.sleep
        //Available in the form of Webdiver Wait. (predefined class - Wait class)

        //Exception - timeout exception
        //It can handle webelement and non-webelements

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        WebDriverWait wait = new WebDriverWait(driver, 20); //timeout
        wait.until(ExpectedConditions.titleContains("nopCommerce"));   //boolean method - specific
        System.out.println(driver.getTitle());

        //No thread.sleep
        //Implicit - Global Wait - webelements
        //Explicit Wait - non funcitonal also - individual element

    }
}
