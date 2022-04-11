package com.cybertek.tests.day13_faker_practice_browserutil_properties;

import com.cybertek.util.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationFormNegativeTest extends RegistrationFormTestBase{

    @Test
    public void invalidFirstNameTest(){
        // do not enter any value in firstname and clcik on sign up
        // first name is required error msg should be displayed
        WebElement signUp = driver.findElement(By.id("Wooden_spoon"));
        signUp.click();
        BrowserUtils.sleep(2);

        WebElement errMSg = driver.findElement(By.xpath("//small[.='first name is required']"));
        Assert.assertTrue(errMSg.isDisplayed(),"Error message is not displayed");

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("12345");
        BrowserUtils.sleep(2);
        WebElement noNumbersMSG = driver.findElement(By.xpath("//small[.='first name can only consist of alphabetical letters']"));
        Assert.assertTrue(noNumbersMSG.isDisplayed(),"Error message is not displayed");

    }






}
