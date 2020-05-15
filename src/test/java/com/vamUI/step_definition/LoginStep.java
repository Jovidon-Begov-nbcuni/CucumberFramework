package com.vamUI.step_definition;

import com.vamUI.utilities.Pages;
import cucumber.api.java.en.*;

import static com.vamUI.utilities.ConfigurationReader.*;
import static com.vamUI.utilities.BrowserUtils.*;

public class LoginStep extends Pages{

    @When("admin signs in")
    public void userLogsIn() {
        loginPage().login(getProperty("username"), getProperty("password"));
    }

    @Then("admin verifies that page subtitle is displayed")
    public void user_verifies_that_page_name_is_displayed() {
        verifyElementDisplayed(dashboardPage().pageSubTitle);
    }
}
