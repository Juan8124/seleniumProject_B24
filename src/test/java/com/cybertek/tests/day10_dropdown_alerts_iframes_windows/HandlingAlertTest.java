package com.cybertek.tests.day10_dropdown_alerts_iframes_windows;

import com.cybertek.util.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HandlingAlertTest {
    String url = "http://practice.cybertekschool.com/javascript_alerts";
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }


    @Test
    public void jSAlertTest() throws InterruptedException {

        WebElement infoAlertLink = driver.findElement(By.xpath("//*[.='Click for JS Alert']"));
        infoAlertLink.click();
        Thread.sleep(1234);
        Alert infoAlert = driver.switchTo().alert();
        System.out.println("Text of alert: " + infoAlert.getText());
        infoAlert.accept();
    }

    @Test
    public void confirmAlertTest() throws InterruptedException {

        WebElement confirm = driver.findElement(By.xpath("//*[.='Click for JS Confirm']"));
        confirm.click();
        Thread.sleep(1234);
        Alert alert = driver.switchTo().alert();
        System.out.println("Text of alert: " + alert.getText());
        alert.dismiss();


    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }


}
