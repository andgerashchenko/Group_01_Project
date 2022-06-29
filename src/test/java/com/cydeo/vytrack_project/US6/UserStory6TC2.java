package com.cydeo.vytrack_project.US6;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UserStory6TC2 {
    /*
        AC2: Store manager should be able to create Vehicle cost

        Given Store manager should be able to access Vehicle Costs page
        And hover over on Fleet module
        And  click on Vehicle Cost
        When click  Create Vehicle Cost
        And fill in the type,total price,and Cost description
        Then click Save and Close

         */
    @Test
    public void store_manager_see_all_Vehicle_information() throws InterruptedException {
        Login.store_manager_login();
        Thread.sleep(2000);
        WebElement fleetModule = Driver.getDriver().findElement(By.xpath("//div[@id='main-menu']//ul//li[@class='dropdown dropdown-level-1']//a//span[1]"));
        //WebElement fleetModule = Driver.getDriver().findElement(By.xpath//("//div[@id='main-menu']//ul//li[@class='dropdown dropdown-level-1']//a//span[1]"));
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetModule).perform();
        Thread.sleep(3000);
        WebElement  vehicleCost=Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Costs']"));
        vehicleCost.click();
        Thread.sleep(3000);
        ////div/a[@title='Create Vehicle Costs']

        WebElement createVehicleCostBut= Driver.getDriver().findElement(By.xpath("//a[@title='Create Vehicle Costs']"));
        createVehicleCostBut.click();
        Thread.sleep(5000);
        WebElement general=Driver.getDriver().findElement(By.xpath("//a[.='General']"));
        general.click();
        Thread.sleep(5000);
        WebElement typeDropDownBut=Driver.getDriver().findElement(By.xpath("//div[starts-with(@id,'s2id_custom_')]"));
        //typeDropDownBut.click();
        Thread.sleep(5000);

        WebElement totalPriceBut=Driver.getDriver().findElement(By.xpath("//div[@class='controls']/input[starts-with(@id,'custom_entity_t')]"));
        totalPriceBut.sendKeys("");
        Thread.sleep(5000);
        WebElement date=Driver.getDriver().findElement(By.xpath("//input[contains(@id,'date_selector')]"));
        //date.click();

        WebElement costDescription= Driver.getDriver().findElement(By.xpath("//div[@class='controls']/textarea[contains(@id,'custom_e')]"));
        //div[@class='btn-group pull-right']/button[@type='submit']
        Thread.sleep(3000);


        WebElement saveandclose=Driver.getDriver().findElement(By.xpath("//a[contains(@class,'btn-success')]"));
        saveandclose.click();
        Thread.sleep(3000);
        //ul[@class='dropdown-menu']//button[@type='submit'])[3]
        WebElement saveBut=Driver.getDriver().findElement(By.xpath("(//ul[@class='dropdown-menu']//button[@type='submit'])[3]"));
        saveBut.click();



    }
}
