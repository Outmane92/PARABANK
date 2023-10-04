package StepDefinitions;

import Pages.Navigation;
import Pages.NavigationK;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class _02_LoginWithInValidDate {
    NavigationK navigationk = new NavigationK();


    @And("Click on Login Button")
    public void clickOnLoginButton() {
        navigationk.clickMethod(navigationk.getLogIn());
    }

    @Then("Unsuccessful Input Should Be Displayed")
    public void unsuccessfulInputShouldBeDisplayed() {
        Assert.assertEquals(navigationk.getErrorMessage().getText(), "The username and password could not be verified.");
    }



    @And("Enter Invalid first Username")
    public void enterInvalidFirstUsername() {
        navigationk.sendKeysMethod(navigationk.getUserName(),"");
    }

    @And("Enter Invalid first Password")
    public void enterInvalidFirstPassword() {
        navigationk.sendKeysMethod(navigationk.getPassword(),"");
    }



    @Then("First Unsuccessful Input Should Be Displayed")
    public void firstUnsuccessfulInputShouldBeDisplayed() {
        Assert.assertEquals(navigationk.getErrorMessage1().getText(), "Please enter a username and password.");
    }



    @And("Enter Invalid  Password")
    public void enterInvalidPassword() {

        navigationk.sendKeysMethod(navigationk.getPassword(),"12345");
    }

    @And("Enter Invalid  Username")
    public void enterInvalidUsername() {
        navigationk.sendKeysMethod(navigationk.getUserName(),"admin");
    }

}
