package com.sample.step_definitions;

import com.sample.pages.Elements;
import com.sample.utilities.ConfigurationReader;
import com.sample.utilities.Driver;
import com.sample.utilities.BrowserUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AddCartStepDef extends BrowserUtils {
    Elements elements = new Elements();

    @Given("I login to website")
    public void loginToWebsite() {
        Driver.getDriver().get(ConfigurationReader.getProperty("website"));  // step to go to mentioned site
    }

    @When("I select items and add to cart")
    public void selectFlightMultiCity() {
        waitForVisibility(elements.gmail, 10);  // wait on an element when site is loaded
        elements.gmail.click();  // click element when element is visible
    }

    @When("I navigate to the cart page")
    public void selectAdultsAndChildren() {
        // click element to navigate to the cart page
    }

    @Then("I verify that added items are present")
    public void validateResultsAndItinerary() {
        // verify items present in cart by getting the values and doing assertion like below
        assertTrue("output value".contains("value"));
    }
}
