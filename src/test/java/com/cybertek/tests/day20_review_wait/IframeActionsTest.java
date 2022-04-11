package com.cybertek.tests.day20_review_wait;

import com.cybertek.tests.TestBase;
import com.cybertek.util.BrowserUtils;
import com.cybertek.util.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframeActionsTest extends TestBase {

    @Test
    public void test() {
        driver.get(ConfigurationReader.getProperty("w3schools.url"));
        driver.switchTo().frame("iframeResult");

        WebElement text = driver.findElement(By.id("demo"));
        BrowserUtils.sleep(2);

        actions.doubleClick(text).perform();
        BrowserUtils.sleep(2);

        String expStyle = "red";
        String actualStyle = text.getAttribute("style");
        Assert.assertTrue(actualStyle.contains(expStyle));


    }


}
