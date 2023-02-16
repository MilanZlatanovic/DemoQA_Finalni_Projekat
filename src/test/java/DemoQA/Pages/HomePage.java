package DemoQA.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public HomePage(WebDriver driver, WebDriverWait wdwait) {


        this.driver = driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver, this);
    }


    @FindBy (className="card-body")
    public List<WebElement> cards;


    public WebElement getCard(String cardName) {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getText().equals(cardName)) {
                return cards.get(i);
            }
        }
        return null;
    }

    public WebElement getElements() { return getCard("Elements"); }

 public WebElement getForms() {
        return getCard("Forms");
    }

 public WebElement getAlerts() {
        return getCard("Alerts, Frame & Windows");
    }

 public WebElement getWidgets() {
        return getCard("Widgets");
    }

 public WebElement getInteractions() {
        return getCard("Interactions");
    }

public WebElement getBookStore() {
        return getCard("Book Store Application");
    }


    public void clickOnElements() {
        getElements().click();
    }
    public void clickOnForms() {
        getForms().click();
    }
    public void clickOnAlerts() {
        getAlerts().click();
    }
    public void clickOnWidgets() {
        getWidgets().click();
    }
    public void clickOnInteractions() {
        getInteractions().click();
    }
    public void clickOnBookStore() {
        getBookStore().click();
    }












}
