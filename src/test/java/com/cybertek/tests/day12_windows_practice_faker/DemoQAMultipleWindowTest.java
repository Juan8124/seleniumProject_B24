package com.cybertek.tests.day12_windows_practice_faker;

import com.cybertek.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DemoQAMultipleWindowTest {

    String url = "https://demoqa.com/browser-windows";
    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(url);
    }
    /*
    click on new window button
    locate  switch to new window
    locate and print the message
    close the new window
    go back to main window
     */


    @Test
    public void newWindowTest() {

        WebElement newWindow = driver.findElement(By.id("windowButton"));
        newWindow.click();
        System.out.println("New Window text " + newWindow.getText());
        Set<String> windowHandleset = driver.getWindowHandles();
        String ParentWindowHandle = driver.getWindowHandle();// store current window handle

        for (String windowHandle : windowHandleset) {
            if (!windowHandle.equals(ParentWindowHandle))
                driver.switchTo().window(windowHandle);
        }


        WebElement header = driver.findElement(By.id("sampleHeading"));
        System.out.println("Header Text from new Window " + header.getText());

        driver.close();
        driver.switchTo().window(ParentWindowHandle);
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
