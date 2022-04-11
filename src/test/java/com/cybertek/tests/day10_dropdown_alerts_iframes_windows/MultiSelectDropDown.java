package com.cybertek.tests.day10_dropdown_alerts_iframes_windows;

import com.cybertek.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MultiSelectDropDown {
    String url = "http://practice.cybertekschool.com/dropdown";
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Test
    public void selectMultipleLanguagesTest(){

        Select languages = new Select(driver.findElement(By.name("Languages")));

        languages.selectByVisibleText("Java");
        languages.selectByVisibleText("JavaScript");
        languages.selectByVisibleText("Python");

        System.out.println("Multi Options " +languages.isMultiple());
        languages.deselectAll();

        for(WebElement each : languages.getOptions()){
            each.click();
        }

        for(WebElement ops: languages.getOptions()){
            System.out.println(ops.getText());

        }

    }









}
