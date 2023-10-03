package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation extends MyMethods {

    public Navigation() {
        PageFactory.initElements(DriverClass.getDriver(),this);
    }
   @FindBy(linkText = "Register")
        public WebElement registerLink;

        @FindBy(xpath ="//input[@id='customer.firstName']")
             public WebElement firstName;


       @FindBy (xpath = "//p[contains(text(),'Your account was created successfully')]")
        public WebElement successMessage;

    @FindBy (css =  "Input[name='username']")
    public WebElement usernameLogin;

    @FindBy (css = "Input[name='password']")
            public WebElement passwordLogin;

            @FindBy(css= "Input[value='Log In']")
            public WebElement LoginBtn;

            @FindBy(xpath = "//div[@id=\"rightPanel\"]/p")
             public WebElement ErrorMsg;

}
