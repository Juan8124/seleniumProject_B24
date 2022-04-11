package com.cybertek.tests.day05_xpath_css_isdisplayed;

import com.cybertek.util.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class WebDriverFactoryTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");

        driver.close();
        Thread.sleep(1000);

        WebDriver driver2 = WebDriverFactory.getDriver("chrome");
        driver2.get("https://www.google.com");

        driver2.close();
        Thread.sleep(1000);

        WebDriver driver3 = WebDriverFactory.getDriver("chrome");
        driver3.get("https://www.cydeo.com");

        driver3.quit();
    }
}
