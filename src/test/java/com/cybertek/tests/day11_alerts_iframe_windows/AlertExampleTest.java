package com.cybertek.tests.day11_alerts_iframe_windows;

import com.cybertek.util.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertExampleTest {

    String url = "http://practice.cybertekschool.com/javascript_alerts";

    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1234);
      driver.quit();
    }

    @Test
    public void jSAlert() throws InterruptedException {
        WebElement alert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        alert.click();
        Thread.sleep(2000);
        Alert alert1 = driver.switchTo().alert();
        System.out.println("Text of alert: " + alert1.getText());
        Assert.assertEquals(alert1.getText(), "I am a JS Alert");
        alert1.dismiss();


    }

    @Test
    public void jSConfirm() throws InterruptedException {
        WebElement alert = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        alert.click();
        Thread.sleep(2000);
        Alert alert2 = driver.switchTo().alert();
        System.out.println("Text of Confirm: " + alert2.getText());
        Assert.assertEquals(alert2.getText(), "I am a JS Confirm");
        alert2.dismiss();
    }

    @Test
    public void jSPrompt() throws InterruptedException {
        WebElement alert = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        alert.click();
        Thread.sleep(2000);
        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("hello world" + Keys.ENTER);
        System.out.println("Text of Prompt: " + alert2.getText());
        Assert.assertEquals(alert2.getText(), "I am a JS prompt");
        alert2.accept();
    }


    @Test
    public void jsConfirmCancelTest() {
        WebElement alert = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        alert.click();
        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.dismiss();
        WebElement text = driver.findElement(By.id("result"));
        System.out.println("text after clicking cancel: " + text.getText());
        Assert.assertEquals(text.getText(), "You clicked: Cancel");
    }
@Test
    public void jSPromptMessageRequest(){
    WebElement alert = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
    alert.click();
    Alert alert2 = driver.switchTo().alert();
    alert2.sendKeys("hello world");
    alert2.accept();

    WebElement text = driver.findElement(By.id("result"));
    System.out.println("Text of prompt: " + text.getText());

    Assert.assertEquals(text.getText(),"You entered: hello world");



}


}
