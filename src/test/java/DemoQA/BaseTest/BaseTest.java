package DemoQA.BaseTest;

import DemoQA.Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import java.io.IOException;
import java.time.Duration;

public class BaseTest {

   public WebDriver driver;
    public WebDriverWait wdwait;

    public HomePage homePage;
    public SidebarPage sidebarPage;
    public ElementsPage elementsPage;
    public TextBoxPage textBoxPage;
    public ExcelReader excelReader;
    public RadioButtonPage radioButtonPage;
    public ButtonsPage buttonsPage;
    public BookStorePage bookStorePage;
    public InteractionsPage interactionsPage;


    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        excelReader = new ExcelReader("C:\\Users\\Milan\\Desktop\\Finalni_Projekat.xlsx");
        buttonsPage = new ButtonsPage(driver, wdwait);
        homePage = new HomePage(driver, wdwait);
        elementsPage= new ElementsPage(driver, wdwait);
       interactionsPage= new InteractionsPage(driver,wdwait);
    }



    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void waitForVisibility(WebElement element) {
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForClickability(WebElement element) {
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }



    @AfterClass
    public void TearDown(){


    }

}
