package com.cydeo.next_base_crm_automation_project;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US2SendMessage {

    static void sendMessage(String username) {
        String expectedResult = username + "_message_test";
        Driver.getDriver().get(ConfigReader.getProperty("env1"));
        WebElement login = Driver.getDriver().findElement(By.name("USER_LOGIN"));
        login.clear();
        login.sendKeys(ConfigReader.getProperty(username));
        Driver.getDriver().findElement(By.name("USER_PASSWORD")).sendKeys(ConfigReader.getProperty("password"), Keys.RETURN);
        Driver.getDriver().findElement((By.xpath("//span[@id='feed-add-post-form-tab-message']/span"))).click();
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        Driver.getDriver().findElement(By.xpath("//html//body")).sendKeys(expectedResult);
        Driver.getDriver().switchTo().defaultContent();
        Driver.getDriver().findElement(By.id("blog-submit-button-save")).click();
        String actualResult = Driver.getDriver().findElement(By.xpath("//div[starts-with(@id, 'blog_post_body_')]")).getText();
        Assert.assertEquals(actualResult, expectedResult);
        Driver.getDriver().findElement(By.xpath("//span[@id='user-name']")).click();
        Driver.getDriver().findElement(By.xpath("//span[.='Log out']")).click();
    }

    @Test
    public void sendMessageHR1() {
        US2SendMessage.sendMessage("user_crm_hr1");

    }

    @Test
    public void sendMessageHR2() {
        US2SendMessage.sendMessage("user_crm_hr2");

    }
    @Test
    public void sendMessageHD1() {
        US2SendMessage.sendMessage("user_crm_hd1");

    }
    @Test
    public void sendMessageHD2() {
        US2SendMessage.sendMessage("user_crm_hd2");

    }
    @Test
    public void sendMessageMK1() {
        US2SendMessage.sendMessage("user_crm_mk1");

    }
    @Test
    public void sendMessageMK2() {
        US2SendMessage.sendMessage("user_crm_mk2");
        Driver.closeDriver();
    }

}
