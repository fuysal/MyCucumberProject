package com.vytrack.step_definitions;

import com.vytrack.utilities.Pages;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class VehiclesStepDefinitions {
    Pages pages = new Pages();
    @Then("user verifies that defaul page number is {int}")
    public void user_verifies_that_defaul_page_number_is(Integer expected) {
       Assert.assertEquals(expected,pages.vehiclesPage().getPageNumber());
    }

    @Then("user c;ocl on the create a car button")
    public void user_c_ocl_on_the_create_a_car_button() {
    pages.vehiclesPage().clickToCreateCarBtn();
    }

//            | License Plate | HELLO |
//            | Driver        | Ben   |
//            | Model Year    | 2020  |
//            | Color         | Balck |
//            | Power         | 500   |

    @Then("user enters car information:")
    public void user_enters_car_information(Map<String,String> values) {
        pages.vehiclesPage().enterLicensePlate(values.get("License Plate"));
        pages.vehiclesPage().enterDriverInput(values.get("Driver"));
        pages.vehiclesPage().enterModelYear(values.get("Model Year"));
        pages.vehiclesPage().enterColor(values.get("Color"));
        pages.vehiclesPage().enterPower(values.get("Power"));

    }

    @Then("user enters car information from a table:")
    public void user_enters_car_information_from_a_table(List<Map<String,String >> values) {

//        values.get(0).get("Driver");
        // as many rows you have in the data table as many map you will have in the list
        for (Map<String,String> value:values){

            pages.vehiclesPage().enterLicensePlate(value.get("License Plate"));
            pages.vehiclesPage().enterDriverInput(value.get("Driver"));
            pages.vehiclesPage().enterModelYear(value.get("Model Year"));
            pages.vehiclesPage().enterColor(value.get("Color"));
            pages.vehiclesPage().enterPower(value.get("Power"));
        }

    }

    @Then("user clicks save and close")
    public void user_clicks_save_and_close() {
    pages.vehiclesPage().clickSaveAndClose();
    }

    @Then("user verifies that general information is displayed")
    public void user_verifies_that_general_information_is_displayed() {
    Assert.assertTrue(pages.vehiclesPage().verifyGeneralInfoIsDisplayed());
    }



}
