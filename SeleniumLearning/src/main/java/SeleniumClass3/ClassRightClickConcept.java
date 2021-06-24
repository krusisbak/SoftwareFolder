package SeleniumClass3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassRightClickConcept {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

        WebElement rightClickElement = driver.findElement(By.className("context-menu-one"));

        Actions action = new Actions(driver);

        Thread.sleep(5000);
        action.contextClick(rightClickElement).build().perform();

        String text = driver.findElement(By.className("context-menu-icon-copy")).getText();
        System.out.println(text);
    }

}
