package DemoQA.Tests;

import DemoQA.BaseTest.BaseTest;
import DemoQA.Pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class InteractionsTests extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
       homePage = new HomePage(driver, wdwait);
       elementsPage= new ElementsPage(driver, wdwait);
       interactionsPage= new InteractionsPage(driver,wdwait);

    }

    @Test
    public void InteractionsButtonsAreSelectedWhenClickedOn(){

        scrollIntoView(homePage.getElements());

        scrollIntoView(homePage.getInteractions());

        homePage.getInteractions().click();
        scrollIntoView( interactionsPage.selectable);
        interactionsPage.selectable.click();


       interactionsPage.button1.click();
       interactionsPage.button2.click();
       interactionsPage.button3.click();
       interactionsPage.button4.click();

        Assert.assertEquals(interactionsPage.button1.getAttribute("Class"), "mt-2 list-group-item active list-group-item-action");
        Assert.assertEquals(interactionsPage.button2.getAttribute("Class"), "mt-2 list-group-item active list-group-item-action");
        Assert.assertEquals(interactionsPage.button3.getAttribute("Class"), "mt-2 list-group-item active list-group-item-action");
        Assert.assertEquals(interactionsPage.button4.getAttribute("Class"), "mt-2 list-group-item active list-group-item-action");


    }
}
