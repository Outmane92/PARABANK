package StepDefinitions;

import Pages.Navigation;
import Utilities.DriverClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class RegisterSteps {
    Navigation navigation = new Navigation();
    @Given("I navigate to bank application")
    public void iNavigateToBankApplication() {
        DriverClass.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Then("I click on register link")
    public void iClickOnRegisterLink() {
       navigation.clickMethod(navigation.registerLink);

    }

    @And("I fill the form and I click on Register button")
    public void iFillTheFormAndIClickOnRegisterButton(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        navigation.sendKeysMethod(navigation.firstName,
                data.get(0).get(1)+ Keys.TAB+data.get(1).get(1)
                        + Keys.TAB+data.get(2).get(1)+ Keys.TAB+data.get(3).get(1)+
                        Keys.TAB+data.get(4).get(1)+
                        Keys.TAB+data.get(5).get(1)+
                        Keys.TAB+data.get(6).get(1)
                        + Keys.TAB+data.get(7).get(1)+
                        Keys.TAB+data.get(8).get(1)+
                        Keys.TAB+data.get(9).get(1)+
                        Keys.TAB+data.get(9).get(1)+Keys.ENTER);
    }

    @Then("the message {string} was displayed")
    public void theMessageWasDisplayed(String ActualMsg) {

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(navigation.successMessage.getText().contains(ActualMsg));
    }
}
