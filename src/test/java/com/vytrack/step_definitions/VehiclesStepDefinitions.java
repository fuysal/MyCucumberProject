package com.vytrack.step_definitions;

import com.vytrack.utilities.Pages;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VehiclesStepDefinitions {
    Pages pages = new Pages();
    @Then("user verifies that defaul page number is {int}")
    public void user_verifies_that_defaul_page_number_is(Integer expected) {
       Assert.assertEquals(expected,pages.vehiclesPage().getPageNumber());
    }

    @Then("user c;ocl on the create a car button")
    public void user_c_ocl_on_the_create_a_car_button() {

    }

    @Then("user enters car information:")
    public void user_enters_car_information(io.cucumber.datatable.DataTable dataTable) {

    }

    @Then("user clicks save and close")
    public void user_clicks_save_and_close() {

    }

    @Then("user verifies that general information is displayed")
    public void user_verifies_that_general_information_is_displayed() {

    }



}
