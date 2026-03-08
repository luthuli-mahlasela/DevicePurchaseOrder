package Basics;

import Base.BaseTest;
import Pages.LoginPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    @Test(dataProvider = "testdata")
    public void LoginWithValidDetails(String email, String password) throws InterruptedException{
        loginPage.clickLoginButton();
        loginPage.enterEmailAddress(email);
        loginPage.enterPassword(password);
        loginPage.clickSubmitButton();
        loginPage.verifyLoginSuccess("Here's who's working today");

        invetoryPage.clickLearnButton();
        invetoryPage.clickLearningMaterial();
        invetoryPage.clickWebAutomationBtn();
        invetoryPage.clickDeviceType();
        invetoryPage.clickBrandType();
        invetoryPage.clickStorageSize();
        invetoryPage.clickColor();
        invetoryPage.clickQuantity("2");
        invetoryPage.enterAddress("123 Mayfair");
        invetoryPage.clickNextButton();
        invetoryPage.clickShippingMode();
        invetoryPage.clickWarrantOption();
        invetoryPage.enterDiscountCode("save10");
        invetoryPage.clickDiscountBtn();
        invetoryPage.clickPurchaseDevice();
        Thread.sleep(2000);
        invetoryPage.clickInvoiceBtn();

        // Click invoice button and switch to the new tab
        invetoryPage.clickViewInvoice();



    }
    @DataProvider(name="testdata")
    public Object[][] getData(){
        return new Object[][]{
                {"dust.attack@gmail.com","@12345678"}
        };
    }
}
