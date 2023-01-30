package DemoQA.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {
    public WebDriver driver;
    public WebDriverWait wdwait;

WebElement Elements;
WebElement Forms;
WebElement Alerts;
WebElement Widgets;
WebElement Interactions;
WebElement BookStore;

    public WebElement getElements() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]"));

    }

    public WebElement getForms() {
        return driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards div.card.mt-4.top-card:nth-child(2) div:nth-child(1) div.avatar.mx-auto.white > svg:nth-child(1)"));
    }

    public WebElement getAlerts() {
        return driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards div.card.mt-4.top-card:nth-child(3) div:nth-child(1) div.card-body > h5:nth-child(1)"));
    }

    public WebElement getWidgets() {
        return driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards div.card.mt-4.top-card:nth-child(4) div:nth-child(1) > div.card-body"));
    }

    public WebElement getInteractions() {
        return driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards > div.card.mt-4.top-card:nth-child(5)"));
    }

    public WebElement getBookStore() {
        return driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards div.card.mt-4.top-card:nth-child(6) div:nth-child(1) div.avatar.mx-auto.white > svg:nth-child(1)"));
    }

    List<WebElement> cards;

    public HomePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

   /* public List<WebElement> getCards() {
        return driver.findElements(By.className("card-body"));
    }

    //----------------------------------

    public void clickOnElements() {
        for (int i = 0; i < getCards().size(); i++) {
            if (getCards().get(i).getText().equals("Elements")) {
                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnForms() {
        for (int i = 0; i < getCards().size(); i++) {
            if (getCards().get(i).getText().equals("Forms")) {
                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnAlerts() {
        for (int i = 0; i < getCards().size(); i++) {
            if (getCards().get(i).getText().equals("Alerts, Frame & Windows")) {
                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnWidgets() {
        for (int i = 0; i < getCards().size(); i++) {
            if (getCards().get(i).getText().equals("Widgets")) {
                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnInteractions() {
        for (int i = 0; i < getCards().size(); i++) {
            if (getCards().get(i).getText().equals("Interactions")) {
                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnBookstore() {
        for (int i = 0; i < getCards().size(); i++) {
            if (getCards().get(i).getText().equals("Book Store Application")) {

                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnCard(String cardName) {
        for (int i = 0; i < getCards().size(); i++) {
            if (getCards().get(i).getText().equals(cardName)) {
                getCards().get(i).click();
                break;
            }
        }*/
   // }
}
