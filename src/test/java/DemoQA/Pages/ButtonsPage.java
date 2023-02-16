package DemoQA.Pages;

import DemoQA.BaseTest.BaseTest;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage {

    //ctions action = new Actions(driver);
    Actions action;

    public ButtonsPage(WebDriver driver, WebDriverWait wdwait) {

      /*  this.driver = driver;
        this.wdwait = wdwait;*/
        action=new Actions(driver);

        PageFactory.initElements(driver, this);
    }


    public @FindBy(id = "doubleClickBtn")
    WebElement doubleClickButton;

    public @FindBy(id = "rightClickBtn")
    WebElement rightClickButton;

    public @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/button[1]")
    WebElement clickButton;

    public @FindBy(id = "doubleClickMessage")
    WebElement doubleClickMessage;
    public @FindBy(id = "rightClickMessage")
    WebElement rightClickMessage;
    public @FindBy(id = "dynamicClickMessage")
    WebElement clickMessage;


    public void doubleClickDoubleClickButton(){
        action.doubleClick(doubleClickButton).perform();
    }

    public void rightClickRightClickButton(){
        action.contextClick(rightClickButton).perform();
    }

    public void clickClickButton(){
        clickButton.click();
    }

    public void goToButtonsPage(){




    }
}