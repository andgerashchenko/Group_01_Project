package com.cydeo.vytrack_project.US6;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login {

    public static void truck_driver_login(){

        Driver.getDriver().get(ConfigReader.getProperty("env2"));

        WebElement driverLoginUsernameInput = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']"));
        driverLoginUsernameInput.sendKeys(ConfigReader.getProperty("user_td"));

        WebElement driverLoginPasswordInput = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']"));
        driverLoginPasswordInput.sendKeys(ConfigReader.getProperty("password2"));

        WebElement logInButton = Driver.getDriver().findElement(By.xpath("//button[@id='_submit']"));
        logInButton.click();

    }
    @Test
    public static void sales_manager_login(){
        Driver.getDriver().get(ConfigReader.getProperty("env2"));

        WebElement salesUsernameInput = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']"));
        salesUsernameInput.sendKeys(ConfigReader.getProperty("user_sales"));

        WebElement salesPasswordInput = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']"));
        salesPasswordInput.sendKeys(ConfigReader.getProperty("password2"));

        WebElement logInButton = Driver.getDriver().findElement(By.xpath("//button[@id='_submit']"));
        logInButton.click();

    }
    @Test
    public static void store_manager_login(){
        Driver.getDriver().get(ConfigReader.getProperty("env2"));

        WebElement storeUsernameInput = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']"));
        storeUsernameInput.sendKeys(ConfigReader.getProperty("user_sm"));

        WebElement storePasswordInput = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']"));
        storePasswordInput.sendKeys(ConfigReader.getProperty("password2"));

        WebElement logInButton = Driver.getDriver().findElement(By.xpath("//button[@id='_submit']"));
        logInButton.click();

    }
}
