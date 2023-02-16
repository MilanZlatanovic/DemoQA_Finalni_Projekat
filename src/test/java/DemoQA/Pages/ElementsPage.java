package DemoQA.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ElementsPage {


    WebElement TextBox;
    WebElement CheckBox;
    WebElement RadioButton;
    WebElement WebTables;
    WebElement Buttons;
    WebElement Links;
    WebElement BrokenLinks;
    WebElement UploadAndDownload;
    WebElement DynamicProperties;

    public WebDriver driver;
    public WebDriverWait wdwait;

    public ElementsPage(WebDriver driver, WebDriverWait wdwait) {


        this.driver = driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver,this);
    }




    @FindBy (className = "text")
    public List<WebElement> elementsCards;

    public WebElement getElementsCard(String elementsCardName) {
        for (int i = 0; i < elementsCards.size(); i++) {
            if (elementsCards.get(i).getText().equals(elementsCardName)) {
                return elementsCards.get(i);
            }
        }
        return null;
    }

     public WebElement getTextBox() {
        return getElementsCard("Text Box");
    }
     public WebElement getCheckBox() {
        return getElementsCard("Check Box");
    }
     public WebElement getRadioButton() {
        return getElementsCard("Radio Button");
    }
     public WebElement getWebTables() {
        return getElementsCard("Web Tables");
    }
     public WebElement getButtons() {
        return getElementsCard("Buttons");
    }
     public WebElement getLinks() {
        return getElementsCard("Links");
    }
     public WebElement getBrokenLinks() {
        return getElementsCard("Broken Links - Images");
    }
     public WebElement getUploadAndDownload() {
        return getElementsCard("Upload and Download");
    }
     public WebElement getDynamicProperties() {return getElementsCard("Dynamic Properties");
    }



 }







