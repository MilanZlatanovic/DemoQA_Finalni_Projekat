package DemoQA.Tests;

import DemoQA.BaseTest.BaseTest;
import DemoQA.Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BookStoreTests extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        homePage = new HomePage(driver, wdwait);
        elementsPage= new ElementsPage(driver, wdwait);
        bookStorePage= new BookStorePage(driver, wdwait);
        sidebarPage = new SidebarPage(driver, wdwait);
        textBoxPage = new TextBoxPage(driver, wdwait);

    }
 @Test

 public void UserCanRegisterWithValidCredentials() throws InterruptedException {

     scrollIntoView(homePage.getElements());

     scrollIntoView(homePage.getBookStore());

     homePage.getBookStore().click();


     Thread.sleep(3000);
     scrollIntoView(bookStorePage.login);
     bookStorePage.login.click();
     bookStorePage.newUserButton.click();

     String firstName = excelReader.getStringData("BookStoreNewUser", 1, 0);
     String lastName = excelReader.getStringData("BookStoreNewUser", 1,1);
     String userName = excelReader.getStringData("BookStoreNewUser",1,2);
     String password = excelReader.getStringData("BookStoreNewUser",1,3);
     bookStorePage.insertFirstName(firstName);
     bookStorePage.insertLastName(lastName);
     bookStorePage.insertUserName(userName);
     bookStorePage.insertPassword(password);

     wdwait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
     scrollIntoView(bookStorePage.recaptcha);
     wdwait.until(ExpectedConditions.elementToBeClickable(By.id("recaptcha-anchor-label"))).click();
     //Recaptcha, ovde test staje kada ti daje slike
 }
 @Test
    public void UserCanLogInWithValidCredentials() throws InterruptedException {
        scrollIntoView(homePage.getElements());

        scrollIntoView(homePage.getBookStore());

        homePage.getBookStore().click();


        Thread.sleep(3000);
        scrollIntoView(bookStorePage.login);
        bookStorePage.login.click();
        String userName = excelReader.getStringData("BookStoreLogin", 1, 0);
        String passwrod = excelReader.getStringData("BookStoreLogin", 1,1);

        bookStorePage.insertUserName(userName);
        bookStorePage.insertPassword(passwrod);
        scrollIntoView( bookStorePage.login);
        bookStorePage.login.click();
        Thread.sleep(3000);
     Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/books" );
    }

    @Test
    public void UserCantLogInWithInvalidUsername() throws InterruptedException {

        scrollIntoView(homePage.getElements());

        scrollIntoView(homePage.getBookStore());

        homePage.getBookStore().click();


        Thread.sleep(3000);
        scrollIntoView(bookStorePage.login);
        bookStorePage.login.click();
        String userName = excelReader.getStringData("BookStoreLogin", 1, 2);
        String passwrod = excelReader.getStringData("BookStoreLogin", 1,1);

        bookStorePage.insertUserName(userName);
        bookStorePage.insertPassword(passwrod);
        scrollIntoView( bookStorePage.login);
        bookStorePage.login.click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/login" );
        Assert.assertEquals(bookStorePage.invalidLoginMessage.getText(), "Invalid username or password!");
    }
    @Test
    public void UserCantLogInWithInvalidPassword() throws InterruptedException {

        scrollIntoView(homePage.getElements());

        scrollIntoView(homePage.getBookStore());

        homePage.getBookStore().click();


        Thread.sleep(3000);
        scrollIntoView(bookStorePage.login);
        bookStorePage.login.click();
        String userName = excelReader.getStringData("BookStoreLogin", 1, 0);
        String passwrod = excelReader.getStringData("BookStoreLogin", 1,3);

        bookStorePage.insertUserName(userName);
        bookStorePage.insertPassword(passwrod);
        scrollIntoView( bookStorePage.login);
        bookStorePage.login.click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/login" );
        Assert.assertEquals(bookStorePage.invalidLoginMessage.getText(), "Invalid username or password!");
    }


}
