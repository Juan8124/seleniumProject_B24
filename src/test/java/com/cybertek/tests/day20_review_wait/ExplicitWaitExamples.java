package com.cybertek.tests.day20_review_wait;

import com.cybertek.tests.TestBase;
import com.cybertek.util.BrowserUtils;
import com.cybertek.util.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitExamples extends TestBase {

    @Test
    public void test() {
        driver.get(ConfigurationReader.getProperty(
                "practice.loading.url"));

        WebElement triggerBtn = driver.findElement(By.xpath("//button[.='Start']"));
        triggerBtn.click();

        WebElement userName = driver.findElement(By.id("username"));
        // in order to use explicat wait uou need to create "Wait" object
        WebDriverWait wait = new WebDriverWait(driver,10);// construrtor expects paremeters
        // 1 driver object, and 2nd waiting time
        // give condition for the element that yo
        wait.until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys(faker.name().username());





        // When we comment out implicit wait to obserse synchronization problem
        // ElementNotInteractableExeption: Element not interactble


    }
    @Test
    public void test2(){
        String url="http://practice.cybertekschool.com/dynamic_controls";

        driver.get(url);

        WebElement removeAdd = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(removeAdd));
        removeAdd.click();

        BrowserUtils.sleep(2);

        WebElement enable = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        WebDriverWait wait2 = new WebDriverWait(driver,10);
        wait2.until(ExpectedConditions.visibilityOf(enable));
        enable.click();

        enable.click();






    }

}
