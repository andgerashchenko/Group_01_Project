package com.cydeo.vytrack_project.US2;

import com.cydeo.utilities.Driver;
import com.cydeo.vytrack_project.US2.LoginUtil.LoginCredentials;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario1_AC5 {

    // 5.Verify that Store manager should be able to add event

    @Test
    public void add_event_test() throws InterruptedException {

        LoginCredentials.loginVyStoreManager();

        Thread.sleep(3000);

        WebElement fleetMenu = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetMenu.click();

        Thread.sleep(3000);

        WebElement vehicles = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        vehicles.click();

        Thread.sleep(4000);
        WebElement anyCar = Driver.getDriver().findElement(By.xpath("//tbody[@class='grid-body']"));
        anyCar.click();

        Driver.getDriver().findElement(By.xpath("//a[contains(@title,'Add an event')]")).click();

        WebElement titleBox = Driver.getDriver().findElement(By.xpath("//input[@data-name='field__title']"));
        titleBox.sendKeys("Mr.");

        Thread.sleep(3000);

        WebElement organizerName = Driver.getDriver().findElement(By.xpath("//input[@data-name='field__organizer-display-name']"));
        organizerName.sendKeys("James Bond");

        Thread.sleep(2000);
        WebElement email = Driver.getDriver().findElement(By.xpath("//input[@data-name='field__organizer-email']"));
        email.sendKeys("123@gm.com");

        Driver.getDriver().findElement(By.xpath("//button[.='Save']")).click();

        WebElement newEdit = Driver.getDriver().findElement(By.xpath("//div[@class='accordion-heading clearfix'][1]"));
        Assert.assertTrue(newEdit.isDisplayed());

    }

}
