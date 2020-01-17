package com.vytrack.step_definitions;

import com.vytrack.utilities.Pages;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class TopMenuStepDefinitions {
    Pages pages = new Pages();
    @Then("user navigate to {string} and {string}")
    public void user_navigate_to_and(String tab, String module) {

       pages.dashboardPage().navigateToModule(tab, module);
    }

    @Then("Credentials information be {string}")
    public void credentials_information_be(String expected) {
        Assert.assertEquals(expected,pages.dashboardPage().getUserMenuName());
    }

}
