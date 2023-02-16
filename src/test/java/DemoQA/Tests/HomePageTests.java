package DemoQA.Tests;

import DemoQA.BaseTest.BaseTest;
import DemoQA.Pages.HomePage;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import DemoQA.Pages.SidebarPage;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePageTests extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        homePage = new HomePage(driver, wdwait);
        sidebarPage = new SidebarPage(driver, wdwait);

    }

    @Test
    public void WebPageIsReachable(){

        String ExpectedURL = "https://demoqa.com/";
        Assert.assertEquals(driver.getCurrentUrl(),ExpectedURL);

    }

    @Test
    public void ElementsOnHomePageAreVisibleAndClickable(){

        Assert.assertTrue(homePage.getElements().isDisplayed());
        try {

            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(homePage.getElements()));
            System.out.println("Element is clickable");
        }
        catch(TimeoutException e) {
            System.out.println("Element isn't clickable");
        }
        Assert.assertTrue(homePage.getForms().isDisplayed());
        try {

            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(homePage.getForms()));
            System.out.println("Element is clickable");
        }
        catch(TimeoutException e) {
            System.out.println("Element isn't clickable");
        }
        Assert.assertTrue(homePage.getAlerts().isDisplayed());
        try {

            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(homePage.getAlerts()));
            System.out.println("Element is clickable");
        }
        catch(TimeoutException e) {
            System.out.println("Element isn't clickable");
        }
        Assert.assertTrue(homePage.getWidgets().isDisplayed());
        try {

            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(homePage.getWidgets()));
            System.out.println("Element is clickable");
        }
        catch(TimeoutException e) {
            System.out.println("Element isn't clickable");
        }
        Assert.assertTrue(homePage.getBookStore().isDisplayed());
        try {

            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(homePage.getBookStore()));
            System.out.println("Element is clickable");
        }
        catch(TimeoutException e) {
            System.out.println("Element isn't clickable");
        }
        Assert.assertTrue(homePage.getInteractions().isDisplayed());
        try {

            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(homePage.getInteractions()));
            System.out.println("Element is clickable");
        }
        catch(TimeoutException e) {
            System.out.println("Element isn't clickable");
        }
    }

    @Test
    public void ElementsButtonTakesUserToCorrectWebPage() {


        String element="Elements";

        scrollIntoView(homePage.getElements());

        homePage.getElements().click();


        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/elements");


    }


    @Test
    public void FormsButtonTakesUserToCorrectWebPage(){

        scrollIntoView(homePage.getForms());
        homePage.clickOnForms();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/forms");
    }

    @Test
    public void AlertsButtonTakesUserToCorrectWebPage(){

        scrollIntoView(homePage.getAlerts());
        homePage.clickOnAlerts();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/alertsWindows");

    }

    @Test
    public void WidgetsButtonTakesUserToCorrectWebPage(){

        scrollIntoView(homePage.getWidgets());
        homePage.clickOnWidgets();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/widgets");
    }

    @Test
    public void InteractionsButtonTakesUserToCorrectWebPage(){
        scrollIntoView(homePage.getInteractions());
        homePage.clickOnInteractions();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/interaction");
    }

    @Test
    public void BookStoreButtonTakesUserToCorrectWebPage(){
        scrollIntoView(homePage.getBookStore());
        homePage.clickOnBookStore();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/books");

    }
}