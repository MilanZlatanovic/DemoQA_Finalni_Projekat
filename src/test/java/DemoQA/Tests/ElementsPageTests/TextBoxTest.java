package DemoQA.Tests.ElementsPageTests;

import DemoQA.Pages.TextBoxPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import DemoQA.BaseTest.BaseTest;
import DemoQA.Pages.ElementsPage;
import DemoQA.Pages.HomePage;
import DemoQA.Pages.SidebarPage;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;


public class TextBoxTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        homePage = new HomePage(driver, wdwait);
        elementsPage= new ElementsPage(driver, wdwait);
        sidebarPage = new SidebarPage(driver, wdwait);
        textBoxPage = new TextBoxPage(driver, wdwait);
    }

    @Test
    public void TextBoxHappyFlow() throws InterruptedException {

        scrollIntoView(homePage.getElements());

        homePage.getElements().click();

        elementsPage.getTextBox().click();

        Thread.sleep(3000);


      String fullName = excelReader.getStringData("TextBox", 1, 0);
      String email = excelReader.getStringData("TextBox", 1,1);
      String currentAddress = excelReader.getStringData("TextBox",1,2);
      String permanentAddress = excelReader.getStringData("TextBox",1,3);
      textBoxPage.insertFullName(fullName);
      textBoxPage.insertUserMail(email);
      textBoxPage.insertCurrentAddress(currentAddress);
      textBoxPage.insertPermanentAddress(permanentAddress);
      scrollIntoView(textBoxPage.SubmitButton);
      textBoxPage.clickSubmitButton();

      String expectedMessage = "Name:Stevan Stevanovic\n" +
              "Email:stevan@email.com\n" +
              "Current Address :Stevana Sremca 6\n" +
              "Permananet Address :Stevana Sremca 6";

     String message = textBoxPage.Message.getText();

    Assert.assertEquals(message, expectedMessage);



    }

}
