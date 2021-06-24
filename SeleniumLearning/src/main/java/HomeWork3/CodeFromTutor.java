package HomeWork3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CodeFromTutor {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement hoverOnComputers = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
        WebElement clickOnDesktop = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOnComputers).click(clickOnDesktop).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("add-to-cart-button-3")).click();
        Thread.sleep(3000);
        String text = driver.findElement(By.className("content")).getText();
        if (text.equals("The product has been added to your shopping cart")) {
            System.out.println("Item added to cart successfully");
        } else {
            System.out.println("Item not added to cart");
        }
        driver.findElement(By.linkText("shopping cart")).click();
        Thread.sleep(2000);
        WebElement termsOfService = driver.findElement(By.id("termsofservice"));
        WebElement checkOutBtn = driver.findElement(By.id("checkout"));
        actions.click(termsOfService).build().perform();
        actions.click(checkOutBtn).build().perform();
        Thread.sleep(3000);
        WebElement checkOutAsGuest = driver.findElement(By.xpath("//button[@class='button-1 checkout-as-guest-button']"));
        checkOutAsGuest.click();
        //actions.click(checkOutAsGuest).build().perform();
        WebElement firstName = driver.findElement(By.id("BillingNewAddress_FirstName"));
        WebElement lastName = driver.findElement(By.id("BillingNewAddress_LastName"));
        WebElement email = driver.findElement(By.id("BillingNewAddress_Email"));
        WebElement company = driver.findElement(By.id("BillingNewAddress_Company"));
        WebElement country = driver.findElement(By.id("BillingNewAddress_CountryId"));
        WebElement city = driver.findElement(By.id("BillingNewAddress_City"));
        WebElement addr = driver.findElement(By.id("BillingNewAddress_Address1"));
        WebElement pcode = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        WebElement pnumber = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        actions.sendKeys(firstName, "Unify").build().perform();
        actions.sendKeys(lastName, "Testing").build().perform();
        actions.sendKeys(email, "unifytesting57@gmail.com").build().perform();
        actions.sendKeys(company, "Unify Testing").build().perform();
        Select select = new Select(country);
        select.selectByVisibleText("United Kingdom");
        actions.sendKeys(city, "Leicester").build().perform();
        actions.sendKeys(addr, "1 Melton Road").build().perform();
        actions.sendKeys(pcode, "LE4 1AA").build().perform();
        actions.sendKeys(pnumber, "07788998877").build().perform();
        WebElement continueStep2 = driver.findElement(By.xpath("//button[@class='button-1 new-address-next-step-button']"));
        actions.click(continueStep2).build().perform();
    }
    //
}
//    WebElement qty = driver.findElement(By.className("qty-input"));
//    WebElement updateCart = driver.findElement(By.name("updatecart"));
//        actions.sendKeys(qty, "2").build().perform();
//        actions.click(updateCart).build().perform();
//actions.tick(termsOfService).build().perform();

