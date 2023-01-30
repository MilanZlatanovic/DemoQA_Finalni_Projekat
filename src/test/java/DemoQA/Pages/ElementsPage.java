package DemoQA.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class ElementsPage {
    public WebDriver driver;

    WebElement TextBox;
    WebElement CheckBox;
    WebElement RadioButton;
    WebElement WebTables;
    WebElement Buttons;
    WebElement Links;
    WebElement BrokenLinks;
    WebElement UploadAndDownload;
    WebElement DynamicProperties;

    public WebElement getTextBox() {


        return driver.findElement(By.cssSelector("#item-0"));
    }

    public WebElement getCheckBox() {

        return driver.findElement(By.cssSelector("#item-1"));
    }

    public WebElement getRadioButton() {

        return driver.findElement(By.cssSelector("#item-2"));
    }

    public WebElement getWebTables() {

        return driver.findElement(By.cssSelector("#item-3"));
    }

    public WebElement getButtons() {

        return driver.findElement(By.cssSelector("#item-4"));
    }

    public WebElement getLinks() {

        return driver.findElement(By.cssSelector("#item-5"));
    }

    public WebElement getBrokenLinks() {

        return driver.findElement(By.cssSelector("#item-6"));
    }

    public WebElement getUploadAndDownload() {
        return driver.findElement(By.cssSelector("#item-7"));
    }

    public WebElement getDynamicProperties() {

        return driver.findElement(By.cssSelector("#item-8"));
    }
}
