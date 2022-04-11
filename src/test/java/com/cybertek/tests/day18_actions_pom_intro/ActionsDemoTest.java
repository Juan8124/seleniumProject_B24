package com.cybertek.tests.day18_actions_pom_intro;

import com.cybertek.tests.TestBase;
import com.cybertek.util.BrowserUtils;
import com.cybertek.util.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class ActionsDemoTest extends TestBase {

    @Test
    public void hoverElementTest() {

        driver.get(ConfigurationReader.getProperty("hover.url"));
        Actions actions = new Actions(driver);
        // hover over img1

        for (int i = 0; i < 3; i++) {
            WebElement img1 = driver.findElement(By.xpath("(//img)[1]"));
            actions.moveToElement(img1).perform();
            // BrowserUtils.sleep(1);

            WebElement img2 = driver.findElement(By.xpath("(//img)[2]"));
            actions.moveToElement(img2).perform();

            //  BrowserUtils.sleep(1);

            WebElement img3 = driver.findElement(By.xpath("(//img)[3]"));
            actions.moveToElement(img3).perform();

        }

    }

    @Test
    public void hoverOverGroupOfElm() {
        driver.get(ConfigurationReader.getProperty("hover.url"));
        List<WebElement> img = driver.findElements(By.tagName("img"));
        BrowserUtils.sleep(1);

        for (WebElement imgs : img) {
            actions.moveToElement(imgs).perform();
        }
    }

    @Test
    public void googleFeelingLuckyHoverBtnTest() {
        driver.get(ConfigurationReader.getProperty("google.url"));
        WebElement luckyBtn = driver.findElement(By.id("gbqfbb"));
        WebElement googleSearchBtn = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
        // actions = new Actions(driver);

        for (int i = 1; i < 5; i++) {

            actions.moveToElement(luckyBtn).perform();
            BrowserUtils.sleep(1);
            actions.moveToElement(googleSearchBtn).perform();
            BrowserUtils.sleep(1);
        }


    }


}
