package com.cydeo.vytrack_project.US8;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US8 {

        @Test
        public void VyTrackUS8() throws InterruptedException {
            Driver.getDriver().get(ConfigReader.getProperty("env2"));
            Driver.getDriver().findElement(By.xpath("//input[@name='_username']")).sendKeys(ConfigReader.getProperty("user_sm"));
            Driver.getDriver().findElement(By.xpath("//input[@name='_password']")).sendKeys(ConfigReader.getProperty("password2"));

            Driver.getDriver().findElement(By.xpath("//button[.='Log in']")).sendKeys(Keys.RETURN);



            WebElement fleet = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
            fleet.click();

            Thread.sleep(4000);

            WebElement vehicleContracts = Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Contracts']"));
            vehicleContracts.click();


        }
    }

