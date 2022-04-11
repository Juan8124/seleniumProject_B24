package com.cybertek.tests.day22_explicitwait_review;

import com.cybertek.pages.WaitUntilVisibleElemPage;
import com.cybertek.tests.TestBase;
import com.cybertek.util.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitUntilElemVisibleTest extends TestBase {

    @Test
    public void waitForWebDriverElem() {
        driver.get(ConfigurationReader.getProperty("selenium.practice.loadWait"));

        WaitUntilVisibleElemPage page = new WaitUntilVisibleElemPage();
        page.clickTimer.click();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(page.webDriverMSG));

        Assert.assertTrue(page.webDriverMSG.isDisplayed());
        System.out.println(page.webDriverMSG.getText());
    }

    @Test
    public void cheapInternetSpeedTest() {


        driver.get(ConfigurationReader.getProperty("speed.testUrl"));
        WebDriverWait wait = new WebDriverWait(driver, 60);
        //wait until Finding message disappears
//        WebElement findingLabel = driver.findElement(By.xpath("//div[.='Finding optimal server...']"));
//        wait.until(ExpectedConditions.invisibilityOf(findingLabel));
        //wait until "change server" link is displayed
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Change Server")));

        //click on Go button <span class="start-text" style="opacity: 1;">Go</span>
        WebElement go = driver.findElement(By.className("start-text"));
        go.click();

        //wait until element with class gauge-speed-needle disappears
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("gauge-speed-text")));
        //<canvas class="gauge-speed-text" width="656px" height="656px"></canvas>
        WebElement speedElem = driver.findElement(By.className("gauge-speed-text"));
        //wait for speedElem to appear / be visible first
        wait.until(ExpectedConditions.visibilityOf(speedElem));

        //wait for speedElem to disappear/ to be invisible
        wait.until(ExpectedConditions.invisibilityOf(speedElem));
    }


}
