package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class InvetoryPage {

    WebDriver driver;
    WebDriverWait wait;

    public InvetoryPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")
    WebElement LearnButton;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]")
    WebElement LearningMaterialButton;

    @FindBy(xpath = "//*[@id=\"tab-btn-web\"]/span[2]")
    WebElement WebAutomationButton;

    @FindBy(xpath="//*[@id=\"deviceType\"]")
    WebElement SelectDeviceType;

    @FindBy(xpath="//*[@id=\"brand\"]")
    WebElement SelectBrandType;

    @FindBy(xpath="//*[@id=\"inventory-form-grid\"]/div[4]/div/label[2]")
    WebElement SelectStorage;

    @FindBy(xpath = "//*[@id=\"color\"]")
    WebElement SelectColor;

    @FindBy(xpath = "//*[@id=\"quantity\"]")
    WebElement SelectQuantity;

    @FindBy(xpath = "//*[@id=\"address\"]")
    WebElement AddressField;

    @FindBy(id="inventory-next-btn")
    WebElement InventoryNextBtn;

    @FindBy(xpath = "//*[@id=\"shipping-option-express\"]")
    WebElement SelectShippingMode;

    @FindBy(xpath ="//*[@id=\"warranty-option-1yr\"]" )
    WebElement SelectWarrantyOption;

    @FindBy(id="discount-code")
    WebElement DiscountCodeField;

    @FindBy(id="apply-discount-btn")
    WebElement ApplyDiscountBtn;

    @FindBy(id="purchase-device-btn")
    WebElement PurchaseDeviseBtn;

    @FindBy(id="view-history-btn")
    WebElement InvoiceBtn;

    public void clickLearnButton(){
        wait.until(ExpectedConditions.visibilityOf(LearnButton));
        LearnButton.click();
    }
    public void clickLearningMaterial(){
        wait.until(ExpectedConditions.visibilityOf(LearningMaterialButton));
        LearningMaterialButton.click();
    }
    public void clickWebAutomationBtn(){
        WebAutomationButton.click();
    }
    public void clickDeviceType(){
        //WebElement ddown= driver.findElement(By.xpath("//*[@id=\"deviceType\"]"));
        Select selectDevice= new Select(SelectDeviceType);
        selectDevice.selectByIndex(1);
        SelectDeviceType.click();
    }
    public void clickBrandType(){
        //WebElement dropD=driver.findElement(By.xpath("//*[@id=\"brand\"]"));
        Select selectBrand= new Select(SelectBrandType);
        selectBrand.selectByIndex(1);
        SelectBrandType.click();
    }
    public void clickStorageSize(){
        //driver.findElement(By.xpath("//*[@id=\"inventory-form-grid\"]/div[4]/div/label[2]")).click();
        SelectStorage.click();
    }
    public void clickColor(){
        // WebElement dropDown=driver.findElement(By.xpath("//*[@id=\"color\"]"));
        Select selectColor= new Select(SelectColor);
        selectColor.selectByIndex(1);
        wait.until(ExpectedConditions.visibilityOf(SelectColor));
        SelectColor.click();
    }
    public void clickQuantity(String quantity){
        //WebElement numericInput = driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
        wait.until(ExpectedConditions.visibilityOf(SelectQuantity));
        SelectQuantity.clear();
        SelectQuantity.sendKeys("");
        SelectQuantity.sendKeys(quantity);
    }
    public void enterAddress(String address){
        wait.until(ExpectedConditions.visibilityOf(AddressField));
        AddressField.sendKeys(address);
    }
    public void clickNextButton(){
        InventoryNextBtn.click();
    }
    public void clickShippingMode(){
        wait.until(ExpectedConditions.visibilityOf(SelectShippingMode));
        SelectShippingMode.click();
    }
    public void clickWarrantOption(){
        SelectWarrantyOption.click();
    }
    public void enterDiscountCode(String code){
        DiscountCodeField.sendKeys(code);
    }
    public void clickDiscountBtn(){
        ApplyDiscountBtn.click();
    }
    public void clickPurchaseDevice(){
        PurchaseDeviseBtn.click();
    }
    public void clickInvoiceBtn(){
        wait.until(ExpectedConditions.visibilityOf(InvoiceBtn));
        InvoiceBtn.click();
    }

}
