package com.cybertek.tests.day13_faker_practice_browserutil_properties;

import com.cybertek.util.BrowserUtils;
import com.cybertek.util.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/*
Parent class for RegistrationsFormTest
Created by: Juan Sanchez
 */
public class RegistrationFormTestBase {

    String url = " http://practice.cybertekschool.com/registration_form";
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterMethod
    public void tearDown(){
        BrowserUtils.sleep(3);
        driver.quit();
    }


}
