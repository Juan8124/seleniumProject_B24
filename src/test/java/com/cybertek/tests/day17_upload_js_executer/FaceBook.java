package com.cybertek.tests.day17_upload_js_executer;

import com.cybertek.tests.TestBase;
import com.cybertek.util.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FaceBook extends TestBase {

    @Test
    public void faceBookNoSendKeys(){
        driver.get(ConfigurationReader.getProperty("facebook.url"));
        WebElement email = driver.findElement(By.id("email"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='hello@gmail.com'",email);

        WebElement password = driver.findElement(By.id("pass"));
        js.executeScript("arguments[0].value='helloworld'",password);
    }
}

