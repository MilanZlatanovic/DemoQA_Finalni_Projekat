package DemoQA.Pages;

import DemoQA.BaseTest.BaseTest;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends BaseTest {


    public TextBoxPage(WebDriver driver, WebDriverWait wdwait) {

        this.driver=driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver,this);}




    public @FindBy (id= "userName")
    WebElement Fullname;

    public @FindBy(id = "userEmail")
    WebElement UserEmail;

    public @FindBy(id = "currentAddress")
    WebElement CurrentAddrress;

    public @FindBy(id = "permanentAddress")
    WebElement PermanentAddress;

    public @FindBy(id = "submit")
    WebElement SubmitButton;

    public @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div")
    WebElement Message;


    public void insertFullName(String fullName) {

        Fullname.clear();
        Fullname.sendKeys(fullName);


    }
        public void insertUserMail (String userMail) {
        UserEmail.clear();
        UserEmail.sendKeys(userMail);


    }

    public void insertCurrentAddress (String currentAddress){
        CurrentAddrress.clear();
        CurrentAddrress.sendKeys(currentAddress);

    }

    public void insertPermanentAddress (String permanentAddress) {
        PermanentAddress.clear();
        PermanentAddress.sendKeys(permanentAddress);
    }

    public void clickSubmitButton (){
        SubmitButton.click();
    }



}
