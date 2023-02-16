package DemoQA.Pages;

import DemoQA.BaseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage extends BaseTest {

    public RadioButtonPage(WebDriver driver, WebDriverWait wdwait) {

        this.driver=driver;
        this.wdwait = wdwait;
        PageFactory.initElements(driver,this);}

     public @FindBy (css = "div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div:nth-child(2) div.custom-control.custom-radio.custom-control-inline:nth-child(2) > label.custom-control-label")
     WebElement YesButton;

    public @FindBy (css = "div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div:nth-child(2) div.custom-control.custom-radio.custom-control-inline:nth-child(3) > label.custom-control-label")
    WebElement ImpressiveButton;

    public @FindBy(css = "div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div:nth-child(2) > div.custom-control.disabled.custom-radio.custom-control-inline:nth-child(4)")
    WebElement NoButton;

    public @FindBy(css = "div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div:nth-child(2) > p.mt-3:nth-child(5)")
    WebElement RadioButtonMessage;



    public void clickYesButton () {
        YesButton.click();

    }

    public void clickImpressiveButton(){
        ImpressiveButton.click();
    }



}
