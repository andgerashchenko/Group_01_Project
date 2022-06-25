package com.cydeo.vytrack_project.US2.LoginUtil;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginCredentials {
    public static void loginVyTrackTruckDriver (){

        Driver.getDriver().get(ConfigReader.getProperty("env2"));


        WebElement userNameBox = Driver.getDriver().findElement(By.id("prependedInput"));

        userNameBox.sendKeys(ConfigReader.getProperty("user_sm"));

        WebElement passwordBox = Driver.getDriver().findElement(By.id("prependedInput2"));
        passwordBox.sendKeys(ConfigReader.getProperty("password2"));

        WebElement loginBox = Driver.getDriver().findElement(By.id("_submit"));
        loginBox.click();

    }

    public static void loginVyStoreManager (){

        Driver.getDriver().get(ConfigReader.getProperty("env2"));


        WebElement userNameBox = Driver.getDriver().findElement(By.id("prependedInput"));
        userNameBox.sendKeys(ConfigReader.getProperty("user_sm"));

        WebElement passwordBox = Driver.getDriver().findElement(By.id("prependedInput2"));
        passwordBox.sendKeys(ConfigReader.getProperty("password2"));

        WebElement loginBox = Driver.getDriver().findElement(By.id("_submit"));
        loginBox.click();

    }

    public static void loginVySalesManager (){

        Driver.getDriver().get(ConfigReader.getProperty("env2"));


        WebElement userNameBox = Driver.getDriver().findElement(By.id("prependedInput"));
        userNameBox.sendKeys(ConfigReader.getProperty("user_sales"));

        WebElement passwordBox = Driver.getDriver().findElement(By.id("prependedInput2"));
        passwordBox.sendKeys(ConfigReader.getProperty("password2"));

        WebElement loginBox = Driver.getDriver().findElement(By.id("_submit"));
        loginBox.click();

    }
}
