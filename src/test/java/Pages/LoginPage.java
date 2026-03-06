package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage  {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[1]")
    WebElement LoginButton;

    @FindBy(id="login-email")
    WebElement LoginEmailField;

    @FindBy(id="login-password")
    WebElement LoginPasswordField;

    @FindBy(id="login-submit")
    WebElement LoginSubmitButton;

    @FindBy(xpath = "//*[@id=\"app-main-content\"]/section/div[1]/p")
    WebElement welcomeBackMessage;





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
    public void verifyLoginSuccess(String expectedMessage) {
        wait.until(ExpectedConditions.visibilityOf(welcomeBackMessage));
        String actualMessage = welcomeBackMessage.getText();
        if (!actualMessage.equals(expectedMessage)) {
            throw new AssertionError("Expected message: " + expectedMessage + ", but got: " + actualMessage);
        }
    }


    }










