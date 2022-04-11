package com.cybertek.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    /*
webDriverFactory class:
is used to create WebDriver(Selenium) object and return it.
it will open the browser and maximize it
Mehtod:
getDriver(String browser tyep)
It will check browser and return obejct
if browserType is "chrome"
it will set up chrome driver
open browser,
     */
    public static WebDriver getDriver(String browserType) {

        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else {
            System.out.println("INVALID BROWSER TYPE = " + browserType);
            return null;
        }

    }
}
