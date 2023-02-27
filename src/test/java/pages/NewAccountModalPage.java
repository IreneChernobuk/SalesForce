package pages;

import elements.DropdownList;
import elements.TextInput;
import elements.Textarea;
import modals.NewAccountModal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountModalPage extends BasePage {
    @FindBy(xpath = "//div[contains(@class, 'modal-body')]//span[text()='Account Name']//parent::label//following-sibling::div//input")
    private WebElement account_name_input;
    @FindBy(xpath = "//div[contains(@class, 'modal-body')]//button[@title = 'Save']")
    private WebElement save__button;

    @FindBy(xpath = "//div[contains(@class, 'modal-body')]//input[@type='checkbox']")
    private WebElement checkbox;

    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public void fillInAccountForm(NewAccountModal newAccount) {
        account_name_input.sendKeys(newAccount.getAccountName());
        new TextInput(driver, "Phone").inputText(newAccount.getPhone());
        new DropdownList(driver, "Type").selectOptionInList(newAccount.getType());
        new TextInput(driver, "Fax").inputText(newAccount.getFax());
        new TextInput(driver, "Website").inputText(newAccount.getWebsite());
        new TextInput(driver, "Employees").inputText(newAccount.getEmployee());
        new TextInput(driver, "Annual Revenue").inputText(newAccount.getRevenue());
        new DropdownList(driver, "Industry").selectOptionInList(newAccount.getIndustry());
        new Textarea(driver, "Description").inputTextarea(newAccount.getDescription());
        new Textarea(driver, "Billing Street").inputTextarea(newAccount.getBillingStreet());
        new Textarea(driver, "Shipping Street").inputTextarea(newAccount.getShippingStreet());
        new TextInput(driver, "Billing City").inputText(newAccount.getBillingCity());
        new TextInput(driver, "Billing State/Province").inputText(newAccount.getBillingState());
        new TextInput(driver, "Shipping State/Province").inputText(newAccount.getShippingState());
        new TextInput(driver, "Billing Zip/Postal Code").inputText(newAccount.getBillingZip());
        new TextInput(driver, "Billing Country").inputText(newAccount.getBillingCountry());
        new TextInput(driver, "Shipping Zip/Postal Code").inputText(newAccount.getShippingZip());
        new TextInput(driver, "Shipping Country").inputText(newAccount.getShippingCountry());
        checkbox.click();
        //ToDo add all details
        save__button.click();
    }
}