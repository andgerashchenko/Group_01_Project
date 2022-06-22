package com.cydeo.next_base_crm_automation_project;

import com.cydeo.base.TestBase;
import com.cydeo.utilities.ConfigReader;
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
    @org.junit.Test
    public void AC1_login() {
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
    public void AC2_negUserLogin() {

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
    /*
Given user is on Next Base CRM login page
When user enter valid username
And user enter invalid password
And user click on login button
Then user should get error message
     */

        @Test
        public void AC3_negPassLogin() {

            driver.get("http://login2.nextbasecrm.com/");
            String expectedResult = "Incorrect login or password";
            driver.findElement(By.name("USER_LOGIN")).sendKeys(ConfigReader.getProperty("user_crm_hd2"));
            driver.findElement(By.name("USER_PASSWORD")).sendKeys(ConfigReader.getProperty("password")+"123");
            driver.findElement(By.className("login-btn")).click();
            String actualResult = driver.findElement(By.className("errortext")).getText();
            Assert.assertEquals(actualResult, expectedResult);
        }
/*
Given user is on Next Base CRM login page
When user enter empty username
And user enter empty password
And user click on login button
Then user should get error message
 */
    @Test
    public void AC4_negPassUserLogin() {

        driver.get("http://login2.nextbasecrm.com/");
        String expectedResult = "Incorrect login or password";
        driver.findElement(By.name("USER_LOGIN")).sendKeys("");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("");
        driver.findElement(By.className("login-btn")).click();
        String actualResult = driver.findElement(By.className("errortext")).getText();
        Assert.assertEquals(actualResult, expectedResult);
    }


}
