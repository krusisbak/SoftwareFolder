package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {
    public static void main (String[] args) {

        System.setProperty("Webdriver.chrome.driver","D:\\SeleniumLearning\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nopcommerce.com/en");
        driver.manage().window().maximize();

        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title);

        //Verify = expected vs actual results = Validation point

        if (title.equals("Free and open-source eCommerce platform.")) {
           System.out.println("The title is correct");
        }
        else {
            System.out.println("The title is incorrect");
        }

        driver.close(); //closes the whole browser.
        driver.quit(); //Terminates the session ID
    }
}
