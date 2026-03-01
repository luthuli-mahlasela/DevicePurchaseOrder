package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExtrasPage {

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


    public void clickShippingMode(){
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
        InvoiceBtn.click();
    }
}
