package Basics;

import Base.BaseTest;

public class InventoryPageTest extends BaseTest {

    public void NavigateInventoryPage(String quantity,String address) throws InterruptedException{

        inventoryPage.clickLearnButton();
        inventoryPage.clickLearningMaterial();
        inventoryPage.clickWebAutomationBtn();
        inventoryPage.clickDeviceType();
        inventoryPage.clickBrandType();
        inventoryPage.clickStorageSize();
        inventoryPage.clickColor();
        inventoryPage.clickQuantity(quantity);
        inventoryPage.enterAddress(address);
        inventoryPage.clickNextButton();

    }
}
