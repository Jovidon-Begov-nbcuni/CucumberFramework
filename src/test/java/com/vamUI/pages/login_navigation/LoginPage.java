package com.vamUI.pages.login_navigation;

import com.vamUI.utilities.BasePage;
import com.vamUI.utilities.BrowserUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "[type='email']")
    @CacheLookup
    public WebElement userNameElement;

    @FindBy(css = "[name='password']")
    @CacheLookup
    public WebElement passwordElement;

    @FindBy(className = "auth__login")
    public WebElement signin;


    public void login(String username, String password){
        signin.click();
        userNameElement.sendKeys(username, Keys.ENTER);
        passwordElement.sendKeys(password, Keys.ENTER);
    }


}
