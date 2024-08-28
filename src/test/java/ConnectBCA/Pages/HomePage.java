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

public class HomePage extends PageObject {
    WebDriver driver;
    WebDriverWait wait;

    //locator
    By titlePage = By.xpath("//*[@class='flex flex-col md:flex-row md:items-center']");
    @FindBy(xpath = "//button[contains(@aria-label, 'Info Saldo')]")
    WebElement infoSaldoButton;
    @FindBy(xpath = "//img[@src='/VisibilityOff.svg']")
    WebElement eyeImg;
    @FindBy(xpath = "//button[@aria-label='Sembunyikan Saldo']")
    WebElement eyeButtonShown;
    @FindBy(xpath = "//button[@aria-label='Tampilkan Saldo']")
    WebElement eyeButtonHidden;


    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //action
    public void titlePageDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(titlePage));
        driver.findElement(titlePage).isDisplayed();
    }
    public void infoSaldoButtonClicked(){
        infoSaldoButton.click();
    }
    public void infoSaldoButtonDisplayed(){
        infoSaldoButton.isDisplayed();
    }
    public void eyeImgDisplayed(){
        eyeImg.isDisplayed();
    }
    public void eyeButtonShownDisplayed(){
        eyeButtonShown.isDisplayed();
    }
    public void eyeButtonHiddenDisplayed(){
        eyeButtonHidden.isDisplayed();
    }
    public void eyeButtonShownClicked(){
        eyeButtonShown.click();
    }
    public void eyeButtonHiddenClicked(){
        eyeButtonHidden.click();
    }

}
