package Base;

import Pages.InvetoryPage;
import Pages.LoginPage;
import Utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    BrowserFactory browserFactory = new BrowserFactory();
    public final String url = "https://ndosisimplifiedautomation.vercel.app/";
    public final String browserChoice = "chrome";

    public WebDriver driver;
    public LoginPage loginPage;
    public InvetoryPage invetoryPage;


    @BeforeClass
    public void setUp() {
        driver = browserFactory.startBrowser(browserChoice,url);
        loginPage= new LoginPage(driver);
        invetoryPage = new InvetoryPage(driver);
    }
    @AfterClass
    public void tearDown(){
        browserFactory.closeBrowser();
    }
}
