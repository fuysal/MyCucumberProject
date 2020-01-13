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


}
