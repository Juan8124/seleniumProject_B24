package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        // set up the browser driver

        WebDriverManager.chromedriver().setup();

        // Open browser
        WebDriver driver = new ChromeDriver();

        // navigate to test the home page

        driver.get("https://www.tesla.com");

        // navigate back. similar to clicking back button on browser

        driver.navigate().back();
        // pause the code. code will sleep/ wait


         // navigate forward
        driver.navigate().forward();
        Thread.sleep(1000);

        // refresh the page
        driver.navigate().refresh();
        Thread.sleep(1000);
        // naviaget to etys homepage
        driver.get("https://www.bestbuy.com");
// print title of the page
        System.out.println("Current title: " + driver.getTitle());

        driver.quit();


    }
}
