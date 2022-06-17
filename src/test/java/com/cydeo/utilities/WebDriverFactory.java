package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    /*
    / TASK: NEW METHOD CREATION
// Method name : getDriver
// Static method
// Accepts String arg: browserType
//   - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"
     */
    public static WebDriver getDriver(String browser){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = browser.equals("chrome")?new ChromeDriver():browser.equalsIgnoreCase("firefox")?new FirefoxDriver():null;
        return driver;
    }
}
