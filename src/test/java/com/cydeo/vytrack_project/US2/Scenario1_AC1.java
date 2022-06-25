package com.cydeo.vytrack_project.US2;

import com.cydeo.utilities.Driver;
import com.cydeo.vytrack_project.US2.LoginUtil.LoginCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario1_AC1 {
//"1.Verify that Store manager should be able to see all vehicle information once
//navigate to Vehicle page

    @Test
    public void create_vehicle_storeManager_test() throws InterruptedException {

        LoginCredentials.loginVyStoreManager();

        Thread.sleep(3000);

        WebElement fleetMenu = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetMenu.click();

        Thread.sleep(3000);

        WebElement vehicles = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        vehicles.click();

        WebElement grid = Driver.getDriver().findElement(By.xpath("//table[contains(@class,'grid table-hover')]"));
        Assert.assertTrue(grid.isDisplayed());


    }
}