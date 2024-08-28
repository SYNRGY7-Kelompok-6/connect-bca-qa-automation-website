package ConnectBCA.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends PageObject {
    WebDriver driver;
    WebDriverWait wait;

    //locator
    By userIDField = By.id("userID");
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(xpath = "//button[@aria-label='Tombol masuk akun']")
    WebElement loginButton;
    @FindBy(xpath = "(//*[@class='text-secondary-red text-sm font-medium'])[1]")
    WebElement emptyUserIDMsg;
    @FindBy(xpath = "(//*[@class='text-secondary-red text-sm font-medium'])[2]")
    WebElement emptyUserPasswordMsg;
    @FindBy(xpath = "//button[@aria-label='Tombol menghapus semua isian di kolom']")
    WebElement resetButton;
    @FindBy(xpath = "//button[@aria-label='Tombol ulangi']")
    WebElement repeatButton;
    @FindBy(xpath = "//*[@class='text-neutral-9 text-base font-semibold']")
    WebElement errorMsg;
    @FindBy(xpath = "//*[@alt='Logo Connect by BCA']")
    WebElement logoConnectBCA;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    //action
    public void inputUserID(String userID){
        wait.until(ExpectedConditions.visibilityOfElementLocated(userIDField));
        driver.findElement(userIDField).sendKeys(userID);
    }

    public void inputPassword (String password) {
        passwordField.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }
    public void clickResetButton(){
        resetButton.click();
    }
    public void clickRepeatButton(){
        repeatButton.click();
    }
    public void repeatButtonDisplayed(){
        repeatButton.isDisplayed();
    }
    public String setEmptyUserIDMsg(){
        return emptyUserIDMsg.getText();
    }
    public String setEmptyUserPasswordMsg(){
        return emptyUserPasswordMsg.getText();
    }
    public String setErrorMsg(){
        return errorMsg.getText();
    }
    public void stayInTheLoginPage(){
        loginButton.isDisplayed();
    }
    public void logoConnectBCADisplayed(){
        logoConnectBCA.isDisplayed();
    }
}
