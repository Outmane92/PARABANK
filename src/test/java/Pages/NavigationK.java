package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationK  extends MyMethods {
    public NavigationK() {
        PageFactory.initElements(DriverClass.getDriver(),this);
    }
    @FindBy(css = "input[value=\"Register\"]")
    private WebElement Register;



    @FindBy(css = "input[name=\"username\"]")
    private WebElement userName;

    @FindBy(css = "input[name=\"password\"]")
    private WebElement password;
    @FindBy(css = "input[value=\"Log In\"]")
    private WebElement LogIn;

    @FindBy(css = "p[class=\"error\"]")
    private WebElement ErrorMessage;


    public WebElement getErrorMessage1() {
        return ErrorMessage1;
    }

    @FindBy(xpath= "//*[text()=\"Please enter a username and password.\"]")
    private WebElement ErrorMessage1;



    @FindBy(xpath = "//*[@id=\"leftPanel\"]/p/b")
    private WebElement successMessage;





    public WebElement getErrorMessage() {
        return ErrorMessage;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }
    public WebElement getUserName() {
        return userName;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLogIn() {
        return LogIn;
    }

    public WebElement getRegister() {
        return Register;
    }
}
