package com.cydeo.next_base_crm_automation_project.US_7;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;

public class NextBaseLoginUtil {
    public static void nextBaseLoginUtil(String user){
        Driver.getDriver().get("https://login2.nextbasecrm.com");

        Driver.getDriver().findElement(By.name("USER_LOGIN")).sendKeys(ConfigReader.getProperty(user));
        Driver.getDriver().findElement(By.name("USER_PASSWORD")).sendKeys(ConfigReader.getProperty("password"));
        Driver.getDriver().findElement(By.className("login-btn")).click();
    }
}
