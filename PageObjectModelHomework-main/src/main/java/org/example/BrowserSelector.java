package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {
    LoadProperty loadProperty = new LoadProperty();
//    String browserName = "edge";
    String browserName =loadProperty.getProperty("browser");

    public void openBrowser(){

        if (browserName.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver","src/test/resources/BrowserDriver/chromedriver.exe");

            // initialing the object
            driver = new ChromeDriver();
        }
           else if (browserName.equalsIgnoreCase("edge"))
        {
        System.setProperty("webdriver.edge.driver","src/test/resources/BrowserDriver/msedgedriver.exe");

        // initialing the object
        driver = new EdgeDriver();
        }else
        {
        System.out.println("In correct browser name or empty...:"+browserName);
        }



        // maximize the browser window
        driver.manage().window().maximize();
        // applying implicit wait to driver object
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        }
