package com.cybertek.tests.day15_properites_driverutil_testbase;

import com.cybertek.tests.TestBase;
import com.cybertek.util.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TechlisticWebTableTest extends TestBase {

    /*
    Go to https://www.techlistic.com/p/demo-selenium-practice.html
    Assert current url contains :techlistic
    print all building names
     */
    @Test
    public void tallBuildingsTableTest() {
        driver.get(ConfigurationReader.getProperty("techlistic.Url"));
        Assert.assertTrue(driver.getCurrentUrl().contains("techlistic"), "title does not contain techlistic");
        List<WebElement> buildingName = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/th"));
        for (WebElement h : buildingName) {
            System.out.println(h.getText());
        }
        WebElement amountOfBuildings = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/td"));
        System.out.println(amountOfBuildings.getText());
    }


}
