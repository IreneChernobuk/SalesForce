package tests;

import data.PrepareNewAccountData;
import modals.NewAccountModal;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.LoginPage;

public class CreateAccountTest extends BaseTest {
    @Test
    public void createAccountTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToSalesForce();
        AccountsPage accountsPage = new AccountsPage(driver);
        NewAccountModal accountModal = PrepareNewAccountData.getValidData();
        accountsPage
                .openAccountsPage()
                .openNewAccountModal()
                .fillInAccountForm(accountModal);
    }
}