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

public class TransferAccountPage extends PageObject {
    WebDriver driver;
    WebDriverWait wait;

    //locator
    By transferAccountTitle = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/a[4]/button");
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/a[4]/button")
    WebElement transferButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/section/div/div[2]/div/button[1]")
    WebElement chooseReciever1;
    @FindBy(xpath = "//*[@id=\"mata-uang\"]")
    WebElement nominalField;
    @FindBy(xpath = "//*[@id=\"berita\"]")
    WebElement beritaAcaraField;
    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/section/div/div[2]/button")
    WebElement lanjutButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/section/div[2]/div/div[1]/input[1]")
    WebElement pin1;
    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/section/div[2]/div/div[1]/input[2]")
    WebElement pin2;
    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/section/div[2]/div/div[1]/input[3]")
    WebElement pin3;
    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/section/div[2]/div/div[1]/input[4]")
    WebElement pin4;
    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/section/div[2]/div/div[1]/input[5]")
    WebElement pin5;
    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/section/div[2]/div/div[1]/input[6]")
    WebElement pin6;
    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/section/div[2]/div/div[2]/button[1]")
    WebElement konfirmasiButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/section/div[2]/div/div[3]/button[2]")
    WebElement unduhPDFButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div/section/div[2]/div/div[3]/button[1]")
    WebElement selesaiButton;


    public TransferAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public String setTransferAccountTitle() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(transferAccountTitle));
        return driver.findElement(transferAccountTitle).getText();
    }
    public void transferButtonClicked(){
        transferButton.click();
    }
    public void setChooseReciever1(){
        chooseReciever1.click();
    }
    public void inputNominal(String nominal) {
        nominalField.sendKeys(nominal);
    }
    public void inputBeritaAcara(String berita){
        beritaAcaraField.sendKeys(berita);
    }
    public void lanjutButtonClicked(){
        lanjutButton.click();
    }
    public void inputPin1(String pin_1) {pin1.sendKeys(pin_1);}
    public void inputPin2(String pin_2) {pin2.sendKeys(pin_2);}
    public void inputPin3(String pin_3) {pin3.sendKeys(pin_3);}
    public void inputPin4(String pin_4) {pin4.sendKeys(pin_4);}
    public void inputPin5(String pin_5) {pin5.sendKeys(pin_5);}
    public void inputPin6(String pin_6) {pin6.sendKeys(pin_6);}
    public void konfirmasiButtonClicked(){
        konfirmasiButton.click();
    }
    public void unduhPDFButtonClicked(){
        unduhPDFButton.click();
    }
    public void selesaiButtonClicked(){
        selesaiButton.click();
    }

}
