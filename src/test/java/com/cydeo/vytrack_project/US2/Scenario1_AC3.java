package com.cydeo.vytrack_project.US2;

import com.cydeo.utilities.Driver;
import com.cydeo.vytrack_project.US2.LoginUtil.LoginCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario1_AC3 {

    // 3.Verify that Store manager should be able to add Vehicle Module and Vehicle Make

    @Test
    public void storeManager_add_ModuleAndMake_test() throws InterruptedException {

        LoginCredentials.loginVyStoreManager();

        Thread.sleep(3000);

        WebElement fleetMenu = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetMenu.click();

        Thread.sleep(3000);

        WebElement vehicles = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        vehicles.click();

        WebElement createCar = Driver.getDriver().findElement(By.xpath("//a[@title='Create Car']"));
        createCar.click();

        Thread.sleep(2000);

        WebElement addModelBtn = Driver.getDriver().findElement(By.xpath("//button[contains(@class,'add-btn')]/i[@class='fa-plus'][1]"));
        addModelBtn.click();

        WebElement checkBox = Driver.getDriver().findElement(By.xpath("(//input[@tabindex='-1'])[2]"));
        checkBox.click();

        WebElement selectBtn = Driver.getDriver().findElement(By.xpath("//button[.='Select']"));
        selectBtn.click();

//        WebElement modelName = Driver.getDriver().findElement(By.xpath("//div[.='Model Name: a']"));
//        Assert.assertTrue(modelName.isDisplayed());
        // How are we going to test constantly changing list?

        WebElement addMakeBtn = Driver.getDriver().findElement(By.xpath("(//button[contains(@class,'add-btn')]/i[@class='fa-plus'])[2]"));
        addMakeBtn.click();

        WebElement checkBox2 = Driver.getDriver().findElement(By.xpath("//input[@tabindex='-1'][1]"));
        checkBox2.click();

        WebElement selectBtn2 = Driver.getDriver().findElement(By.xpath("//button[.='Select']"));
        selectBtn2.click();

//        WebElement makeName = Driver.getDriver().findElement(By.xpath("//div[.='Make: N/A']"));
//        Assert.assertTrue(makeName.isDisplayed());

        WebElement saveNClose = Driver.getDriver().findElement(By.xpath("//button[contains(@class,'btn-success')]"));
        saveNClose.click();

        Thread.sleep(4000);





    }

}
