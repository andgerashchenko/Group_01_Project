package com.cydeo.vytrack_project.US2;

import com.cydeo.utilities.Driver;
import com.cydeo.vytrack_project.US2.LoginUtil.LoginCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario1_AC2 {

    // 2. Verify that Store manager should be able to create a car

    @Test
    public void storeManager_create_car_test() throws InterruptedException {

        LoginCredentials.loginVyStoreManager();

        Thread.sleep(3000);

        WebElement fleetMenu = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetMenu.click();

        Thread.sleep(3000);

        WebElement vehicles = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        vehicles.click();

        Thread.sleep(2000);

        WebElement createCar = Driver.getDriver().findElement(By.xpath("//a[@title='Create Car']"));
        createCar.click();

        Thread.sleep(2000);

        WebElement licenceInput = Driver.getDriver().findElement(By.xpath("//input[@name='custom_entity_type[LicensePlate]']"));
        licenceInput.sendKeys("2357");

        WebElement driverInput = Driver.getDriver().findElement(By.xpath("//input[@name='custom_entity_type[Driver]']"));
        driverInput.sendKeys("Zeynep");

        WebElement locationInput = driverInput.findElement(By.xpath("//input[@name='custom_entity_type[Location]']"));
        locationInput.sendKeys("Toronto");

        WebElement saveNClose = Driver.getDriver().findElement(By.xpath("//button[contains(@class,'btn-success')]"));
        saveNClose.click();



    }

}
