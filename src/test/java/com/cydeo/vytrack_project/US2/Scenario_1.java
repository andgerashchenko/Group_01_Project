package com.cydeo.vytrack_project.US2;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario_1 {
    public class Scenario1_AC4 {
        // 4.Verify that Store manager or sales manager should be able to edit the car.

        public static void loginVyTrackTruckDriver (WebDriver driver){

            Driver.getDriver().get(ConfigurationReader.getProperty("env"));


            WebElement userNameBox = Driver.getDriver().findElement(By.id("prependedInput"));
            userNameBox.sendKeys(ConfigurationReader.getProperty("username"));

            WebElement passwordBox = Driver.getDriver().findElement(By.id("prependedInput2"));
            passwordBox.sendKeys(ConfigurationReader.getProperty("password"));

            WebElement loginBox = Driver.getDriver().findElement(By.id("_submit"));
            loginBox.click();

        }

        public static void loginVyStoreManager (WebDriver driver){

            Driver.getDriver().get(ConfigurationReader.getProperty("env"));


            WebElement userNameBox = Driver.getDriver().findElement(By.id("prependedInput"));
            userNameBox.sendKeys(ConfigurationReader.getProperty("usernamestoremanager"));

            WebElement passwordBox = Driver.getDriver().findElement(By.id("prependedInput2"));
            passwordBox.sendKeys(ConfigurationReader.getProperty("password"));

            WebElement loginBox = Driver.getDriver().findElement(By.id("_submit"));
            loginBox.click();

        }

        @Test
        public void edit_car() throws InterruptedException {

            VYTrackLoginCredentials.loginVyStoreManager(Driver.getDriver());

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







        }}

}
