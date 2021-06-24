package SeleniumClass3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassScrollingPage {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        1. Scrolling page by using pixel
//        js.executeScript("window.scrollBy(0,1000)","");
//        2. Scrolling page till elements
//        WebElement feaproduct = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[1]/strong"));
//        Thread.sleep(2000);
//        js.executeScript("arguments[0].scrollIntoView();",feaproduct);
//        3. Scroll page till bottom
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
       Thread.sleep(2000);
       js.executeScript("window.scrollBy(0,-2000)"); // Page up
       Thread.sleep(2000);
       driver.close();
    }
}
