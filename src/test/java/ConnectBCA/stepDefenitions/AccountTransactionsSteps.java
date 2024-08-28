package ConnectBCA.stepDefenitions;

import ConnectBCA.BaseTest;
import ConnectBCA.Pages.AccountTransactionsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AccountTransactionsSteps extends BaseTest {
    WebDriver driver;
    AccountTransactionsPage accountTransactionsPage;
    WebDriverWait wait;

    public AccountTransactionsSteps(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.accountTransactionsPage = new AccountTransactionsPage(driver);
    }
    @Then("User click Mutasi Rekening page")
    public void User_click_Mutasi_Rekening_page(){
        accountTransactionsPage.mutasiButtonClicked();
    }
    @And("User already in Mutasi Rekening page")
    public void User_already_in_Mutasi_Rekening_page(){
        Assert.assertEquals(accountTransactionsPage.setAccountTransactionsTitle(), "Mutasi Rekening");
    }
    @Given("User choose 1 Bulan yang lalu as the period")
    public void User_choose_1_Bulan_yang_lalu_as_the_period(){
        accountTransactionsPage.ChoosePeriodButtonClicked();
        accountTransactionsPage.setSatuBulanPeriod();
    }
    @Then("User Click Cari button")
    public void User_Click_Cari_button(){
        accountTransactionsPage.cariButtonClicked();
    }
    @Given("User choose 3 Minggu yang lalu as the period")
    public void User_choose_3_minggu_yang_lalu_as_the_period() {
        accountTransactionsPage.ChoosePeriodButtonClicked();
        accountTransactionsPage.setTigaMingguPeriod();
    }
    @Given("User choose 2 Minggu yang lalu as the period")
    public void User_choose_2_minggu_yang_lalu_as_the_period() {
        accountTransactionsPage.ChoosePeriodButtonClicked();
        accountTransactionsPage.setDuaMingguPeriod();
    }
    @Given("User choose 1 Minggu yang lalu as the period")
    public void User_choose_1_minggu_yang_lalu_as_the_period() {
        accountTransactionsPage.ChoosePeriodButtonClicked();
        accountTransactionsPage.setSatuMingguPeriod();
    }
    @And("User see or hear account transactions")
    public void User_see_or_hear_account_transactions(){
        accountTransactionsPage.mutasiTableDisplayed();
    }

}
