package com.cybertek.tests.day16_download_upload_js_executor;

import com.cybertek.tests.TestBase;
import com.cybertek.util.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUpLoadTest extends TestBase {
    @Test
    public void upLoadFileTest(){
        driver.get(ConfigurationReader.getProperty("upload.url"));
        WebElement upload = driver.findElement(By.id("file-upload"));
        upload.sendKeys(System.getProperty("user.home")+"/Downloads/some-file.txt");

        WebElement uploadBtt = driver.findElement(By.id("file-submit"));
        uploadBtt.click();

    }
}
