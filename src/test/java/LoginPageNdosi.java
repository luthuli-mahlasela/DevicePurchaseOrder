import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoginPageNdosi {
    WebDriver driver;
@Test
    public void LoginDetails() throws InterruptedException{

        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button")).click();
        driver.findElement(By.id("login-email")).sendKeys("dust.attack@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("@12345678");
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"tab-btn-web\"]/span[2]")).click();
        //driver.findElement(By.id("deviceType")).click();
    WebElement ddown= driver.findElement(By.xpath("//*[@id=\"deviceType\"]"));
    Select selectDevice= new Select(ddown);
    selectDevice.selectByIndex(1);

    WebElement dropD=driver.findElement(By.xpath("//*[@id=\"brand\"]"));
    Select selectBrand= new Select(dropD);
    selectBrand.selectByIndex(1);

       driver.findElement(By.xpath("//*[@id=\"inventory-form-grid\"]/div[4]/div/label[2]")).click();
       selectDevice.selectByIndex(1);

       WebElement dropDown=driver.findElement(By.xpath("//*[@id=\"color\"]"));
       Select selectColor= new Select(dropDown);
       selectColor.selectByIndex(1);

       WebElement numericInput = driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
       numericInput.clear();
       numericInput.sendKeys("2");
       //driver.findElement(By.id("quantity")).sendKeys("2");

    driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("123 Mayfair");
    driver.findElement(By.id("inventory-next-btn")).click();
    driver.findElement(By.xpath("//*[@id=\"shipping-option-express\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"warranty-option-1yr\"]")).click();
    driver.findElement(By.id("discount-code")).sendKeys("save10");
    driver.findElement(By.id("apply-discount-btn")).click();
    driver.findElement(By.id("purchase-device-btn")).click();
    Thread.sleep(1000);
    driver.findElement((By.id("view-history-btn"))).click();











    }
}
