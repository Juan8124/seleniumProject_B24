package com.cybertek.tests.day17_upload_js_executer;

import com.cybertek.tests.TestBase;
import com.cybertek.util.BrowserUtils;
import com.cybertek.util.ConfigurationReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JavaScriptExecutorTest extends TestBase {

    @Test
    public void alertExampleTest() {
        //down casting from WebDriver to javaScriptExecutor interface
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // running javaScript alert command
        js.executeScript("alert('hello hello')");
        BrowserUtils.sleep(3);

        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text = " + alert.getText());
        alert.accept();
    }

    @Test
    public void scrollTest() {
        driver.get(ConfigurationReader.getProperty("scroll.url"));

        JavascriptExecutor js = (JavascriptExecutor) driver;


        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0,5000)");
            BrowserUtils.sleep(2);
        }

    }


}
