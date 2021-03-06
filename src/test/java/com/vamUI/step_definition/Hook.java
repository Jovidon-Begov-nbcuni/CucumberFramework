package com.vamUI.step_definition;

import com.vamUI.utilities.ConfigurationReader;
import com.vamUI.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hook {


    @Before
    public void setup(Scenario scenario) {
        System.out.println(scenario.getName());
        System.out.println(scenario.getSourceTagNames());
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();

            byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);

            scenario.embed(image, "image/png");
        }
        Driver.closeDriver();
    }
}
