package com.cybertek.tests.day02_browser_level_operations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTittleAndUrlAndSource {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        String url = "https://www.etsy.com";

        WebDriver driver = new ChromeDriver();

        driver.get(url);

// read the title of the page and print out
        System.out.println("Title: " + driver.getTitle());
        // store the title into a String variable
        String etsyTitle = driver.getTitle();
        
        System.out.println("etsyTitle = " + etsyTitle); // short cut is soutv
// read the url of the current page
        System.out.println("Current url: " +  driver.getCurrentUrl());
        
// store the url into a String variable currenturl
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        // read page source and print it
        System.out.println("HTML page source: " + driver.getPageSource());
        
        // Store the source code inot a variables then print the char count

        String sourceChar = driver.getPageSource();
        System.out.println( "Length*** " +sourceChar.length());

        // close the browser: driver.close(), driver.quit() quit is more powerfull
        Thread.sleep(3000);
        driver.quit();
    }
}
