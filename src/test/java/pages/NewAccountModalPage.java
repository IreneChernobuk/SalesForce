package pages;

import elements.DropdownList;
import elements.TextInput;
import modals.NewAccountModal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountModalPage extends BasePage {
    @FindBy(xpath = "//div[contains(@class, 'modal-body')]//span[text()='Account Name']//parent::label//following-sibling::div//input")
    private WebElement account_name_input;
    @FindBy(xpath = "//div[contains(@class, 'modal-body')]//button[@title = 'Save']")
    private WebElement save__button;

    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public void fillInAccountForm(NewAccountModal newAccount) {
        account_name_input.sendKeys(newAccount.getAccountName());
        new TextInput(driver, "Phone").inputText(newAccount.getPhone());
        new DropdownList(driver, "Type").selectOptionInList(newAccount.getType());
        //ToDo add all details
        save__button.click();
    }
}