package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownList {
    private static final String LIST_XPATH = "//div[contains(@class, 'modal-body')]//span[text()='%s']//parent::span//following-sibling::div//a";
    private static final String OPTION_XPATH = "//div[contains(@class, 'visible')]//a[@title='%s']"; /////доделать
    private WebDriver driver;
    private String labelTest;

    public DropdownList(WebDriver driver, String labelTest) {
        this.driver = driver;
        this.labelTest = labelTest;
    }

    public void selectOptionInList(String option) {
        String ListFinalXpath = String.format(LIST_XPATH, labelTest);
        driver.findElement(By.xpath(ListFinalXpath)).click();
        String optionFinalXpath = String.format(OPTION_XPATH, option);
        driver.findElement(By.xpath(optionFinalXpath)).click();
    }
}