package DemoQA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStorePage {

    public BookStorePage(WebDriver driver, WebDriverWait wdwait) {
        PageFactory.initElements(driver, this);
    }


    public @FindBy(id = "login")
    WebElement login;
    public @FindBy(id = "newUser")
    WebElement newUserButton;
    public @FindBy(id= "Register")
    WebElement registerButton;
    public @FindBy(id = "gotologin")
    WebElement backToLogin;
    public @FindBy(id = "item-2")
    WebElement bookStore;
    public @FindBy(id = "item-3")
    WebElement profile;
    public @FindBy(id = "firstname")
    WebElement firstNameField;
    public @FindBy(id = "lastname")
    WebElement lastnameField;
    public @FindBy(id = "userName")
    WebElement userNameField;
    public @FindBy(id = "password")
    WebElement passwordField;
    public @FindBy(id = "recaptcha-anchor-label")
    WebElement recaptcha;
    public @FindBy(id= "name")
    WebElement invalidLoginMessage;

    public void insertFirstName(String firstName) {

        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }

    public void insertLastName(String lastName) {
        lastnameField.clear();
        lastnameField.sendKeys(lastName);
    }
    public void insertUserName(String userName) {
       userNameField.clear();
        userNameField.sendKeys(userName);
    }
    public void insertPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void checkIAmNotRobotField(){
        recaptcha.click();
    }
}
