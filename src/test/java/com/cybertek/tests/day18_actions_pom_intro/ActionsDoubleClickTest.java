package com.cybertek.tests.day18_actions_pom_intro;

import com.cybertek.tests.TestBase;
import com.cybertek.util.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsDoubleClickTest extends TestBase {
    @Test
    public  void doubleClickTest(){
        driver.get(ConfigurationReader.getProperty("w3doubleClick"));
        driver.switchTo().frame("iframeResult");
        WebElement sentence = driver.findElement(By.id("demo"));

        System.out.println(sentence.getText());
        actions.doubleClick(sentence).perform();
        System.out.println("Style of text: " + sentence.getAttribute("style"));
        Assert.assertTrue(sentence.getAttribute("style").contains("red"));
        driver.switchTo().defaultContent();
    }
}
