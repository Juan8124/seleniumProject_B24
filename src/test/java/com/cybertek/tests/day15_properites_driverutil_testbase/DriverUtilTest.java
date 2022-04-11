package com.cybertek.tests.day15_properites_driverutil_testbase;

import com.cybertek.util.Driver;
import org.testng.annotations.Test;

public class DriverUtilTest {

    @Test
    public void driverClassTest(){
        Driver.getDriver().get("https://www.google.com");
        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().get("https://www.facebook.com");
    }









































}
