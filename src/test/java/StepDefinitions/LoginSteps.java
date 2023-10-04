package StepDefinitions;

import Pages.Navigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginSteps {
    Navigation navigation= new Navigation();


    @And("I should be Logged successfully")
    public void iShouldBeLoggedSuccessfully() {
    }

    @Then("I enter {string}as username and {string}as password and click on login button")
    public void iEnterAsUsernameAndAsPasswordAndClickOnLoginButton(String username, String password) {
        navigation.sendKeysMethod(navigation.usernameLogin,"Mitch123");
        navigation.sendKeysMethod(navigation.passwordLogin,"Mitch123");
        navigation.clickMethod(navigation.LoginBtn);
    }

    @Then("I enter{string} and{string}and click on login button")
    public void iEnterAndAndClickOnLoginButton(String username, String password) {

        navigation.sendKeysMethod(navigation.usernameLogin,"SAM123");
        navigation.sendKeysMethod(navigation.passwordLogin,"Markqwe1");
        navigation.clickMethod(navigation.LoginBtn);

    }

    @And("the {string} should display")
    public void theShouldDisplay(String ActualMsg) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(navigation.ErrorMsg.getText().contains(ActualMsg));
    }
    }

