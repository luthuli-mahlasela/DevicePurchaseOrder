package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice, String Url) {

        if (browserChoice.equalsIgnoreCase("ChrOme")) {
            driver = new ChromeDriver();
        } else if (browserChoice.equalsIgnoreCase("InternetExplorer")) {
            driver = new InternetExplorerDriver();

        } else if (browserChoice.equalsIgnoreCase("SaFari")) {
            driver = new SafariDriver();

        } else if (browserChoice.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();

        } else {
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(Url);
        return driver;
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }

    }
}
