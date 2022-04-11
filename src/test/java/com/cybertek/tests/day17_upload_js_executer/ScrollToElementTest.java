package com.cybertek.tests.day17_upload_js_executer;

import com.cybertek.tests.TestBase;
import com.cybertek.util.BrowserUtils;
import com.cybertek.util.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollToElementTest extends TestBase {

    @Test
    public void scrollTest() {
        driver.get(ConfigurationReader.getProperty("tesla.url"));
        WebElement modelyLabel = driver.findElement(By.xpath("(//h1[.='Model Y'])[1]"));
        System.out.println(modelyLabel.getText());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", modelyLabel);
        BrowserUtils.sleep(2);

        WebElement contactLink = driver.findElement(By.xpath("//a[@href='/contact]"));
        js.executeScript("arguments[0].scrollIntoView(true)",contactLink);

    }
}
