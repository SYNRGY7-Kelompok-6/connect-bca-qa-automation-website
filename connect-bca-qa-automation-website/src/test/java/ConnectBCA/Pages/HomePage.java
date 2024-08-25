package ConnectBCA.Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends PageObject {
    WebDriver driver;
    WebDriverWait wait;

    //locator
    By titlePage = By.xpath("//*[@class='flex flex-col md:flex-row md:items-center']");

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

}
