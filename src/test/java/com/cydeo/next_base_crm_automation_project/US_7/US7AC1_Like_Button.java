package com.cydeo.next_base_crm_automation_project.US_7;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US7AC1_Like_Button {
@Test
    public void US7AC1_Like_Button_Helpdesk(){
    NextBaseLoginUtil.nextBaseLoginUtil("user_crm_hd1");
    Driver.getDriver().findElement(By.xpath("(//a[.='Like'])[2]")).click();
    Driver.getDriver().findElement(By.xpath("(//a[.='Like'])[9]")).click();
    Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//a[.='Like'])[2]/../../..//span[@data-reaction='like']")).isDisplayed());
    Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//a[.='Like'])[9]/../../..//span[@data-reaction='like']")).isDisplayed());
    Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//a[.='Like'])[2]/../../..//div[starts-with(@id, 'bx-ilike-top-users')]")).getText().contains("You"));
    Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//a[.='Like'])[9]/../../..//div[starts-with(@id, 'bx-ilike-top-users')]")).getText().contains("You"));
    Driver.closeDriver();
}
    @Test
    public void US7AC1_Like_Button_Marketing(){
        NextBaseLoginUtil.nextBaseLoginUtil("user_crm_mk1");
        Driver.getDriver().findElement(By.xpath("(//a[.='Like'])[3]")).click();
        Driver.getDriver().findElement(By.xpath("(//a[.='Like'])[11]")).click();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//a[.='Like'])[3]/../../..//span[@data-reaction='like']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//a[.='Like'])[11]/../../..//span[@data-reaction='like']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//a[.='Like'])[3]/../../..//div[starts-with(@id, 'bx-ilike-top-users')]")).getText().contains("You"));
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//a[.='Like'])[11]/../../..//div[starts-with(@id, 'bx-ilike-top-users')]")).getText().contains("You"));
        Driver.closeDriver();
    }
    @Test
    public void US7AC1_Like_Button_HR(){
        NextBaseLoginUtil.nextBaseLoginUtil("user_crm_hr1");
        Driver.getDriver().findElement(By.xpath("(//a[.='Like'])[4]")).click();
        Driver.getDriver().findElement(By.xpath("(//a[.='Like'])[12]")).click();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//a[.='Like'])[4]/../../..//span[@data-reaction='like']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//a[.='Like'])[12]/../../..//span[@data-reaction='like']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//a[.='Like'])[4]/../../..//div[starts-with(@id, 'bx-ilike-top-users')]")).getText().contains("You"));
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//a[.='Like'])[12]/../../..//div[starts-with(@id, 'bx-ilike-top-users')]")).getText().contains("You"));
        Driver.closeDriver();
    }

}
