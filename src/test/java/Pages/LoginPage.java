package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(xpath = "https://ndosisimplifiedautomation.vercel.app/")
    WebElement LoginButton;

    @FindBy(id="login-email")
    WebElement LoginEmailField;

    @FindBy(id="login-password")
    WebElement LoginPasswordField;

    @FindBy(id="login-submit")
    WebElement LoginSubmitButton;




    public void clickLoginButton(){
        LoginButton.click();
    }
    public void enterEmailAddress(String email){
        LoginEmailField.sendKeys(email);
    }
    public void enterPassword(String password){
        LoginPasswordField.sendKeys(password);
    }
    public void clickSubmitButton(){
        LoginSubmitButton.click();
    }









}
