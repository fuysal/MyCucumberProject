package com.vytrack.pages.fleet;

import com.vytrack.utilities.BasePage;
import com.vytrack.utilities.Driver;
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

    public Integer getPageNumber() {
        return Integer.valueOf(pageNumber.getAttribute("value"));

    }

    public void clickToCreateCarBtn() {
        waitUntilLoaderScreenDisappear();
        createACarBtn.click();
    }
}
