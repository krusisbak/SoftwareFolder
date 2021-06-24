package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupPage {

    public static void main (String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep ( 2000);

        driver.findElement(By.className("search-box-button")).click();

        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();

        String text = alert.getText();
        System.out.println(text);

        Thread.sleep(2000);

        //alert.accept(); //it will click ok

        alert.dismiss(); //cancel alert
    }
}
