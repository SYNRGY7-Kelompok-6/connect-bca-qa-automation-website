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

public class QrisPage extends PageObject {
    WebDriver driver;
    WebDriverWait wait;

    //locator
    By qrisTitle = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/a[5]/button");
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/a[5]/button")
    WebElement qrisButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/body/div/div[2]/div[3]/div/div[1]/img")
    WebElement qrCodeImg;
    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/div/div/div/a[2]")
    WebElement qrisBayarButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/body/div/div/button")
    WebElement lanjutkanButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/body/div/div[2]/div[2]/img")
    WebElement qrCodeBayarImg;
    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/body/div/div[2]/div/button")
    WebElement simpanButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/body/div/div[2]/div/div[3]")
    WebElement nominalErrorMsg;

    public QrisPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public String setQrisTitle() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(qrisTitle));
        return driver.findElement(qrisTitle).getText();
    }
    public void qrisButtonClicked(){
        qrisButton.click();
    }
    public void qrCodeImgDisplayed(){
        qrCodeImg.isDisplayed();
    }
    public void qrisBayarButtonClicked(){
        qrisBayarButton.click();
    }
    public void lanjutkanButtonClicked(){
        lanjutkanButton.click();
    }
    public void qrCodeBayarImgDisplayed(){
        qrCodeBayarImg.isDisplayed();
    }
    public void simpanButtonClicked(){
        simpanButton.click();
    }
    public String setNominalErrorMsg(){
        return nominalErrorMsg.getText();
    }

}
