package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage {
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")
    WebElement LearnButton;

    @FindBy(xpath = "//*[@id=\\\"app-root\\\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]\"")
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

    public void clickLearnButton(){
        LearnButton.click();
    }
    public void clickLearningMaterial(){
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
        SelectColor.click();
    }
    public void clickQuantity(String quantity){
        //WebElement numericInput = driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
        SelectQuantity.clear();
        SelectQuantity.sendKeys("2");
        SelectQuantity.sendKeys(quantity);
    }
    public void enterAddress(String address){
        AddressField.sendKeys(address);
    }
    public void clickNextButton(){
        InventoryNextBtn.click();
    }
}
