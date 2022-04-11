package com.cybertek.tests.day11_alerts_iframe_windows;

import com.cybertek.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindowsExampleTest {
    String url = "http://practice.cybertekschool.com/windows";
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get(url);
    }

    @Test
    public void windowsTest() {
        String mainWindowHandles = driver.getWindowHandle();


        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Count of windows is " + windowHandles.size());
        System.out.println("window hand" + windowHandles);

        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            System.out.println("Current window tittle " + driver.getTitle());
        }

        WebElement h3Elem = driver.findElement(By.xpath("//h3"));

        System.out.println("H3 text " + h3Elem.getText());

        driver.switchTo().window(mainWindowHandles);

        System.out.println("Title after switching to " + driver.getTitle());


    }


    @Test
    public void demoQAMultipleWindows(){
        driver.get("https://demoqa.com/browser-windows");
        WebElement newTab = driver.findElement(By.id("tabButton"));
        WebElement newWindow = driver.findElement(By.id("windowButton"));
        WebElement newWindowText = driver.findElement(By.id("messageWindowButton"));

        newTab.click();
        newWindow.click();
        newWindowText.click();

        System.out.println("Tittle of main/ parent page = " + driver.getTitle());
        // Store parent window handle id in a variable
        String parentWindow = driver.getWindowHandle();
        // store all window handle ids in to a set
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("Total window count " + allWindowHandles.size());

        




    }


}
