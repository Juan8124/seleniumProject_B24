package com.cybertek.tests.day18_actions_pom_intro;

import com.cybertek.tests.TestBase;
import com.cybertek.util.BrowserUtils;
import com.cybertek.util.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EtsySubscribeTest extends TestBase {

    @Test
    public void EtsySubTest() {
       // Faker faker = new Faker();
        driver.get(ConfigurationReader.getProperty("etsy.url"));

        //  JavascriptExecutor js = (JavascriptExecutor) driver;
        BrowserUtils.sleep(2);
        BrowserUtils.scrollDown(5000);
        //  js.executeScript("window.scrollBy(0,10000)");

        BrowserUtils.sleep(1);

        WebElement email = driver.findElement(By.id("email-list-signup-email-input"));
        email.sendKeys(faker.internet().emailAddress());

        WebElement subscribe = driver.findElement(By.xpath("//button[@class='wt-btn wt-input-btn-group__btn']"));
        subscribe.click();
        BrowserUtils.sleep(3);

        WebElement verifyMsg = driver.findElement(By.xpath("//div[@class='wt-alert wt-alert--inline wt-alert--success-01 wt-text-body-01']"));
        Assert.assertEquals(verifyMsg.getText(), "Great! We've sent you an email to confirm your subscription.", "message does not match");
    }


}

/*
Goto Etsy homepage
Scroll down
Generate random email and enter into subscribe box
Click on Subscribe
Verify "Great! We've sent you an email to confirm your subscription." is displayed
+
 */
/*
JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement subscribeEmail = driver.findElement(By.id("email-list-signup-email-input"));
        js.executeScript("arguments[0].scrollIntoView(true)",subscribeEmail);
 */