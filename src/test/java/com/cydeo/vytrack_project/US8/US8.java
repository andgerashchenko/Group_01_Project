package com.cydeo.vytrack_project.US8;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US8 {

    @Test
    public void VyTrackUS8() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("VyTrack"));
        Driver.getDriver().findElement(By.xpath("//input[@name='_username']")).sendKeys(ConfigurationReader.getProperty("VyTrackUsernameStoreManager1"));
        Driver.getDriver().findElement(By.xpath("//input[@name='_password']")).sendKeys(ConfigurationReader.getProperty("VyTrackPassword"));

        Driver.getDriver().findElement(By.xpath("//button[.='Log in']")).sendKeys(Keys.RETURN);

        Thread.sleep(3000);
        WebElement fleet = Driver.getDriver().findElement(By.xpath("//span[@class='title title-level-1']"));
        fleet.click();

        WebElement vehicleContracts = Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Contracts']"));

        vehicleContracts.click();










    }
}