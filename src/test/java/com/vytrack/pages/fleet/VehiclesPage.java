package com.vytrack.pages.fleet;

import com.vytrack.utilities.BasePage;
import com.vytrack.utilities.BrowserUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//              | License Plate | HELLO |
//              | Driver        | Ben   |
//              | Model Year    | 2020  |
//              | Make          | Tesla |


public class VehiclesPage extends BasePage {

    @FindBy(css = "input[type='number']")
    //   xpath = "//label[text()='Page:']/following-sibling::ul//input"
    public WebElement pageNumber;

    @FindBy(css = "[title='Create Car']")
    public WebElement createACarBtn;

    @FindBy(css = "[id^='custom_entity_type_LicensePlate']")
    public WebElement licensePlate;

    @FindBy(css = "[id^='custom_entity_type_Driver']")
    public WebElement driverElement;

    @FindBy(css = "[id^='custom_entity_type_Location']")
    public WebElement location;

    @FindBy(css = "[id^='custom_entity_type_ModelYear']")
    public WebElement modelYear;
    @FindBy(css = "[id^='custom_entity_type_Color']")
    public WebElement color;

    @FindBy(css = "[id^='custom_entity_type_Power']")
    public WebElement power;

    @FindBy(css = "[class^='btn btn-success action-button']")
    public WebElement saveAndClose;

    @FindBy(xpath = "//span[text()='General Information']")
    public WebElement generalInfo;

    public Integer getPageNumber() {
        return Integer.valueOf(pageNumber.getAttribute("value"));

    }

    public boolean verifyGeneralInfoIsDisplayed() {
        try {
            return generalInfo.isDisplayed();

        } catch (NoSuchElementException e) {
            return false;

        }
    }

    public void clickToCreateCarBtn() {
        BrowserUtils.waitForStaleElement(createACarBtn);
        createACarBtn.click();
    }

    public void clickSaveAndClose() {
        saveAndClose.click();
    }

    public void enterLicensePlate(String value) {
        //clear the box before in case we have done negative test before
        licensePlate.clear();
        licensePlate.sendKeys(value);
    }

    public void enterDriverInput(String value) {
        driverElement.clear();
        driverElement.sendKeys(value);
    }

    public void enterLocation(String value) {
        location.clear();
        location.sendKeys(value);
    }

    public void enterModelYear(String value) {
        modelYear.clear();
        modelYear.sendKeys(value);
    }

    public void enterColor(String value) {
        color.clear();
        color.sendKeys(value);
    }

    public void enterPower(String value) {
        power.clear();
        power.sendKeys(value);
    }
}
