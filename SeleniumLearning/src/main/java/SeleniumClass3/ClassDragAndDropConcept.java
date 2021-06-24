package SeleniumClass3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassDragAndDropConcept {


        /* Actions - allows you to move to elements and do certain actions on it.
        drag and drop
        rightclick
        click and hold
        mouseover

        Actions class - predefined class

         */
        public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

            //3 actions -
            //click and hold // individual actions/methods.
            // move to target
            // release

            Actions action = new Actions(driver);

            WebElement sourceElement = driver.findElement(By.id("draggable"));
            WebElement targetElement = driver.findElement(By.id("droppable"));

            Thread.sleep(5000);

            //action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();

            //build means to collect all actions and connect. Perform

            action.dragAndDrop(sourceElement, targetElement).build().perform();

        }
}
