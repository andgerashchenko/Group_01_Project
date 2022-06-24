package com.cydeo.vytrack_project.US2;

import com.cydeo.utilities.Driver;
import com.cydeo.vytrack_project.US2.LoginUtil.LoginCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario2_AC4 {

    // 4.Verify that sales manager should be able to edit the car.

    @Test
    public void edit_car() throws InterruptedException {

        LoginCredentials.loginVySalesManager();

        Thread.sleep(3000);

        WebElement fleetMenu = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetMenu.click();

        Thread.sleep(3000);

        WebElement vehicles = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        vehicles.click();

        Thread.sleep(4000);
        WebElement anyCar = Driver.getDriver().findElement(By.xpath("//tbody[@class='grid-body']"));
        anyCar.click();

        Thread.sleep(3000);
        WebElement editBtn = Driver.getDriver().findElement(By.xpath("//a[@title='Edit Car']"));
        editBtn.click();

        Thread.sleep(4000);
        WebElement inputName = Driver.getDriver().findElement(By.xpath("//input[@data-name='field__driver']"));
        inputName.click();
        inputName.sendKeys(Keys.COMMAND + "a");
//        Actions select = new Actions(Driver.getDriver());
//        select.doubleClick(inputName).build().perform();
        inputName.clear();
        inputName.sendKeys("James Bond");
        WebElement saveNClose = Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-success action-button']"));
        saveNClose.click();

    }



}
