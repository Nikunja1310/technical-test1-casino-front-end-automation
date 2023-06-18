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
public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "userId")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginField;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Your username and/or password is incorrect.']")
    WebElement actualInvalidText;

    public void enterEmailId(String email) {
        useTryAndCatchToHandleAlertsException();
        waitUntilVisibilityOfElementLocated(driver, emailField, 40);
        mouseHoverToElement(emailField);
        sendTextToElement(emailField, email);
        log.info("Enter email " + email + " to email field " + emailField.getText());
    }

    public void enterPassword(String password) {
        mouseHoverToElement(passwordField);
        sendTextToElement(passwordField, password);
        log.info("Enter password " + password + " to password field " + passwordField.getText());
    }

    public void clickOnLogInField() {
       /* try {
            dismissAlert();
        } catch (NoAlertPresentException e) {
            System.out.println("No alert present after clicking on the login button");
            e.printStackTrace();
        }*/
        useTryAndCatchToHandleAlertsException();
        waitUntilVisibilityOfElementLocated(driver, loginField, 40);
        mouseHoverToElementAndClick(loginField);
        log.info("Clicking on login link " + loginField.getText());
    }

    public String getTextForInvalidLogin() {
        useTryAndCatchToHandleAlertsException();
        waitUntilVisibilityOfElementLocated(driver,actualInvalidText,40);
        mouseHoverToElementAndClick(actualInvalidText);
        return getTextFromElement(actualInvalidText);
    }
}
