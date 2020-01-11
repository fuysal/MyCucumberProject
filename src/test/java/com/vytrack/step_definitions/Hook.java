package com.vytrack.step_definitions;


import com.vytrack.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {
    @Before (order = 1)
    // default that runs for any scenarios
    public void setup(Scenario scenario){
        System.out.println(scenario.getName());
        System.out.println(scenario.getSourceTagNames());
        System.out.println("Before");
    }


    @After(order = 1)
    public void teardown(Scenario scenario){
        if(scenario.isFailed()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
           byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
           //will attach screenshot into report
           scenario.embed(image, "image/png");
        }
        Driver.closeDriver();
        System.out.println("after");
    }







/*



    @Before(value = "@storemanager", order = 2)
    public void setupForStoremanager(Scenario scenario){

        System.out.println("Before For Storemanager");
    }


    @After(value = "@storemanager", order = 2)
    public void teardown(){
        System.out.println("after Fot Storemanager");
    }

 */
}
