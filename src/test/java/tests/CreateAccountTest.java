package tests;

import data.PrepareNewAccountData;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import modals.NewAccountModal;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.LoginPage;

public class CreateAccountTest extends BaseTest {
    private static final Logger LOGGER = LogManager.getLogger(CreateAccountTest.class.getName());

    @Test
    @Description("create new account")
    @Severity(SeverityLevel.NORMAL)
    public void createAccountTest() {
        LoginPage loginPage = new LoginPage(driver);
        LOGGER.info(String.format("Page %s initialized", LoginPage.class.getName()));
        loginPage.loginToSalesForce();
        LOGGER.info(String.format("Page %s opened", LoginPage.class.getName()));
        LOGGER.info("Input PASSWORD and USERNAME");
        AccountsPage accountsPage = new AccountsPage(driver);
        LOGGER.info(String.format("Page %s initialized", AccountsPage.class.getName()));
        LOGGER.info(String.format("Created %s", NewAccountModal.class.getName()));
        NewAccountModal accountModal = PrepareNewAccountData.getValidData();
        accountsPage
                .openAccountsPage()
                .openNewAccountModal()
                .fillInAccountForm(accountModal);
        LOGGER.info(String.format("Filled data %s", NewAccountModal.class.getName()));
        Assert.assertEquals(accountModal.getAccountName(), accountsPage.receiveNewAccountName(), "the names don't match");
        LOGGER.info("Checked the name of the new account is displayed");
    }
}