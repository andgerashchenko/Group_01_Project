package com.cydeo.vytrack_project.US6;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC1 {
    /*
       AC1: Store manager  should be able to see all car's cost inforamtions on  the Vehicle Costs page

       Given Store manager should be able to access Vehicle Costs page
       And hover over on Fleet module
       When  click on Vehicle Cost
       Then Store manager  should be able to see all car's cost inforamtions on  the Vehicle Costs page
        */
    @Test
    public void store_manager_see_all_Vehicle_information() throws InterruptedException {
        Login.store_manager_login();
        ////div[@id='main-menu']//ul//li[@class='dropdown dropdown-level-1']//a//span[1]
        Thread.sleep(2000);
        WebElement fleetModule = Driver.getDriver().findElement(By.xpath("//div[@id='main-menu']//ul//li[@class='dropdown dropdown-level-1']//a//span[1]"));
        //WebElement fleetModule = Driver.getDriver().findElement(By.xpath//("//div[@id='main-menu']//ul//li[@class='dropdown dropdown-level-1']//a//span[1]"));
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetModule).perform();
        Thread.sleep(2000);
        WebElement  vehicleCost=Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Costs']"));
        vehicleCost.click();



    }}
