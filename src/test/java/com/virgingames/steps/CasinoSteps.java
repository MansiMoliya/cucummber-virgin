package com.virgingames.steps;
import com.virgingames.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.virgingames.browserfactory.ManageBrowser.driver;

public class CasinoSteps {
    @Given("I am on HomePage")
    public void iAmOnHomePage() {
    }

    @And("I am accept the cookies")
    public void iAmAcceptTheCookies() {
        new HomePage().clickOnAcceptBtn();
        new HomePage().clickOnAcceptCookie();
    }

    @When("I click On the {string} menu")
    public void iClickOnTheMenu(String menuName) {
        new HomePage().selectMenu(menuName);
    }

    @Then("Verify that redirect page URL: {string}")
    public void verifyThatRedirectPageURL(String url) {
        Assert.assertEquals(driver.getCurrentUrl(),url,"User is not navigate to the menu tab");
    }


}
