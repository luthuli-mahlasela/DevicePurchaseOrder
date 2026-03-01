package Basics;

import Base.BaseTest;
import Pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(dataProvider = "testdata")
public class LoginTest extends BaseTest {

    public void LoginWithValidDetails(String email,String password) throws InterruptedException{
        loginPage.clickLoginButton();
        loginPage.enterEmailAddress(email);
        loginPage.enterPassword(password);
        loginPage.clickSubmitButton();


    }
    @DataProvider(name="testdata")
    public Object[][] getData(){
        return new Object[][]{
                {"dust.attack@gmail.com","@12345678"}
        };
    }
}
