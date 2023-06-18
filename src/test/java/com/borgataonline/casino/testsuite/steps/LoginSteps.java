package com.borgataonline.casino.testsuite.steps;


import com.borgataonline.casino.pages.HomePage;
import com.borgataonline.casino.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() {
    }

    @When("^I click on the Login icon from top bar$")
    public void iClickOnTheLoginIconFromTopBar() {
        new HomePage().clickOnLoginButton();
    }

    @And("^I enter Invalid credentials for '<Email>' and '<Password>'$")
    public void iEnterInvalidCredentialsForEmailAndPassword() {
    new LoginPage().enterEmailId("jinesh123@gmail.com");
    new LoginPage().enterPassword("Jinu123");
    }

    @And("^click on the login button$")
    public void clickOnTheLoginButton() {
        new LoginPage().clickOnLogInField();
    }

    @Then("^I should not be logged in successfully$")
    public void iShouldNotBeLoggedInSuccessfully() {
    }


    @And("^I should see the error message$")
    public void iShouldSeeTheErrorMessage() {
        String expected = "Your username and/or password is incorrect.";
        Assert.assertTrue(new LoginPage().getTextForInvalidLogin().contains("Your username and/or password is incorrect."));
    }
}
