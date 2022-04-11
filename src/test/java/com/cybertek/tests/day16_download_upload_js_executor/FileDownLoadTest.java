package com.cybertek.tests.day16_download_upload_js_executor;

import com.cybertek.tests.TestBase;
import com.cybertek.util.BrowserUtils;
import com.cybertek.util.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FileDownLoadTest extends TestBase {

    @Test
    public void fileDownLoadTest() throws InterruptedException {
        driver.get(ConfigurationReader.getProperty("download.url"));
        WebElement someFileDownLoad = driver.findElement(By.linkText("some-file.txt"));
        someFileDownLoad.click();
        BrowserUtils.sleep(2);

        // verify that file is downloaded
        String filePath = System.getProperty("user.home")+"/Downloads/some-file.txt";
       System.out.println("filePath = " + filePath);

        //build file object
        File file = new File(filePath);
        System.out.println("File Exists "+file.exists());



        Assert.assertTrue(file.exists(),"File download failed");


        //delete after verificatoin complete


      //  file.delete();

        //File file = new File(System.getProperty("user.home")+ "Downloads/some-file(1).txt");




    }



}
