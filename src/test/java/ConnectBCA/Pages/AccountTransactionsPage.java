package ConnectBCA.Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountTransactionsPage  extends PageObject {
    WebDriver driver;
    WebDriverWait wait;

    //locator
    By AccountTransactionsTitle = By.xpath("(//button[contains(@aria-label, 'Mutasi Rekening')])[1]");
    @FindBy(xpath = "(//button[contains(@aria-label, 'Mutasi Rekening')])[1]")
    WebElement mutasiButton;
    @FindBy(xpath = "//*[@id='periodselect']")
    WebElement choosePeriodButton;
    @FindBy(xpath = "//*[@id=\"periodselect\"]/option[1]")
    WebElement satuBulanPeriod;
    @FindBy(xpath = "//*[@id=\"periodselect\"]/option[2]")
    WebElement tigaMingguPeriod;
    @FindBy(xpath = "//*[@id=\"periodselect\"]/option[3]")
    WebElement duaMingguPeriod;
    @FindBy(xpath = "//*[@id=\"periodselect\"]/option[4]")
    WebElement satuMingguPeriod;
    @FindBy(xpath = "//*[@id=\"table-section\"]/div[1]/div[2]/div/div[2]/div/button")
    WebElement cariButton;
    @FindBy(xpath = "(//*[@id=\"table\"]/thead/tr)[1]")
    WebElement mutasiTable;


    public AccountTransactionsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public String setAccountTransactionsTitle(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AccountTransactionsTitle));
        return driver.findElement(AccountTransactionsTitle).getText();
    }
    public void mutasiButtonClicked(){
        mutasiButton.click();
    }
    public void ChoosePeriodButtonClicked(){
        choosePeriodButton.click();
    }
    public void setSatuBulanPeriod(){
        satuBulanPeriod.click();
    }
    public void setTigaMingguPeriod(){
        tigaMingguPeriod.click();
    }
    public void setDuaMingguPeriod(){
        duaMingguPeriod.click();
    }
    public void setSatuMingguPeriod(){
        satuMingguPeriod.click();
    }
    public void cariButtonClicked(){
        cariButton.click();
    }
    public void mutasiTableDisplayed(){
        mutasiTable.isDisplayed();
    }
}
