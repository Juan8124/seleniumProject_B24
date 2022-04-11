package com.cybertek.tests.day14_webtables_properties;

import com.cybertek.util.SmartBearUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SmartBearProductTest extends SmartBearTestBase {

    @Test
    public void smartBearTest() {
        // login steps
        SmartBearUtils.loginToSmartUtils(driver);

        // get all links and get text
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Count of links " + links.size());

        for (WebElement s : links) {
            System.out.println("Link text " + s.getText());
        }

        SmartBearUtils.appProduct(driver);
    }


}
