package ConnectBCA.stepDefenitions;

import ConnectBCA.BaseTest;
import ConnectBCA.Pages.QrisPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class QrisSteps extends BaseTest {
    WebDriver driver;
    QrisPage qrisPage;
    WebDriverWait wait;

    public QrisSteps(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.qrisPage = new QrisPage(driver);
    }

    @Then("User click Qris page")
    public void User_click_Qris_page(){
        qrisPage.qrisButtonClicked();
    }
    @And("User already in Qris page")
    public void User_already_in_Qris_page(){
        Assert.assertEquals(qrisPage.setQrisTitle(), "Qris");
    }
    @Then("User see or hear the QR code")
    public void User_see_or_hear_the_QR_code(){
        qrisPage.qrCodeImgDisplayed();
    }
    @Given("User click Qris Bayar Button")
    public void User_click_Qris_Bayar_Button(){
        qrisPage.qrisBayarButtonClicked();
    }
    @And("User Click Simpan Button")
    public void User_Click_Simpan_Button(){
        qrisPage.simpanButtonClicked();
    }

    @And("User Click lanjutkan Button")
    public void User_Click_lanjutkan_Button(){
        qrisPage.lanjutkanButtonClicked();
    }
    @And("User see or hear the QR code payment")
    public void User_see_or_hear_the_QR_code_payment(){
        qrisPage.qrCodeBayarImgDisplayed();
    }
    @And("User receive nominal transaction error message")
    public void User_receive_nominal_transaction_error_message(){
        qrisPage.setNominalErrorMsg();
    }


}
