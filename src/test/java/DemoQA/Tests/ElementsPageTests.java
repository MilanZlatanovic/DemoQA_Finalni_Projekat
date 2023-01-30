package DemoQA.Tests;

import DemoQA.BaseTest.DemoQABaseTest;
import DemoQA.Pages.HomePage;
import DemoQA.Pages.SidebarPage;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ElementsPageTests extends DemoQABaseTest {

    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        homePage = new HomePage(driver, wdwait);
        sidebarPage = new SidebarPage(driver, wdwait);


    }


    @Test
    public void ElementsOnElementsPageAreVisibleAndClickable(){

        homePage.getElements().click();

            Assert.assertTrue(elementsPage.getTextBox().isDisplayed());
            try {

                new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(elementsPage.getTextBox()));
                System.out.println("Element is clickable");
            }
            catch(TimeoutException e) {
                System.out.println("Element isn't clickable");
            }

    }



}
