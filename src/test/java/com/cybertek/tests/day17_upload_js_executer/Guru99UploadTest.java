package com.cybertek.tests.day17_upload_js_executer;

import com.cybertek.tests.TestBase;
import com.cybertek.util.BrowserUtils;
import com.cybertek.util.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Guru99UploadTest extends TestBase {

    @Test
    public void guruUpLoadTest() {

        driver.get(ConfigurationReader.getProperty("guru99upload.url"));

        WebElement chooseFileBtn = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
        WebElement checkBoxBtn = driver.findElement(By.xpath("//input[@id='terms']"));
        WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submitbutton']"));

        chooseFileBtn.sendKeys(System.getProperty("user.home") + "/Downloads/some-file.txt");
        checkBoxBtn.click();
        submitBtn.click();

        BrowserUtils.sleep(3);
        // verify uolaod success by
        WebElement resultMsg = driver.findElement(By.id("res"));
        Assert.assertEquals(resultMsg.getText(),"1 file\n" +
                "has been successfully uploaded.");
    }


}
