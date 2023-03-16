package pages;

import contains.Urls;
import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsPage extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(AccountsPage.class.getName());
    @FindBy(xpath = "//ul[contains(@class, 'branding-actions')]//a[@title='New']")
    private WebElement newButton;
    @FindBy(xpath = "//div[contains(@class, 'windowViewMode-normal')]//lightning-formatted-text[@class = 'custom-truncate']")
    private WebElement accountName;

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open URLS Account page")
    public AccountsPage openAccountsPage() {
        LOGGER.debug(String.format("Attempt to open: %s", Urls.SALES_FORCE_TO_LOGIN.concat(Urls.ACCOUNT_URL)));
        driver.get(Urls.SALES_FORCE_TO_LOGIN.concat(Urls.ACCOUNT_URL));
        return this;
    }

    @Step("Click button NEW")
    public NewAccountModalPage openNewAccountModal() {
        LOGGER.debug(String.format("Attempt to click element: %s", newButton));
        ;
        newButton.click();
        return new NewAccountModalPage(driver);
    }

    @Step("Receive name of the new account")
    public String receiveNewAccountName() {
        LOGGER.debug(String.format("Received new account name: %s", accountName.getText()));
        return accountName.getText();
    }
}