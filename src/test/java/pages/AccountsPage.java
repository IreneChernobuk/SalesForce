package pages;

import contains.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsPage extends BasePage {
    @FindBy(xpath = "//ul[contains(@class, 'branding-actions')]//a[@title='New']")
    private WebElement newButton;

    public AccountsPage(WebDriver driver) {
        super(driver);
    }
    public AccountsPage openAccountsPage(){
        driver.get(Urls.SALES_FORCE_TO_LOGIN.concat(Urls.ACCOUNT_URL));
    return this;
    }
    public NewAccountModalPage openNewAccountModal(){
        newButton.click();
        return new NewAccountModalPage(driver);
    }
}
