package Basics;

import Base.BaseTest;
import Pages.LoginPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(dataProvider = "testdata")
public class LoginTest extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    public void LoginWithValidDetails(String email, String password) throws InterruptedException{
        loginPage.clickLoginButton();
        loginPage.enterEmailAddress(email);
        loginPage.enterPassword(password);
        loginPage.clickSubmitButton();
        loginPage.verifyLoginSuccess("Here's who's working today");

        loginPage.clickLearnButton();
        loginPage.clickLearningMaterial();
        loginPage.clickWebAutomationBtn();
        loginPage.clickDeviceType();
        loginPage.clickBrandType();
        loginPage.clickStorageSize();
        loginPage.clickColor();
       loginPage.clickQuantity("2");
       loginPage.enterAddress("123 Mayfair");
        loginPage.clickNextButton();
        loginPage.clickShippingMode();
        loginPage.clickWarrantOption();
        loginPage.enterDiscountCode("save10");
        loginPage.clickDiscountBtn();
        loginPage.clickPurchaseDevice();
        loginPage.clickInvoiceBtn();


    }
    @DataProvider(name="testdata")
    public Object[][] getData(){
        return new Object[][]{
                {"dust.attack@gmail.com","@12345678"}
        };
    }
}
