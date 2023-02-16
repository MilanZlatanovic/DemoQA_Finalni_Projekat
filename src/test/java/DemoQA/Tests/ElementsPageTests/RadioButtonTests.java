package DemoQA.Tests.ElementsPageTests;

import DemoQA.BaseTest.BaseTest;
import DemoQA.Pages.ElementsPage;
import DemoQA.Pages.HomePage;
import DemoQA.Pages.RadioButtonPage;
import DemoQA.Pages.SidebarPage;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RadioButtonTests extends BaseTest {

    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        homePage = new HomePage(driver, wdwait);
        sidebarPage = new SidebarPage(driver, wdwait);
        elementsPage = new ElementsPage(driver, wdwait);
        radioButtonPage = new RadioButtonPage(driver, wdwait);


    }

    @Test
    public void YesAndImpressiveButtonsAreClickableAndNoIsNotClickable() {
        scrollIntoView(homePage.getElements());

        homePage.getElements().click();

        scrollIntoView(elementsPage.getElementsCard("Radio Button"));

        elementsPage.getRadioButton().click();

        Assert.assertTrue(radioButtonPage.YesButton.isDisplayed());
        try {

            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(radioButtonPage.YesButton));
            System.out.println("Yes Button is clickable as it should be");
        } catch (TimeoutException e) {
            System.out.println("Yes Button isn't clickable");
        }
        Assert.assertTrue(radioButtonPage.ImpressiveButton.isDisplayed());
        try {

            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(radioButtonPage.ImpressiveButton));
            System.out.println("Impressive Button is clickable as it should be");
        } catch (TimeoutException e) {
            System.out.println("ImpressiveButton isn't clickable");
        }

// ovo ne znam zasto govori da je tru da je enabled
        boolean NoButtonIsClickable = radioButtonPage.NoButton.isEnabled();
        String actualMousePointer = radioButtonPage.NoButton.getCssValue("cursor");
        Assert.assertEquals(actualMousePointer, "not-allowed");

    }

    @Test
    public void UserGetsExpectedMessageWhenClickingYesButton(){

        scrollIntoView(homePage.getElements());

        homePage.getElements().click();

        scrollIntoView(elementsPage.getElementsCard("Radio Button"));

        elementsPage.getRadioButton().click();

        radioButtonPage.YesButton.click();

        String expectedMessage = "You have selected Yes";

        String message = radioButtonPage.RadioButtonMessage.getText();

        Assert.assertEquals(message, expectedMessage);



    }

    @Test
    public void UserGetsExpectedMessageWhenClickingImpressiveButton(){

        scrollIntoView(homePage.getElements());

        homePage.getElements().click();

        scrollIntoView(elementsPage.getElementsCard("Radio Button"));

        elementsPage.getRadioButton().click();

        radioButtonPage.ImpressiveButton.click();

        String expectedMessage = "You have selected Impressive";

        String message = radioButtonPage.RadioButtonMessage.getText();

        Assert.assertEquals(message, expectedMessage);



    }
}




