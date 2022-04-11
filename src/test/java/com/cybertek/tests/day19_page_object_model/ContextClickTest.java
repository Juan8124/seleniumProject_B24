package com.cybertek.tests.day19_page_object_model;

import com.cybertek.pages.ContextClickPage;
import com.cybertek.tests.TestBase;
import com.cybertek.util.BrowserUtils;
import com.cybertek.util.ConfigurationReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ContextClickTest extends TestBase {

    @Test
    public void contextClickTest() {
        driver.get(ConfigurationReader.getProperty("context.url"));

        ContextClickPage contextClickPage = new ContextClickPage();

        actions.contextClick(contextClickPage.squareBox).sendKeys(Keys.ARROW_RIGHT, Keys.ARROW_DOWN).perform();

        BrowserUtils.sleep(3);
        Alert alert = driver.switchTo().alert();
        alert.accept();


    }
}
/*
TC #17: Context Click – HOMEWORK
1. Go to https://the-internet.herokuapp.com/context_menu
2. Right click to the box.
3. Alert will open.
4. Accept alert
No assertion needed for this practice.
 */