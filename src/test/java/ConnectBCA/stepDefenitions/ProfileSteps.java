package ConnectBCA.stepDefenitions;

import ConnectBCA.BaseTest;
import ConnectBCA.Pages.ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ProfileSteps extends BaseTest {
    WebDriver driver;
    ProfilePage profilePage;
    WebDriverWait wait;

    public ProfileSteps(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.profilePage = new ProfilePage(driver);
    }

    @Then("User click Profile page")
    public void User_click_Profile_page(){
        profilePage.profileButtonClicked();
    }
    @And("User already in Profile page")
    public void User_already_in_Profile_page(){
        Assert.assertEquals(profilePage.setProfileTitle(), "Profile");
    }
    @Given("User click Edit button")
    public void User_click_Edit_button(){
        profilePage.editButtonClicked();
    }
    @And("User fill address with {string}")
    public void User_fill_address(String address){
        profilePage.inputAddress(address);
    }
    @Then("User click Simpan button")
    public void User_click_Simpan_button(){
        profilePage.simpanButtonClicked();
    }
}
