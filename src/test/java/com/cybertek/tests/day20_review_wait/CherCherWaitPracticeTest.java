package com.cybertek.tests.day20_review_wait;

import com.cybertek.tests.TestBase;
import com.cybertek.util.ConfigurationReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CherCherWaitPracticeTest extends TestBase {

    @BeforeMethod
    public void gotoHomePage() {
        driver.get(ConfigurationReader.getProperty("chercher.url"));
    }

    @Test
    public void waitForAlertTest() {
        WebElement openAlertBtn = driver.findElement(By.id("alert"));
        openAlertBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    @Test
    public void waitForButtonEnabledTest() {
        WebElement button = driver.findElement(By.id("disable"));
        System.out.println(button.isEnabled()); // false
        WebElement enableBtn = driver.findElement(By.id("enable-button"));
        enableBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(button));
        System.out.println(button.isEnabled());
    }

    @Test
    public void waitForCheckBoxIsCheckedTest() {
        
        WebElement checkbox = driver.findElement(By.id("ch"));
        System.out.println("checkbox is checked = " + checkbox.isSelected());

        WebElement enableCheckBoxBtn = driver.findElement(By.id("checkbox"));
        enableCheckBoxBtn.click();

        //wait until checkbox is selected
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeSelected(checkbox));

        System.out.println("checkbox is checked = " + checkbox.isSelected());
    }
    /*
     WebElement checkBox = driver.findElement(By.id("ch"));
        System.out.println("Check box is checled = " + checkBox.isSelected());
        WebElement checkBox2 = driver.findElement(By.id("checkbox"));
        checkBox2.click();
        WebDriverWait wait = new WebDriverWait(driver,60);

        wait.until(ExpectedConditions.elementToBeSelected(checkBox2));
        System.out.println("checkBox = " + checkBox.isSelected());

     */


}

