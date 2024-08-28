package ConnectBCA.stepDefenitions;

import ConnectBCA.BaseTest;
import ConnectBCA.Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageSteps extends BaseTest {
    WebDriver driver;
    HomePage homePage;
    WebDriverWait wait;

    public HomePageSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.homePage = new HomePage(driver);
    }
    @Then("User click info saldo page")
    public void User_click_info_saldopage(){
        homePage.infoSaldoButtonClicked();
    }
    @And("User already in info saldo page")
    public void User_already_in_info_saldopage(){
        homePage.infoSaldoButtonDisplayed();
        homePage.eyeImgDisplayed();
    }
    @Given("User click eye button beside total balance to reveal")
    public void User_click_eye_button_beside_total_balance_to_reveal(){
        homePage.eyeButtonHiddenClicked();
    }
    @Then("User see or hear Total balance user that displayed on info saldo page")
    public void User_see_or_hear_Total_balance_user_that_displayed_on_info_saldo_page(){
        homePage.eyeButtonShownDisplayed();
    }
    @Given("User click eye button beside total balance to hide")
    public void User_click_eye_button_beside_total_balance_to_hide(){
        homePage.eyeButtonShownClicked();
    }
    @Then("User do not see or hear Total balance user that displayed on info saldo page")
    public void User_do_not_see_or_hear_Total_balance_user_that_displayed_on_info_saldo_page(){
        homePage.eyeButtonHiddenDisplayed();
    }


}
