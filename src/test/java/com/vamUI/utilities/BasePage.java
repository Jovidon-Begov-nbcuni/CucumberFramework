package com.vamUI.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.vamUI.utilities.BrowserUtils.*;

public abstract class BasePage {

    private static final Logger logger = LogManager.getLogger();

    @FindBy(xpath = "//*[@id=\"main\"]/div/nav/a/img")
    public WebElement pageSubTitle;

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String getPageSubTitle() {
        waitForStaleElement(pageSubTitle);
        return pageSubTitle.getAttribute("value");
    }

}
