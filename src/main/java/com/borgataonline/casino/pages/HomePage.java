package com.borgataonline.casino.pages;

import com.borgataonline.casino.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Nikunja A Senjalia
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Log in')]")
    WebElement loginButton;

    public void clickOnLoginButton() {
        useTryAndCatchToHandleAlertsException();
        waitUntilVisibilityOfElementLocated(driver, loginButton, 40);
        log.info("Clicking on login link " + loginButton.getText());
        mouseHoverToElementAndClick(loginButton);
    }
}

