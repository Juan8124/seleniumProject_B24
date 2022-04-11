package com.cybertek.tests.day19_page_object_model;

import com.cybertek.pages.HoverOverPage;
import com.cybertek.tests.TestBase;
import com.cybertek.util.BrowserUtils;
import com.cybertek.util.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverOverTest2 extends TestBase {

    @Test
    public void hoverOverTest() {

        HoverOverPage hoverOverPage = new HoverOverPage();

        driver.get(ConfigurationReader.getProperty("hover.url"));
        actions.moveToElement(hoverOverPage.img1).perform();
        BrowserUtils.sleep(2);

        Assert.assertTrue(hoverOverPage.img1Text.isDisplayed());

        actions.moveToElement(hoverOverPage.img2).perform();
        BrowserUtils.sleep(2);
        Assert.assertTrue(hoverOverPage.img2Text.isDisplayed());

        actions.moveToElement(hoverOverPage.img3).perform();
        BrowserUtils.sleep(2);
        Assert.assertTrue(hoverOverPage.img3Text.isDisplayed());



    }


}
/*
TC #15: Hover Test
1. Go to http://practice.cybertekschool.com/hovers
2. Hover over to first image
3. Assert:
a. “name: user1” is displayed
4. Hover over to second image
5. Assert:
a. “name: user2” is displayed
6. Hover over to third image
7. Confirm:
a. “name: user3” is displayed

 */