package DemoQA.Tests.ElementsPageTests;

import DemoQA.BaseTest.BaseTest;
import DemoQA.Pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTests extends BaseTest {

    @BeforeMethod
    public void pageSetUp() throws InterruptedException {

        driver.get("https://demoqa.com/");
        //ovo dole si prebacio u beforeclass basetesta jer je preglednije a radi, vrati mu se kad skontas da je ok
       // homePage = new HomePage(driver, wdwait);
       // elementsPage= new ElementsPage(driver, wdwait);
      //  buttonsPage = new ButtonsPage(driver, wdwait);
    }

    @Test
    public void UserGetsExpectedMessageAfterDoubleClickingButton(){

        scrollIntoView(homePage.getElements());

        homePage.getElements().click();

        scrollIntoView(elementsPage.getButtons());

        elementsPage.getButtons().click();


        scrollIntoView(buttonsPage.doubleClickButton);
        buttonsPage.doubleClickDoubleClickButton();

        Assert.assertEquals(buttonsPage.doubleClickMessage.getText(), "You have done a double click");
    }

    @Test
    public void UserGetsExpectedMessageAfterRightClickingButton(){

        scrollIntoView(homePage.getElements());

        homePage.getElements().click();

        scrollIntoView(elementsPage.getButtons());

        elementsPage.getButtons().click();


        scrollIntoView(buttonsPage.rightClickButton);
        buttonsPage.rightClickRightClickButton();

        Assert.assertEquals(buttonsPage.rightClickMessage.getText(), "You have done a right click");
    }
    @Test
    public void UserGetsExpectedMessageAfterClickingButton(){

        scrollIntoView(homePage.getElements());

        homePage.getElements().click();

        scrollIntoView(elementsPage.getButtons());

        elementsPage.getButtons().click();


        scrollIntoView(buttonsPage.clickButton);
        buttonsPage.clickClickButton();

        Assert.assertEquals(buttonsPage.clickMessage.getText(), "You have done a dynamic click");
    }
}
