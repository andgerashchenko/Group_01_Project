package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
TC : Create utility methods for CRM_Utilities class
1. Create a new method for login
2. Create a method to make CRM Login test logic re-usable 3. When method is called, it should simply login
This method should have at least 2 overloaded versions.

Method #1 info:
• Name: login_crm()
• Return type: void
• Arg1: WebDriver

Method #2 info:
• Name: login_crm()
• Return type: void
• Arg1: WebDriver
• Arg2: String username
• Arg3: String password
 */
public class CRM_Utilities {
    public static void login_crm(WebDriver driver){
        driver.get("https://login2.nextbasecrm.com/");
        String username = "helpdesk2@cybertekschool.com";
        String password = "UserUser";
        driver.findElement(By.cssSelector("input[name='USER_LOGIN']")).sendKeys(username);
        driver.findElement(By.cssSelector("input[name='USER_PASSWORD']")).sendKeys(password);
        driver.findElement(By.cssSelector("input[value='Log In']")).click();
    }
    public static void login_crm(WebDriver driver, String username, String password){
        driver.get("https://login2.nextbasecrm.com/");
        driver.findElement(By.cssSelector("input[name='USER_LOGIN']")).sendKeys(username);
        driver.findElement(By.cssSelector("input[name='USER_PASSWORD']")).sendKeys(password);
        driver.findElement(By.cssSelector("input[value='Log In']")).click();
    }

}
