package SeleniumClass3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ClassImplicitWaits {
    public static void main(String[] args) throws InterruptedException {

        //Thread.sleep(5000) - static wait 5 -2 = 3 spare seconds

        //Implicity Wait - Dynamic wait maximum 5000 -- 3000
        //Global Wait - applied to all elements
        //Ignore extra seconds - saves time and faster performance
        //Nosuchelement exception
        //Webelements

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        //Thread.sleep(20000);

        //To write implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //nosuchelement

        driver.findElement(By.className("ico-login")).click();

        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); //nullify

    }

}
