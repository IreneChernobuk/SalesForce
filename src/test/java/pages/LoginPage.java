package pages;

import contains.Credentials;
import contains.Urls;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.CreateAccountTest;

public class LoginPage extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(LoginPage.class.getName());
    @FindBy(id = "username")
    private WebElement usernameInput;
    @FindBy(id = "password")
    private WebElement passwordInput;
    @FindBy(id = "Login")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginToSalesForce() {
        LOGGER.debug(String.format("Attempt to open: %s", Urls.SALES_FORCE_TO_LOGIN));
        driver.get(Urls.SALES_FORCE_TO_LOGIN);
        LOGGER.debug(String.format("Input USERNAME %s", Credentials.USERNAME));
        usernameInput.sendKeys(Credentials.USERNAME);
        LOGGER.debug(String.format("Input PASSWORD %s", Credentials.PASSWORD));
        passwordInput.sendKeys(Credentials.PASSWORD);
        LOGGER.debug(String.format("Attempt to click element: %s", loginButton));
        loginButton.click();
    }
}