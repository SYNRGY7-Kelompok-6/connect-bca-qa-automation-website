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

public class ProfilePage extends PageObject {
    WebDriver driver;
    WebDriverWait wait;

    By profileTitle = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/a[6]/button");
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/a[6]/button")
    WebElement profileButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[1]/button")
    WebElement editButton;
    @FindBy(xpath = "//*[@id=\"address\"]")
    WebElement addressField;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[2]/button[1]")
    WebElement simpanButton;

    public ProfilePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public String setProfileTitle(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(profileTitle));
        return driver.findElement(profileTitle).getText();
    }
    public void profileButtonClicked(){
        profileButton.click();
    }
    public void editButtonClicked(){
        editButton.click();
    }
    public void inputAddress(String address){
        addressField.sendKeys(address);
    }
    public void simpanButtonClicked(){
        simpanButton.click();
    }
}
