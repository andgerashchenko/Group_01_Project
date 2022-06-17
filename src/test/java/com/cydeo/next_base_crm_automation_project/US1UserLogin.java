package com.cydeo.next_base_crm_automation_project;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
 Given user is on Next Base CRM login page
 When user enter valid username
 And user enter valid password
 And user click on login button
 Then user should be able to see NextBase CRM Homepage
 */
public class US1UserLogin extends TestBase {
    @Test
    public void login() {
        driver.get("http://login2.nextbasecrm.com/");
        String username = "helpdesk2@cybertekschool.com";
        String password = "UserUser";
        driver.findElement(By.name("USER_LOGIN")).sendKeys(username);
        driver.findElement(By.name("USER_PASSWORD")).sendKeys(password);
        driver.findElement(By.className("login-btn")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//span[@class='user-name']")).getText(), username);

    }

    /*
    Given user is on Next Base CRM login page
When user enter invalid username
And user enter valid password
And user click on login button
Then user should get error message
     */
    @Test
    public void negLogin() {

        driver.get("http://login2.nextbasecrm.com/");
        String username = "helpdesk2@cyberteschool.com";
        String password = "UserUser";
        String expectedResult = "Incorrect login or password";
        driver.findElement(By.name("USER_LOGIN")).sendKeys(username);
        driver.findElement(By.name("USER_PASSWORD")).sendKeys(password);
        driver.findElement(By.className("login-btn")).click();
        String actualResult = driver.findElement(By.className("errortext")).getText();
        Assert.assertEquals(actualResult, expectedResult);
    }


}
