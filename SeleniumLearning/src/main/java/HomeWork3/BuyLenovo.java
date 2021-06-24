package HomeWork3;

import SeleniumClass3.Text;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class BuyLenovo {
    public static void main (String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);

        WebElement Computers = driver.findElement(By.linkText("Computers"));//mouse roll over

        Actions action = new Actions(driver);
        action.moveToElement(Computers).build().perform();

       // try{
        //    Thread.sleep(2000);
       // } catch (InterruptedException e) {
         //   e.printStackTrace();
        //} ( Need to ask question = what is the function of this code.)

        driver.findElement(By.linkText("Desktops")).click();//mouse roll over to click the link
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver; // scroll to half page
        js.executeScript("window.scrollTo(0,400)");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        //button[@class='button-2 product-box-add-to-cart-button'] Also cannot find alternate path to do, so did Xpath

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='shopping cart']")).click();//click on anchor link to go shopping cart
        driver.get("https://demo.nopcommerce.com/cart");

        driver.findElement(By.id("//*[@id=\"itemquantity11215\"]")).clear();
        driver.findElement(By.id("//*[@id=\"itemquantity11215\"]")).sendKeys("3");
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div[2]/div[1]/button[1]")).click();

    }
}
