package DemoQA.Tests.ElementsPageTests;
import DemoQA.BaseTest.BaseTest;
import DemoQA.Pages.ElementsPage;
import DemoQA.Pages.HomePage;
import DemoQA.Pages.SidebarPage;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ElementsPageTests extends BaseTest {

    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        homePage = new HomePage(driver, wdwait);
        sidebarPage = new SidebarPage(driver, wdwait);
        elementsPage= new ElementsPage(driver, wdwait);


    }


@Test
    public void TextBoxButtonTakesUserToAppropriateWebPage() throws InterruptedException {

        scrollIntoView(homePage.getElements());
        homePage.getElements().click();
        elementsPage.getTextBox().click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/text-box");
}
@Test
    public void CheckBoxTakesUserToAppropriateWebPage() throws InterruptedException {

        scrollIntoView(homePage.getElements());
        homePage.getElements().click();
        elementsPage.getCheckBox().click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/checkbox");
}
@Test
    public void RadioButtonTakesUserToAppropriateWebPage() throws InterruptedException {

        scrollIntoView(homePage.getElements());
        homePage.getElements().click();
        elementsPage.getRadioButton().click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/radio-button");
}
@Test
    public void WebTablesTakesUserToAppropriateWebPage() throws InterruptedException {

        scrollIntoView(homePage.getElements());
        homePage.getElements().click();
        scrollIntoView(elementsPage.getWebTables());
        elementsPage.getWebTables().click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/webtables");
}@Test
    public void ButtonsTakesUserToAppropriateWebPage() throws InterruptedException {

        scrollIntoView(homePage.getElements());
        homePage.getElements().click();
        scrollIntoView( elementsPage.getButtons());
        elementsPage.getButtons().click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/buttons");
}@Test
    public void LinksTakesUserToAppropriateWebPage() throws InterruptedException {

        scrollIntoView(homePage.getElements());
        homePage.getElements().click();
        scrollIntoView(elementsPage.getLinks());
        elementsPage.getLinks().click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/links");
}@Test
    public void BrokenLinksTakesUserToAppropriateWebPage() throws InterruptedException {

        scrollIntoView(homePage.getElements());
        homePage.getElements().click();
        scrollIntoView(elementsPage.getBrokenLinks());
        elementsPage.getBrokenLinks().click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/broken");
}@Test
    public void UlpoadLinksTakesUserToAppropriateWebPage() throws InterruptedException {

        scrollIntoView(homePage.getElements());
        homePage.getElements().click();
        scrollIntoView(elementsPage.getUploadAndDownload());
        elementsPage.getUploadAndDownload().click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/upload-download");
}@Test
    public void DynamicButtonTakesUserToAppropriateWebPage() throws InterruptedException {

        scrollIntoView(homePage.getElements());
        homePage.getElements().click();
        scrollIntoView(elementsPage.getDynamicProperties());
        elementsPage.getDynamicProperties().click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/dynamic-properties");
}


}
