package DemoQA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class InteractionsPage {

    public InteractionsPage(WebDriver driver, WebDriverWait wdwait) {
        PageFactory.initElements(driver, this);
    }

   @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[5]/div/ul/li[2]/span")
   public WebElement selectable;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/ul/li[1]")
    public WebElement button1;
@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/ul/li[2]")
public WebElement button2;
@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/ul/li[3]")
public WebElement button3;
@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/ul/li[4]")
    public WebElement button4;
}