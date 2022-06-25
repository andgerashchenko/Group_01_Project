package com.cydeo.vytrack_project.US2;

import com.cydeo.utilities.Driver;
import com.cydeo.vytrack_project.US2.LoginUtil.LoginCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario2_AC2 {

    // 2. Verify that Store manager should be able to cancel a car

    @Test
    public void storeManager_cancel_car_test() throws InterruptedException {

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

        Thread.sleep(4000);

        WebElement cancelBtn = Driver.getDriver().findElement(By.xpath("//a[@title='Cancel']"));
        cancelBtn.click();






    }




}
