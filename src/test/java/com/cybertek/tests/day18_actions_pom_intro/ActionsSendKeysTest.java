package com.cybertek.tests.day18_actions_pom_intro;

import com.cybertek.tests.TestBase;
import com.cybertek.util.BrowserUtils;
import com.cybertek.util.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ActionsSendKeysTest extends TestBase {

    @Test
    public void scrollWithKeysTest() {

        driver.get(ConfigurationReader.getProperty("practice.base.url"));

        WebElement cbSchoolLink = driver.findElement(By.linkText("Cybertek School"));
        actions.moveToElement(cbSchoolLink).perform();

        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();
        BrowserUtils.sleep(2);

        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
    }

    @Test
    public void rightClickTest() {
        driver.get(ConfigurationReader.getProperty("practice.base.url"));
        WebElement ab = driver.findElement(By.linkText("A/B Testing"));

        actions.contextClick(ab).perform();
        BrowserUtils.sleep(1);
        actions.sendKeys(Keys.ARROW_RIGHT,Keys.ARROW_RIGHT).perform();
        BrowserUtils.sleep(1);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        BrowserUtils.sleep(1);
        actions.sendKeys(Keys.ARROW_DOWN).perform();

    }

}
