package drivermanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.util.Arrays;

public class FirefoxDriverManager extends DriverManager {

    @Override
    public void createDriver() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        //help
        firefoxProfile.setPreference("--disable-notifications", false);
        firefoxProfile.setPreference("excludeSwitches", String.valueOf(Arrays.asList("disable-popup-blocking")));
        driver = new FirefoxDriver(firefoxProfile);
    }
}