package ConnectBCA.stepDefenitions;

import ConnectBCA.BaseTest;
import ConnectBCA.Pages.HomePage;
import ConnectBCA.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginSteps extends BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    WebDriverWait wait;

    public LoginSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.loginPage = new LoginPage(driver);  // Initialize loginPage here
        this.homePage = new HomePage(driver);    // Initialize homePage here
    }
    @Given("User already in login page")
    public void User_already_in_login_page(){
        loginPage.logoConnectBCADisplayed();
        loginPage.stayInTheLoginPage();
    }
    @And("User input userID with {string}")
    public void User_input_userID(String userID){
        loginPage.inputUserID(userID);
    }
    @And("User input password with {string}")
    public void User_input_password(String password){
        loginPage.inputPassword(password);
    }
    @When("User click login button")
    public void User_click_login_button(){
        loginPage.clickLoginButton();
    }
    @Then("User is on Home Page")
    public void User_is_on_Home_Page(){
        homePage.titlePageDisplayed();
    }
    @Then("User get Error message")
    public void User_get_Error_message(){
        loginPage.setErrorMsg();
        Assert.assertEquals(loginPage.setErrorMsg(), "User ID / Kata Sandi yang Anda masukkan tidak sesuai. Mohon masukkan User ID / Kata Sandi Anda dengan benar.");
    }
    @And("user click repeat button")
    public void user_click_repeat_button(){
        loginPage.clickRepeatButton();
    }
    @And("user click reset button")
    public void user_click_reset_button(){
        loginPage.clickResetButton();
    }
    @And("user stay in login page")
    public void user_stay_in_login_page(){
        loginPage.logoConnectBCADisplayed();
        loginPage.stayInTheLoginPage();
    }
    @Then("User get Error userID message")
    public void User_get_Error_userID_message(){
        loginPage.setEmptyUserIDMsg();
        Assert.assertEquals(loginPage.setEmptyUserIDMsg(), "User ID tidak boleh kosong.");
    }
    @Then("User get Error Password message")
    public void User_get_Error_password_message(){
        Assert.assertEquals(loginPage.setEmptyUserPasswordMsg(), "Password harus lebih dari 8 karakter.");
    }
}