package Base;

import Pages.ExtrasPage;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    BrowserFactory browserFactory=new BrowserFactory();
    public final String url="https://ndosisimplifiedautomation.vercel.app/";
    public final String browserChoice="chrome";

     WebDriver driver;
    public LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
    public InventoryPage inventoryPage=PageFactory.initElements(driver,InventoryPage.class);
    public ExtrasPage extrasPage=PageFactory.initElements(driver, ExtrasPage.class);

    @BeforeMethod
    public void setUp() {
        driver = browserFactory.startBrowser(browserChoice,url);
        //loginPage= new LoginPage(driver);
       // inventoryPage= new InventoryPage(driver);
        //extrasPage= new ExtrasPage(driver);

    }
    @AfterMethod
    public void tearDown(){
        browserFactory.closeBrowser();
    }
}
