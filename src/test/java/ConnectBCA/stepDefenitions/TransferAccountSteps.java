package ConnectBCA.stepDefenitions;

import ConnectBCA.BaseTest;
import ConnectBCA.Pages.TransferAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TransferAccountSteps extends BaseTest {
    WebDriver driver;
    TransferAccountPage transferAccountPage;
    WebDriverWait wait;

    public TransferAccountSteps(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.transferAccountPage = new TransferAccountPage(driver);
    }
    @Then("User click Transfer page")
    public void User_click_Transfer_page(){
        transferAccountPage.transferButtonClicked();
    }
    @And("User already in Transfer page")
    public void User_already_in_Transfer_page(){
        Assert.assertEquals(transferAccountPage.setTransferAccountTitle(), "Transfer");
    }
    @Given("User choose user from Daftar Transfer")
    public void User_choose_user_from_Daftar_Transfer(){
        transferAccountPage.setChooseReciever1();
    }
    @And("User fill {string} as mata uang and nominal transfer tujuan")
    public void User_fill_15000_as_mata_uang_and_nominal_transfer_tujuan(String nominal){
        transferAccountPage.inputNominal(nominal);
    }
    @And("User {string} as berita acara")
    public void input_berita_acara(String berita){
        transferAccountPage.inputBeritaAcara(berita);
    }
    @Then("User click Lanjut button")
    public void User_click_Lanjut_button(){
        transferAccountPage.lanjutButtonClicked();
    }
    @And("click Lanjut button")
    public void click_Lanjut_button(){
        transferAccountPage.lanjutButtonClicked();
    }
    @And("User fill 123456 as a pin")
    public void user_fill_pin(){
        transferAccountPage.inputPin1("1");
        transferAccountPage.inputPin2("2");
        transferAccountPage.inputPin3("3");
        transferAccountPage.inputPin4("4");
        transferAccountPage.inputPin5("5");
        transferAccountPage.inputPin6("6");
    }
    @And("user click konfirmasi button")
    public void user_click_konfirmasi_button(){
        transferAccountPage.konfirmasiButtonClicked();
    }
    @And("User click Unduh PDF Button")
    public void User_click_Unduh_PDF_Button(){
        transferAccountPage.unduhPDFButtonClicked();
    }
    @And("User click Selesai Button")
    public void User_click_Selesai_Button(){
        transferAccountPage.selesaiButtonClicked();
    }

}
